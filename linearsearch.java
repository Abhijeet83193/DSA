import java.util.*;
public class linearsearch {

    public static void searchingfunc(String fruits[], String findFruits){
        boolean fruitFound = false;
        for(int i=0; i< fruits.length; i++){
            if(fruits[i].equals(findFruits)){
            System.out.println(i+" position pr fruit "+findFruits+" hai");
            fruitFound = true;
            }
        }

        if (!fruitFound) {
        System.out.println("fruit nahi mila");
       }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("fruits ke bucket ka size : "); 
        int n = sc.nextInt();
                sc.nextLine();
        String fruits[] = new String[n];
        System.out.println(n+" fruits ke nam likhiye : ");
        for(int i=0; i< fruits.length; i++){
           fruits[i] = sc.nextLine();
       }
        System.out.print("bucket se konsa fruit search krna hai : ");
        String findFruits = sc.nextLine();
        searchingfunc(fruits,findFruits);     
    }
}
