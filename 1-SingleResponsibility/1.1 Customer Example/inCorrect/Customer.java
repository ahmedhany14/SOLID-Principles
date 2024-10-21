public class Customer {
    @SuppressWarnings("unused") String name;

    @SuppressWarnings("unused")
    private String email;

    @SuppressWarnings("unused")
    private String phone;

    // Create a constructor,to initialize the fields
    public Customer(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // First responsibility, to save the customer to the database

    public void saveCustomerToDatabase() {
        // Save the customer to the database
        
        /*
         * some logic to save the customer to the database ......
         */

        System.out.println("Customer saved to the database");
    }

    // Second responsibility, to fetch the customer from the database

    public void fetchCustomerFromDatabase() {
        // Fetch the customer from the database

        /*
         * some logic to fetch the customer from the database ......
         */

        System.out.println("Customer fetched from the database");
    }

}
