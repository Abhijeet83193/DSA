public class duplicate {
  public static void main(String[] args) {
    boolean answer = false;
    int arr[] = {1,2,3,4};
       for(int i=0; i<arr.length; i++){
           for(int j=i+1; j<arr.length; j++){
               if(arr[i]==arr[j]){
                  answer = true;
               }
           }

           if(answer){
           break;
           }

       }
    System.out.println(answer);  
    }
}