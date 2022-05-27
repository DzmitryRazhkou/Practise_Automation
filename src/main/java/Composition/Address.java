package Composition;

public class Address {
    private String Address1;
    private String city;
    private int zipcode;
    private State state;

    public String getAddress1() {
        return Address1;
    }

    public void setAddress1(String address1) {
        Address1 = address1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Address(String address1, String city, int zipcode, State state) {
        Address1 = address1;
        this.city = city;
        this.zipcode = zipcode;
        this.state = state;


    }
}
