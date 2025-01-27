package NasruPracticeforDSA;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
//        System.out.println(romanToInt("LVIII"));
//        System.out.println(romanToInt("MCMXCIV"));

    }

    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        Integer n = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (i + 1 < s.length() && map.get(s.charAt(i + 1)) > map.get(c)) {
//                n += map.get(s.charAt(i + 1)) - map.get(c);
//                i = i + 1;
//
//            } else {
//                n += map.get(c);
//            }
//        }


        for (int i = 0; i < s.length(); i++) {
            String current = String.valueOf(s.charAt(i)); // Convert the char to a String
            if (i + 1 < s.length()) {
                String next = String.valueOf(s.charAt(i + 1)); // Convert the next char to a String
                if (map.get(next) > map.get(current)) {
                    n += map.get(next) - map.get(current);
                    i++; // Skip the next character
                    continue;
                }
            }
            n += map.get(current);
        }

        return n;
    }
}
