package Experiment_6.A;

public class Typist extends Staff {
    int Speed;

    public Typist(int code, String name, String Address, int speed) {
        super(code, name, Address);
        Speed = speed;
    }

    public int getSpeed() {
        return Speed;
    }
}
