import java.util.*;
public class binarysearch {
    public static int binarysearchh(int arr[], int key) {
        int start = arr[0];
        int end = arr.length - 1;
           while(start <= end){
           int mid = (start+end)/2;

           if (arr[mid] == key) {
             return mid;
           }

           if (arr[mid] < key) {
              start = mid+1;
           }else{
              end = mid-1;
           }

        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter numbers : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the key for binary search : ");
        int key = sc.nextInt();
        System.out.println("the number index is : "+binarysearchh(arr,key));
        sc.close();
    }
}