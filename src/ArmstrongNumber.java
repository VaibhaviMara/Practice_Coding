class main10{
    public static void main (String[] args){
        int n = 153;
        boolean ans = isArmstrong(n);
        if (ans) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
    private static int countDigit(int n){
        int count = (int)(Math.log10(n)+1);
        return count;
    }
    public static boolean  isArmstrong(int n){
        int count = countDigit(n);
        int sum = 0;
        int copy = n;
        while(n > 0){
            int lastDigit = n % 10;
            sum += Math.pow(lastDigit,count);
            n = n/10;
        }
        if ( sum == copy) return true;
        return false;

    }
}