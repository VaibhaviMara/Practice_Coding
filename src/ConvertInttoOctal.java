class main19{
    public static void main(String[] args){
        int n = 123;
        int temp = n;
        String octal = "";
        while(temp > 0){
            int remainder = temp % 8;
            octal = remainder + octal;
            temp = temp / 8;
        }
        System.out.println("Octal rep: " + octal);
    }
}