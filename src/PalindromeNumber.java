class Main7{
    public static void main ( String[] args){
        int n = 898;
        System.out.println(PalindromeNumber(n));
    }
    public static boolean PalindromeNumber(int n){
        int copy = n;
        int revNum =0;
        while(n>0){
            int lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n = n/10;
        }
        return revNum == copy;
    }
}