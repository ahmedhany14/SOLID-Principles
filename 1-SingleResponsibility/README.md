## Explanation of the second example

**Proplem statment**

We have a class called `Book` whihc have the properties of the book, you need to create a solution to calculate the `taxRate` and the `total price`, and then print the data of the book after make your calculations.

## Without (SRP)
    ```Java
    public class Book {
        public String title;
        public String author;
        public int price;
        public int year;

        public Book(String title, String author, int year, int price) {
            this.title = title;
            this.author = author;
            this.year = year;
            this.price = price;
        }
    }

    public class Invoice {
        public Book book;
        public int quantity;
        public int discount;
        public int taxRate;
        public int total;

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
    }
    ```

In this approach, you can see that the second class `Invoice` has 2 responsibilities, `calculateTotal` and `printInvoice`


## With (SRP)
    ```Java
    public class Book {
        public String title;
        public String author;
        public int price;
        public int year;

        public Book(String title, String author, int year, int price) {
            this.title = title;
            this.author = author;
            this.year = year;
            this.price = price;
        }
    }

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
    ```

#### Explanation

* **The Class** `Book` becomes responsible only for creating the book properties

* **The Class** `Invoice` becomes responsible only for calculating the taxes for the books

* **The Class** `PrintInvoice` becomes responsible only for displaying the data


## Why SRP
1. **Improved Maintainability:**
    A class with a single responsibility is easier to understand, debug, and modify.

2. **Code be Testable:**
    When a class has one job, unit tests can be more focused and comprehensive.

3. **The classes will have lower coupling**
    since each one has only one responsibility.

4. **Better Flexibility and Scalability:**
    Classes with a single responsibility can be reused across different parts of an application or even in different projects.

5. **The code be organized** 
