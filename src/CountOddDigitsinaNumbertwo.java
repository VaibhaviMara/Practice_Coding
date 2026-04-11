class Main6{
    public static void main(String[] args){
        int n = 34567;
        int ans = countOddDigits(n);
        System.out.println(ans);

    }
    public static int countOddDigits(int n){
        int count = 0;
        while(n > 0){
            int lastDigit = n % 10;
            if(lastDigit % 2 != 0){
                count = count + 1;
            }
            n = n /10;
        }
        return count;
    }
}