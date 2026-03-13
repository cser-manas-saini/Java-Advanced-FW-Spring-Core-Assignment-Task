package entity;

public class Student {

    private int id;
    private String name;
    private String email;
    private long phone;
    private Address address;

    public Student(int id, String name, String email, long phone, Address address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }
}