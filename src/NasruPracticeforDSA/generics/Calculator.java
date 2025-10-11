package NasruPracticeforDSA.generics;

public class Calculator<T extends Number> {
    public double square(T num) {
        return num.doubleValue() * num.doubleValue();
    }

}
