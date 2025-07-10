public class kadanes {

    public static void kadanss(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0; i<numbers.length; i++){
            currentSum += numbers[i];
            
            if (currentSum<0) {
                currentSum=0;
            }
        }
        int sum = Math.max(maxSum, currentSum);
        System.out.println("the max is: "+sum);
    }

    public static void main(String[] args) {
        int numbers[] = {4,-2,-3,5,-1,6};
        kadanss(numbers);
        
    }
}