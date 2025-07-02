/*
 subarrays means that a contigous part of array
 */

public class subarrays {
    public static void subarr(int numbers[]) {
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        for(int start=0; start<numbers.length; start++){
        int sum = 0;
            for(int end=start; end<numbers.length; end++){
                sum += numbers[end];
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println(" => sum is: "+sum);
            }
            System.out.println();
            
            if (sum>maxsum) {
                maxsum = sum;
            }

            if (sum<minsum) {
                minsum = sum;
            }

        }  
        System.out.println("maxsum is: "+maxsum);
        System.out.println("minsum is: "+minsum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        subarr(numbers);
    }
}
