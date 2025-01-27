package NasruPracticeforDSA.javaPractice.oOps.Counstructor;

public class Book {

    private String title;
    private String author;
    private double price;


    /*5. Write a Java program to create a class called "Book" with attributes for title,
     author, and ISBN, and methods to add and remove books from a collection.*/

    Book(){
        System.out.println();
       this.title="Unknown";
        this.author="Unknown";
        this.price=0.0;
    }

    Book(String title, String author){
        this.title=title;
        this.author=author;
    }

    Book(String title, String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public static void main(String[] args) {
        Book book = new Book();


        System.out.println("Book title :: "+ book.title);
        System.out.println("Book author :: " + book.author);
        System.out.println("Book price :: "+ book.price);
        System.out.println();

        Book book1= new Book("The Psychology of Money","Morgan Housel");
        System.out.println("Book1 title :: "+ book1.title);
        System.out.println("Book1 author :: "+ book1.author);
        System.out.println("Book1 price :: "+book1.price);
        System.out.println();



        Book book2= new Book("The Psychology of Money","Morgan Housel",200.763552576);

        System.out.println("Book2 title :: "+ book2.title);
        System.out.println("Book2 title :: "+book2.author);
        System.out.println("Book2 title :: "+book2.price);

    }



}
