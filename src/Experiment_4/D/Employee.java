package Experiment_4.D;

public class Employee {
    private String name;
    private int id;
    private int hrs;

    public Employee(String name, int id, int hrs) {
        this.name = name;
        this.id = id;
        this.hrs = hrs;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getHrs() {
        return hrs;
    }
}
