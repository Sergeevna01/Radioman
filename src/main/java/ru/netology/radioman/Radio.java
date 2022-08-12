package ru.netology.radioman;

public class Radio {
    private int maxStation = 35;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int countStation = 10;
    private int currentVolume;
    private int currentStation;

    public Radio(int countStation) {
        this.countStation = countStation;
    }

    public Radio() {

    }

    public int getCurrentStation() {                    //текущее значение станции
        return currentStation;
    }

    public int getCurrentVolume() {                     //текущее значение звука
        return currentVolume;
    }

    public void nextStation() {                         //кнопка "следующая станция"
        if (countStation - 1 <= currentStation) {
            setCurrentStation(minStation);
        } else setCurrentStation(currentStation + 1);
    }

    public void prevStation() {                         // кнопка "предидущая станция"
        if (currentStation <= minStation) {
            setCurrentStation(countStation - 1);
        } else setCurrentStation(currentStation - 1);
    }

    public void setCurrentStation(int currentStation) {  // ввод станции пользователем
        if (currentStation > countStation - 1 || currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseVolume() {         // увеличение громкости "+"
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else currentVolume = maxVolume;
    }

    public void decreaseVolume() {          // уменьшение громкости "-"
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else currentVolume = minVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume || currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}

