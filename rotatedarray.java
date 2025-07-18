public class rotatedarray {

    public static int indexvalue(int nums[], int target) {
        
        int start = nums[0];
        int end = nums.length-1;

        while (start <= end) {
            int mid = (start + end)/2;
            if (nums[mid] == target) {
            return mid;  
            }
            if (nums[mid]<target) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
            return -1;
        
    }
    public static void main(String[] args) {
        int nums[] = {1};
        int target = 0;
        int result = indexvalue(nums, target);
        System.out.println(result);
    }
}
