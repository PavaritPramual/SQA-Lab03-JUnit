package sqa.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ShiftCipherTest {

    private final ShiftCipher cipher = new ShiftCipher();

    @Test
    void testTC01() {
        // Input: "SOFTWARE", key: 3 -> Expected: "VRIWZDUH"
        String result = cipher.shift("SOFTWARE", 3);
        assertEquals("VRIWZDUH", result);
    }
	
    @Test
    void testTC02() {
        // Input: "software", key: 3 -> Expected: "VRIWZDUH"
        String result = cipher.shift("software", 3);
        assertEquals("VRIWZDUH", result);
    }
	
    @Test
    void testTC03() {
        // Input: "HELLO1", key: 3 -> Expected: "KHOOR1"
        String result = cipher.shift("HELLO1", 3);
        assertEquals("KHOOR1", result);
    }
	
    @Test
    void testTC04() {
        // Input: "No1", key: 2 -> Expected: "QR1"
        String result = cipher.shift("No1", 2);
        assertEquals("QR1", result); 
    }
}
