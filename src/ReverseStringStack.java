import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class ReverseStringStack {
    public static void reverseString(List<Character> s){
        Stack<Character> stack = new Stack<>();
        for(char c : s){
            stack.push(c);
        }
        for(int i =0; i<s.size();++i){
            s.set(i,stack.pop());
        }
    }
    public static void main(String[]args){
        List<Character> str = new ArrayList<>(Arrays.asList('H','E','L','L','O'));
        ReverseStringStack reverse = new ReverseStringStack();
        ReverseStringStack.reverseString(str);
        for(char c: str){
            System.out.print(c);
        }
    }
}
