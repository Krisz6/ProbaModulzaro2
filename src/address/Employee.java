package address;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private List<Address> addresses = new ArrayList<>();

    public List<Address> getAddresses() {
        return addresses;
    }

    public void addAddresses(Address address) {
        addresses.add(address);
    }
}
