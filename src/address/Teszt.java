package address;

import java.util.List;

public class Teszt {
    public static void main(String[] args) {
        Employee employee = new Employee();

        Address address1 = new Address("Hungary", "1116", "Kondorosi", 1);
        Address address2 = new Address("Monaco", "5678", "Main street", 69);

        employee.addAddresses(address1);
        employee.addAddresses(address2);

        List<Address> addresses = employee.getAddresses();

        System.out.println("Az alkalmazottak címei:");
        for (Address address : addresses) {
            System.out.println(address);
        }
    }
}
