class Main11{
    public static void main (String[] args){
        int n = 6;
        boolean ans = PerfectNumber(n);
        if(ans) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
    }
    public static boolean PerfectNumber(int n){
        int sum =0;
        for(int i =1; i<n; i++){
            if(n % i == 0){
                sum = sum + i;
            }
        }
        if(sum == n)return true;
        return false;

    }
}