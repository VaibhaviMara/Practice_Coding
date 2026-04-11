class Main8{
    public static void main(String[] args){
        int n = 891;
        int ans = LargestDigitinNo(n);
        System.out.println(ans);
    }
    public static int LargestDigitinNo(int n){
        int largestDigit = 0;
        while(n >0){
            int lastDigit = n % 10;
            if(lastDigit>largestDigit){
                largestDigit = lastDigit;
            }
            n = n/10;
        }
        return largestDigit;
    }
}