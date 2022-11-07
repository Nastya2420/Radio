package ru.netology.Radio.services;

import java.util.Currency;

public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume ;
    private int minVolume = 0;
    private int maxVolume = 100;




    public Radio() {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = minStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = minVolume;
    }
    public int getMinStation() {
        return minStation;
    }
    public int getMaxStation() {
        return maxStation;
    }
    public int getMinVolume() {
        return minVolume;
    }
    public int getMaxVolume() {
        return maxVolume;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentStation(int currentStation) {
        if (minVolume > currentStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (maxStation <= currentStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prevStation() {
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (minVolume > currentVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }


}


