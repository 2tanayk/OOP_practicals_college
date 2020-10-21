package Experiment_6.A;

public class Regular extends Typist {
    int basic_pay;

    public Regular(int code, String name, String Address, int speed, int basic_pay) {
        super(code, name, Address, speed);
        this.basic_pay = basic_pay;
    }
}
