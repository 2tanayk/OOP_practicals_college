package Experiment_8.package1;

public class Regular extends Typist {
    protected int basicPay;
    public Regular(int code, String name) {
        super(code, name);
    }

    public void setBasicPay(int basicPay) {
        this.basicPay = basicPay;
    }

    public int getBasicPay() {
        return basicPay;
    }
}
