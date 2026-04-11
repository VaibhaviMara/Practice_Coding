class Main5{
    public static void main(String[] args){
        int n = 678901;
        int ans = countNumber(n);
        System.out.println(ans);
    }
    public static int countNumber(int n){
        if(n == 0) return 1;
        int cnt = 0;
        while(n > 0){
            cnt = cnt + 1;
            n = n/10;
        }
        return cnt;
    }
}