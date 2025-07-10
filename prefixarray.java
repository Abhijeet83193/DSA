public class prefixarray {

    public static void prefixSum(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int prefixarr[] = new int[numbers.length];
        prefixarr[0] = numbers[0];


        for(int i=1; i<numbers.length;i++){
            prefixarr[i] = prefixarr[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length;i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currentSum = (start==0) ? prefixarr[end] : prefixarr[end] - prefixarr[start - 1];

                if(maxSum<currentSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println("maximum sum of subarray : "+maxSum);

    }

    public static void main(String[] args) {
        int numbers[] = {1,2,4,6,8,10};
        prefixSum(numbers);
    }
}