class Main9{
    public static void main(String[] args){
        int n = 6;
        int ans = Factorial(n);
        System.out.println(ans);

    }
    public static int Factorial(int n){
        if(n == 0) return 1;
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }

}
