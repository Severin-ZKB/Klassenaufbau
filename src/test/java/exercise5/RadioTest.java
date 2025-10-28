package exercise5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void on() {
        boolean isON = true;
        assertEquals(true, isON);
    }

    @Test
    void off() {
        boolean isOFF = true;
        assertEquals(true, isOFF);
    }

    @Test
    void increaseVolume() {
        int increaseVolume = 10;
        assertEquals(10, increaseVolume);
    }

    @Test
    void decreaseVolume() {
        int decreaseVolume = 5;
        assertEquals(5, decreaseVolume);
    }

    @Test
    void selectChannel() {
        double selectChannel = 4.2;
        assertEquals(4.2, selectChannel);
    }

    @Test
    void testToString() {
        String toString = "radio";
    }
}