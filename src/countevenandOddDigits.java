class main17{
    public static void main(String[] args){
        int number = 897123455;
        int evenCnt = 0;
        int oddCnt = 0;
        int temp = number;
        while(temp > 0){
            int digit = temp % 10;
            if(digit % 2 == 0){
                evenCnt++;
            }else{
                oddCnt++;
            }
            temp = temp / 10;
        }
        System.out.println("Number:" + number);
        System.out.println("EvenCount: " + evenCnt);
        System.out.println("OddCount: " +oddCnt);

    }
}