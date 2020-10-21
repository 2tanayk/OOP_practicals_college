package Experiment_6.A;

public class Teacher extends Staff {
    String Subject;
    String mClass;

    public Teacher(int code, String name, String Address, String subject, String aClass) {
        super(code, name, Address);
        Subject = subject;
        mClass = aClass;
    }

    public String getSubject() {
        return Subject;
    }

    public String getmClass() {
        return mClass;
    }


}
