package entity;

public class Address {

    private int aid;
    private String city;
    private String state;

    public Address(int aid, String city, String state) {
        this.aid = aid;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address ID : " + aid + ", City : " + city + ", State : " + state;
    }
}