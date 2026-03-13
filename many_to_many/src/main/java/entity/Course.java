package entity;

public class Course {

    private int cid;
    private String courseName;

    public Course(int cid, String courseName) {
        this.cid = cid;
        this.courseName = courseName;
    }

    public int getCid() {
        return cid;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Course ID : " + cid + ", Course Name : " + courseName;
    }
}