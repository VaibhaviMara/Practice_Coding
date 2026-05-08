import java.util.Arrays;

class Main14{
    public static void main(String[] args){
        String[]input = {"flower", "flow", "flight"};
        String result =longestCommonPrefix(input);
        System.out.println(result);

    }
    public static String longestCommonPrefix(String[] str){
        StringBuilder ans = new StringBuilder();
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length-1];
        for(int i = 0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i) != last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}