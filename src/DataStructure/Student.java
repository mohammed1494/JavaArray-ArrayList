package DataStructure;

public class Student {
    private int stId;
    private String stName;
    private String stDob;

    public Student(){}

    public Student(int stId, String stName, String stDob) {
        this.stId = stId;
        this.stName = stName;
        this.stDob = stDob;
    }


    public int getStId() {
        return stId;
    }

    public void setStId(int stId) {
        this.stId = stId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStDob() {
        return stDob;
    }

    public void setStDob(String stDob) {
        this.stDob = stDob;
    }

}
