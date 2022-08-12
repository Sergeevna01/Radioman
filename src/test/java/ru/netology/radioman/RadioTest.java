package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldSetStation() {
        Radio radio = new Radio(35);
        radio.setCurrentStation(22);
        assertEquals(22, radio.getCurrentStation());
    }

    @Test
    void shouldMaxSetStation() {
        Radio radio = new Radio(35);
        radio.setCurrentStation(35);
        assertEquals(0, radio.getCurrentStation());
    }


    @Test
    void nextStationChange() {     // кнопка "следующая станция"
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void nextStationUpperValue() {   // кнопка "следующая станция"
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void prevStationChange() {    // кнопка "предидущая станция"
        radio.setCurrentStation(9);
        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void prevStationLowerValue() {   // кнопка "предидущая станция"
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation() {        //ввод данных пользователем
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationLowerValue() {    //ввод данных пользователем
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationUpperValue() {    //ввод данных пользователем
        radio.setCurrentStation(25);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeChange() {     // увеличение громкости
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeChangeUpperValue() { // увеличение громкости
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeChangeLowerValue() {   // уменьшение громкости
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeChange() {      // уменьшение громкости
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeMax() {
        radio.setCurrentVolume(119);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeMin() {
        radio.setCurrentVolume(-5);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
