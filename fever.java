import java.util.Scanner;
public class fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature of patient : ");
        double temperature = sc.nextDouble();
        if (temperature > 100) {
            System.out.println("you have fever");
        }else{
            System.out.println("you dont have a fever");
        }
        sc.close();
    }
}
