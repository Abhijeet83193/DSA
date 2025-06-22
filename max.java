
import java.util.*;
public class max {


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter a");
        double a = sc.nextInt();
        System.out.println("enter b");
        double b = sc.nextInt();
        System.out.println("enter c");
        double c = sc.nextInt();
        sc.close();

        if(a>b&&a>c){
            System.out.println("a is max");
        }else if(b>a&&b>c){
            System.out.println("b is max");
        }else{
            System.out.println("c is max");
        }
    }
}