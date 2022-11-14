package ru.netology.Radio.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test // Следующая радио станция
    public void switchStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test // выше max
    public void setAboveTheMaximumStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        radio.nextStation();

        int expected = 10;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // ниже min
    public void setBelowTheMinimumStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(-3);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // следующая после max
    public void nextAfterTheMaximum() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test //  перед min
    public void nextAfterTheMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test //предыдущая
    public void prevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        radio.prevStation();

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // станция до min
    public void previousAfterTheMinimum() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Изменить громкость
    public void switchVolum() {
        Radio radio = new Radio();

        radio.setCurrentVolume(3);

        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test // выше max
    public void volumeAboveMaximum() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // ниже min
    public void volumeBelowMinimum() {
        Radio radio = new Radio();


        radio.setCurrentVolume(-1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // увеличить громкость
    public void increaseTheVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(97);
        radio.increaseVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test //  max
    public void MaximumVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test //уменьшить громкость
    public void turnDownTheVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(86);
        radio.decreaseVolume();

        int expected = 85;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // нижи минимума
    public void theVolumeIsBelowTheMinimum() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}
