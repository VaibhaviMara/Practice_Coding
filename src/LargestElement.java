class LargestElement {
    public static int largestElementinArray(int[] N){
        int max = N[0];
        for(int i =0; i<N.length;i++){
            if(N[i]>max){
                max=N[i];
            }
        }
        return max;
    }
    public static void main ( String[]args){
        int[]N = {3,2,1,5,2};
        LargestElement large = new LargestElement();
        System.out.println("The largest element in the array is: " + LargestElement.largestElementinArray(N));
    }

}
