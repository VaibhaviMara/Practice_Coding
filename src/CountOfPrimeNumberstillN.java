class Main13{
    public static void main(String[] args){
        int n =6;
        int ans = PrimeUpToN(n);
        System.out.println(ans);

    }
    private static boolean isPrime(int n){
        int count =0;
        for(int i =1; i<=n; i++){
            if(n % i == 0){
                count = count + 1;
            }
        }
        if(count == 2)return true;
        return false;
    }
    public static int PrimeUpToN(int n){
        int count =0;
        for(int i =2;i <=n; i++){
            if(isPrime(i))count++;
        }
        return count;
    }
}
