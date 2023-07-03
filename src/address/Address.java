package address;

public class Address {
    private String country;
    private String postalCode;
    private String street;
    private int floor;

    public Address(String country, String postalCode, String street, int floor) {
        this.country = country;
        this.postalCode = postalCode;
        this.street = street;
        this.floor = floor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", street='" + street + '\'' +
                ", floor=" + floor +
                '}';
    }
}

