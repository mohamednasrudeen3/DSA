package NasruPracticeforDSA.generics;


class Box<T>{

    private T value;

    public void setValue(T value){
        this.value=value;
    }
    public T getValue(){
        return value;
    }
}
public class Example2 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Nasru");

        System.out.println(stringBox.getValue());

        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(936188204);
        System.out.println(integerBox.getValue());
    }


}
