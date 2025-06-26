import java.util.*;
public class arrays {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int marks[] = new int[100];
        System.out.print("phy: ");
        marks[0] = sc.nextInt();
        System.out.print("che: ");
        marks[1] = sc.nextInt();
        System.out.print("math: ");
        marks[2] = sc.nextInt();
        int avg;
        avg = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("average marks is : "+avg);
        sc.close(); 

        // length of array
        System.out.println(marks.length);
    

    

    
        }


}

