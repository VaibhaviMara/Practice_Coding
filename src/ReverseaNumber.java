class ReverseaNumber {
    public static int reverse(int n){
        int revNum = 0;
        while ( n > 0){
            int lastDigit = n % 10;
            revNum = (revNum * 10) +lastDigit;
            n = n/10;
        }
        return revNum;
    }
    public static void main (String[]args){
        int n = 1112;
        ReverseaNumber rev = new ReverseaNumber();
        int ans = rev.reverse(n);
        System.out.println("Reverse Number is " + ans);
    }
}
