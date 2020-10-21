package Experiment_6.A;

public class Officer extends Staff {
    char Grade;

    public Officer(int code, String name, String Address, char grade) {
        super(code, name, Address);
        Grade = grade;
    }

    public char getGrade() {
        return Grade;
    }
}
