import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        double year = sc.nextDouble();
        if (year%4==0) {
            System.out.println(year+" is leap year");
        }else{
            System.out.println("is not a leap year");
        }
        sc.close();
    }
    
}
