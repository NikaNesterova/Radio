public class Radio {
    private int stationNum;
    private int currentStation;
    private int currentVolume;

    public Radio() {
        this.stationNum = 10;
        this.currentStation = 9;
    }

    public Radio(int stationNum) {
        this.stationNum = stationNum;
        this.currentStation = stationNum - 1;
    }

    public int getStationNum() {
        return stationNum;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > stationNum) {
            return;
        }
        currentStation = newStation;

    }

    public void nextStation() {  // Следующая станция
        currentStation++;
        if (currentStation >= stationNum) {
            currentStation = 0;
        }
    }

    public void prevStation() {  // Предыдущая станция
        currentStation--;
        if (currentStation < 0) {
            currentStation = stationNum - 1;
        }
    }


    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        currentVolume = newVolume;

    }

    public void upVolume() {  // Увеличение громкости
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void downVolume() {  // Уменьшение громкости
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}