import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class reverseStringSwap{
    public static void reverseString(List<Character> s){
        int start = 0;
        int end = s.size()-1;
        System.out.println(end);
        while(start<end){
            char c = s.get(start);
            s.set(start, s.get(end));
            s.set(end, c);
            start++;
            end--;
        }
    }
}

class main1{
    public static void main(String[] args){
        List<Character> str = new ArrayList<>(Arrays.asList('h','e','l','l','o'));
        reverseStringSwap.reverseString(str);
        for(char c : str){
            System.out.print(c);
        }

    }
}
