import lombok.Getter;

public class Radio {
    
    @Getter
    private int currentChannel;

    @Getter
    private int currentVolume;

    private int countChannel;

    public Radio() {
        countChannel = 10;
    }

    public Radio(int countChannel) {

        if (countChannel < 0) {
            this.currentChannel = 0;
        } else {
            this.countChannel = countChannel;
        }

    }

    public void next() {
        if (currentChannel < getLast()) {
            currentChannel++;
        } else {
            currentChannel = 0;
        }
    }

    public void prev() {
        if (currentChannel > 0) {
            currentChannel--;
        } else {
            currentChannel = getLast();
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

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel >= 0 && currentChannel <= getLast()) {
            this.currentChannel = currentChannel;
        }
    }

    private int getLast() {
        if (countChannel - 1 >= 0) {
            return countChannel - 1;
        } else {
            return 0;
        }
    }
}