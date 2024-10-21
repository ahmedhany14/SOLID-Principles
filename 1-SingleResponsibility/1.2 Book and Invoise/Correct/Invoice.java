public class Invoice {

    // This class is responsible for calculating the total

    public Book book;
    public int quantity;
    public int discount;
    public int taxRate;
    public int total;

    // The responsibility of creating invoices is moved to the Main class
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

}
