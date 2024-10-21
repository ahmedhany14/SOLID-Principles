/*
Only responsible for the customer details, and initialize the fields
 */

public class Customer {
    public String name;
    public String email;
    public String phone;

    // Create a constructor,to initialize the fields
    public Customer(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
