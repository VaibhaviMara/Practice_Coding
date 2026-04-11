class main2{
    public static void main (String[]args){
        String[] arr = {"abc123", "45", "hello 789!"};
        int count = 0;
        for (String s: arr){
            for(int i =0; i<s.length();i++){
                if(Character.isDigit(s.charAt(i))) {
                    count++;
                }
            }

        }
        System.out.println(count);
    }

}
public class CountOnlyNumericCharacters {

}
