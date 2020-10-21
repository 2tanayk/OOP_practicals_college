package Experiment_6.A;

public class Staff {
    private int code;
    private String name;
    private String Address;

    public Staff(int code, String name, String Address) {
        this.code = code;
        this.name = name;
        this.Address = Address;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }
}
