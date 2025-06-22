import java.util.*;
public class halfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of pyramid: ");
        int n = sc.nextInt();
        for(int line=1; line<=n; line++){
            for(int element=1; element<=line; element++){
                System.out.print(element);
            }
            System.out.println();
        }
        sc.close();
    }
}
