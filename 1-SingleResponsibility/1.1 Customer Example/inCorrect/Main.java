public class Main {

    public static void main(String[] args) {
        // Create a new customer
        Customer customer = new Customer("Ahmed", "ahmed@hotmail.com", "123456789");
        // Save the customer to the database
        customer.saveCustomerToDatabase();

        // Fetch the customer from the database
        customer.fetchCustomerFromDatabase();
    }

}
