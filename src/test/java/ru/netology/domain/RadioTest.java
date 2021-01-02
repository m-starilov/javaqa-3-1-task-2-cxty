package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSwitchNextRadioStation(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.nextRadioStation();

        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchNextRadioStationFrom9(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchPrevRadioStation(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.prevRadioStation();

        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchPrevRadioStationFrom0(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        assertEquals(9, radio.getCurrentRadioStation());
    }

}