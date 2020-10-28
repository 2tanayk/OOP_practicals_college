package Experiment_8.package1;

public class Typist extends Staff {
    protected int speed;

    public Typist(int code, String name) {
        super(code, name);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
