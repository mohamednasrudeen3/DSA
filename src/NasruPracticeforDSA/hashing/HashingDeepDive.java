package NasruPracticeforDSA.hashing;
import java.util.*;

public class HashingDeepDive {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Apple", 100);
        map.put("Mango", 80);
        map.put("Banana", 60);

        System.out.println(map.get("Apple"));
        int hash = "Apple".hashCode();
        System.out.println("HashCode: " + "Apple".hashCode());
        int index = (16 - 1) & "Apple".hashCode();

    }
}
