package exercise5;

public class Radio {
    public boolean isOn;
    public int volume;
    public double frequenzy;
    public Radio() {
        this.isOn = isOn;
        this.volume = volume;
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
