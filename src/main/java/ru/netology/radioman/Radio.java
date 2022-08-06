package ru.netology.radioman;

public class Radio {
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getCurrentStation() {                    //текущее значение станции
        return currentStation;
    }

    public int getCurrentVolume() {                     //текущее значение звука
        return currentVolume;
    }

    public void nextStation() {                         //кнопка "следующая станция"
        if (currentStation < maxStation) {
            setCurrentStation(currentStation + 1);
        } else setCurrentStation(minStation);
    }

    public void prevStation() {                         // кнопка "предидущая станция"
        if (currentStation > minStation) {
            setCurrentStation(currentStation - 1);
        } else setCurrentStation(maxStation);
    }

    public void setCurrentStation(int currentStation) {  // ввод станции пользователем
        if (currentStation > maxStation || currentStation < minStation) {
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

    public void setCurrentVolume(int currentVolume) {  // изменение данных для теста кнопок "+" и "-"
        if (currentVolume < minVolume || currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}

