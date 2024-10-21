public class Invoice {
    public Book book;
    public int quantity;
    public int discount;
    public int taxRate;
    public int total;

    // This class is responsible for creating invoices and calculating the total
    // price of the invoice.
    public Invoice(Book book, int quantity, int discount) {
        this.book = book;
        this.quantity = quantity;
        this.discount = discount;
        this.taxRate = 10;
        this.total = calculateTotal();
    }

    public int calculateTotal() {
        return (book.price * quantity) - discount + (book.price * quantity * taxRate / 100);
    }

    // This method is responsible for printing the invoice.
    public void printInvoice() {
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Year: " + book.year);
        System.out.println("Price: " + book.price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount);
        System.out.println("Tax rate: " + taxRate);
        System.out.println("Total: " + total);
    }

    /*
     * This class violates the Single Responsibility Principle
     * it has two responsibilities:
     * 1. Creating invoices and calculating the total price of the invoice.
     * 2. Printing the invoice.
     */
}
