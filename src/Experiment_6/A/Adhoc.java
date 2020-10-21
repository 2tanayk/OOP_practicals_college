package Experiment_6.A;

public class Adhoc extends Typist {
    private int basic_pay;

    public Adhoc(int code, String name, String Address, int speed, int basic_pay) {
        super(code, name, Address, speed);
        this.basic_pay = basic_pay;
    }

    public int getBasic_pay() {
        return basic_pay;
    }
}
