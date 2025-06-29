import java.util.*;
public class arraymin {
    public static void getarray(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(smallest>arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("smallest element of array : "+smallest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array : ");
        int arr[] = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        getarray(arr);
    }
}
