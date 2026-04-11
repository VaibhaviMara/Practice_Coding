import java.util.Scanner;

class CountOddDigitsinNumber {
    public  int countOddDigit(int n){
        int oddDigits = 0;
        while(n > 0){
            int lastDigit = n % 10;
            if (lastDigit % 2 != 0){
                oddDigits = oddDigits + 1;
            }
            n = n / 10;
        }
        return oddDigits;
    }
    public static void main(String[]args){
        int n = new Scanner(System.in).nextInt();
        CountOddDigitsinNumber odd = new CountOddDigitsinNumber();
        int ans = odd.countOddDigit(n);
        System.out.println("the count of odd digits"+ ans);
    }
}
