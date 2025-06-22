import java.util.*;
public class posneg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : -3");
        int input = sc.nextInt();
        if (input < 0) {
            System.out.println(input+" is negative");
        }else{
            System.out.println(input+" is positive");
        }
        sc.close();
    }
}