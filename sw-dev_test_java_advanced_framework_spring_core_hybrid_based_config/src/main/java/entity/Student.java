package entity;

import java.util.List;

public class Student {

    private int id;
    private String name;
    private Address address;
    private List<Course> courseList;

    public Student(int id, String name, Address address, List<Course> courseList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.courseList = courseList;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public List<Course> getCourseList() {
        return courseList;
    }
}