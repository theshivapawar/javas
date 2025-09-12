package oops.classes.examples;

class TV {
    boolean isOn;
    short currentChannel;
    byte currentVolume;

    void turnOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }

    void previousChannel() {
        currentChannel--;
    }

    void nextChannel() {
        currentChannel++;
    }

    void changeChannel(short channel) {
        currentChannel = channel;
    }

    void decreaseVolume() {
        currentVolume--;
    }

    void increaseVolume() {
        currentVolume++;
    }
}