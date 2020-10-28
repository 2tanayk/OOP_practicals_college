package Experiment_8.package1;

public class Officer extends Staff {
    protected char grade;

    public Officer(int code, String name) {
        super(code, name);
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }
}
