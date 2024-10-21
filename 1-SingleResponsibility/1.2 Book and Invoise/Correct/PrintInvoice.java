public class PrintInvoice {
    public void printInvoice(Invoice invoice) {
        System.out.println("Title: " + invoice.book.title);
        System.out.println("Author: " + invoice.book.author);
        System.out.println("Year: " + invoice.book.year);
        System.out.println("Price: " + invoice.book.price);
        System.out.println("Quantity: " + invoice.quantity);
        System.out.println("Discount: " + invoice.discount);
        System.out.println("Tax rate: " + invoice.taxRate);
        System.out.println("Total: " + invoice.total);
    }
}
