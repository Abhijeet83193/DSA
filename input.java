
import java.util.Scanner;
public class input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input : ");
        String age = sc.nextLine();
        sc.close();
        System.out.println(age);
    }
}