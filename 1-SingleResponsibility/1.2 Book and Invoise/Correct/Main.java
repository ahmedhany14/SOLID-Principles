public class Main {
    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Ahmed Hany", 2021, 100);
        Invoice invoice = new Invoice(book, 1, 100);

        PrintInvoice printInvoice = new PrintInvoice();

        printInvoice.printInvoice(invoice);
    }
}
