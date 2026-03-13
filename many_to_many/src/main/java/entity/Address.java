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

    public int getAid() {
        return aid;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Address ID : " + aid +
               ", City : " + city +
               ", State : " + state;
    }
}