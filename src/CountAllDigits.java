class CountAllDigits {
    public static int countDigit(int n){
        if ( n == 0) return 1;
        int cnt = 0;
        while(n > 0){
            cnt = cnt +1;
            n = n/10;
        }
        return cnt;
    }
}
class main{
    public static void main (String[]args){
        int n = 34456;
        CountAllDigits count =  new CountAllDigits();
        int ans = count.countDigit(n);
        System.out.println("The count of digits in the given number is:" + ans
        );
    }
}
