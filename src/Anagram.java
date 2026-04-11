import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "Eat";
        String s2 = "Tea";
        Map<Character, Integer> map1 = new LinkedHashMap<>();
        Map<Character, Integer> map2 = new LinkedHashMap<>();
        if (s1.length() == s2.length()) {

            for (int i = 0; i < s1.length(); i++) {
                char[] c = s1.toCharArray();
                int length = 1;
                for (int j = i+1; j < s1.length(); j++) {
                    if (c[i] == c[j]) {
                        length++;
                        map1.put(c[i], length);
                    }
                }
            }



        } else {
            System.out.println("Not an anagram as length is not equal");
        }
    }

}
