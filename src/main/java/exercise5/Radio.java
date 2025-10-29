package exercise5;

public class Radio {
    private boolean isOn;
    private int volume;
    private double frequenzy;
    public Radio(boolean isOn, int volume, double frequenzy) {
        this.isOn = isOn;
        this.volume = volume;
        this.frequenzy = frequenzy;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getFrequenzy() {
        return frequenzy;
    }

    public void setFrequenzy(double frequenzy) {
        this.frequenzy = frequenzy;
    }

    public void on() {
        if (isOn == true) {
            System.out.println("Radio is on");
        }
    }
    public void off() {
        if (isOn == false) {
            System.out.println("Radio is off");
        }
    }
    public void increaseVolume() {
        this.volume++;
    }
    public void decreaseVolume() {
        this.volume--;
    }
    public void selectChannel(double frequenzy){
        this.frequenzy = frequenzy;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
