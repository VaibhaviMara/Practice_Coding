class Main4{
    public static void main(String[] args){
        int n = 8897;
        int ans  = reverseNumber(n);
        System.out.println(ans);
    }
    public static int reverseNumber(int n){
        int revNum =0;
        while(n >0){
            int lastDigit = n % 10;
            revNum = (revNum*10)+lastDigit;
            n = n/10;
        }
        return revNum;
    }

}