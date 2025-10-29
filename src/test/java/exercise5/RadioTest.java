package exercise5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio;
    @BeforeEach
    void setUp() {
        radio = new Radio(true, 10, 1.5);
    }

    @Test
    void on() {
        radio.on();
        assertTrue(radio.isOn());
    }

    @Test
    void off() {
        radio.off();
        assertTrue(radio.isOn());
    }

    @Test
    void increaseVolume() {
        radio.increaseVolume();
        assertEquals(11, radio.getVolume());
    }

    @Test
    void decreaseVolume() {
        radio.decreaseVolume();
        assertEquals(9 , radio.getVolume());
    }

    @Test
    void selectChannel() {
        radio.getFrequenzy();
        assertEquals(1.5, radio.getFrequenzy());
    }
}