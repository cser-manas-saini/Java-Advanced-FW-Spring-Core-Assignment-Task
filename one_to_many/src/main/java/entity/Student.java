package entity;

import java.util.List;

public class Student {

    private int id;
    private String name;
    private String email;
    private long phone;
    private List<Address> addressList;

    public Student(int id, String name, String email, long phone, List<Address> addressList) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.addressList = addressList;
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

    public List<Address> getAddressList() {
        return addressList;
    }
}