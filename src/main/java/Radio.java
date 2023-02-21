public class Radio {
    private int stationNum;

    public int getStationNum() {
        return stationNum;
    }

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        stationNum = newStation;

    }

    public void nextStation() {  // Следующая станция
        if (stationNum < 9) {
            stationNum = stationNum + 1;
        } else {
            stationNum = 0;
        }
    }

    public void prevStation() {  // Предыдущая станция
        if (stationNum > 0) {
            stationNum = stationNum - 1;
        } else {
            stationNum = 9;
        }
    }

    private int currentVolume;

    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        currentVolume = newVolume;

    }

    public void upVolume() {  // Увеличение громкости
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void downVolume() {  // Уменьшение громкости
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void Volume() {
    }
}