public class Test {

    public static void main(String[] args) {

        String s = "Java is a good programming language";
        String[] sArray = s.split(" ");
        String[] sArray1 = new String[sArray.length];
        for (int i = 0; i < sArray.length; i++) {
            char[] sCharacter = sArray[i].toCharArray();
            int left = 0;
            int right = sCharacter.length - 1;
            while (left < right) {
                char c = sCharacter[left];
                sCharacter[left] = sCharacter[right];
                sCharacter[right] = c;
                left++;
                right--;
            }
            sArray1[i] = String.valueOf(sCharacter);
        }
        for (int i = 0; i < sArray1.length; i++) {
            if (i < sArray.length - 1) {
                System.out.print(sArray1[i] + " ");
            } else {
                System.out.print(sArray1[i]);
            }
        }
    }

}
