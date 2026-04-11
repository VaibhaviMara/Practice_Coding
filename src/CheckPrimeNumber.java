class Main12{
    public static void main (String[] args){
        int n =5;
        boolean ans = isPrime(n);
        if(ans){
            System.out.println(n + "is Prime");
        }else{
            System.out.println(n + "is not Prime");
        }

    }
    public static boolean isPrime(int n){
        if ( n < 2) return false;
        for(int i =2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
