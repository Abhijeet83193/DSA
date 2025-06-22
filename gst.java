
import java.util.Scanner;
public class gst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of pencil : ");
        double pencil = sc.nextDouble();
        System.out.print("Enter the price of pen : ");
        double pen = sc.nextDouble();
        System.out.print("Enter the price of eraser : ");
        double eraser = sc.nextDouble();
        double itemsCost = (pencil+pen+eraser);
        System.out.println("Total cost of items : "+itemsCost);
        double gstAmount = (itemsCost * 0.18);
        System.out.println("Gst Amount is : "+gstAmount);
        double totalAmount = (itemsCost + gstAmount);
        System.out.println("Total Amount Generated : "+totalAmount);
        sc.close();
    }
}
