package Experiment_8.package1;

public class Teacher extends Staff {
    protected String subject;
    protected String mClass;

    public Teacher(int code, String name) {
        super(code, name);
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setmClass(String mClass) {
        this.mClass = mClass;
    }

    public String getSubject() {
        return subject;
    }


    public String getmClass() {
        return mClass;
    }


}
