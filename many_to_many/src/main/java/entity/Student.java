package entity;

import java.util.List;

public class Student {

    private int id;
    private String name;
    private List<Course> courseList;

    public Student(int id, String name, List<Course> courseList) {
        this.id = id;
        this.name = name;
        this.courseList = courseList;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourseList() {
        return courseList;
    }
}