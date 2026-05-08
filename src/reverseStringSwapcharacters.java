class Main16{
    public static void main(String[] args) {
        char[] reverseaString = {'h','e','l','l','o'};
        reverseString(reverseaString);
    }
    public static void reverseString(char[] s){
        int left =0;
        int right = s.length-1;
        while(left<right){
            char c = s[left];
            s[left] = s[right];
            s[right] = c;
            left++;
            right--;
        }
        System.out.println(s);
    }
}