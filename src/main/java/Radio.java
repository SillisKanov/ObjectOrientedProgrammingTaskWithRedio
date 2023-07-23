public class Radio {
    private int currentChannel;
    private int currentVolume;

    public void next() {
        if (currentChannel < 9) {
            currentChannel++;
        } else {
            currentChannel = 0;
        }
    }

    public void prev() {
        if (currentChannel > 0) {
            currentChannel--;
        } else {
            currentChannel = 9;
        }
    }

    public void upVolume() {
        if (currentVolume < 100)
            currentVolume++;
    }

    public void downVolume() {
        if (currentVolume > 0)
            currentVolume--;
    }


    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel >= 0 && currentChannel <= 9) {
            this.currentChannel = currentChannel;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}