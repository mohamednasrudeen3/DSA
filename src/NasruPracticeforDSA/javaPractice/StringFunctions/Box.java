package NasruPracticeforDSA.javaPractice.StringFunctions;/*The Box class is defined with a type parameter T.
This means that T can be any type
(e.g., Integer, String, CustomClass).*/

// Generic class definition
public class Box<T> {
    private T content;

    // Constructor
    public Box(T content) {
        this.content = content;
    }

    // Getter
    public T getContent() {
        return content;
    }

    // Setter
    public void setContent(T content) {
        this.content = content;
    }

    // Method to display content
    public void displayContent() {
        System.out.println("Content: " + content);
    }

    public static void main(String[] args) {
        // Creating a Box for Integer
        Box<Integer> integerBox = new Box<>(123);
        integerBox.displayContent(); // Output: Content: 123

        // Creating a Box for String
        Box<String> stringBox = new Box<>("Hello, Generics!");
        stringBox.displayContent(); // Output: Content: Hello, Generics!

        // Changing the content of the string box
        stringBox.setContent("Updated Content");
        stringBox.displayContent(); // Output: Content: Updated Content

        // Getting the content from the integer box
        Integer intContent = integerBox.getContent();
        System.out.println("Integer Content: " + intContent); // Output: Integer Content: 123
    }
}