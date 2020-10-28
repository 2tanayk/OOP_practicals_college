package Experiment_8.package1;

public class Adhoc extends Typist {
    protected int basicPay;

    public Adhoc(int code, String name) {
        super(code, name);
    }

    public void setBasicPay(int basicPay) {
        this.basicPay = basicPay;
    }

    public int getBasicPay() {
        return basicPay;
    }
}
