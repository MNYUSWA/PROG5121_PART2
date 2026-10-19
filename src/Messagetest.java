package com.mycompany.prog5121_part2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessageTest {

    @Test
    public void testCheckMessageLengthValid() {
        Message msg = new Message("+27839668976", "Hey, let's meet up.", 1);
        assertTrue(msg.checkMessageLength());
    }

    @Test
    public void testCheckMessageLengthInvalid() {
        String longText = "a".repeat(251);
        Message msg = new Message("+27839668976", longText, 1);
        assertFalse(msg.checkMessageLength());
    }

    @Test
    public void testCreateMessageHash() {
        Message msg = new Message("+27839668976", "Meeting at 2pm", 1);
        String hash = msg.createMessageHash();
        assertNotNull(hash);
        assertTrue(hash.contains("MEETING"));
        assertTrue(hash.contains("2PM"));
    }
}
