
import java.util.*;
public class areaofsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sides of Square : ");
        double side = sc.nextDouble();
        double areaofsquare = (side*side);
        System.out.print("Area of Square is : "+areaofsquare);
        sc.close();
    }
    
}
