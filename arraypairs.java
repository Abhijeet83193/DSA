public class arraypairs {
    public static void pairedarray(int numbers[]) {
        int totalPairs = 0;
        for(int outer=0; outer<numbers.length; outer++){
            int start = numbers[outer];
            for(int inner=outer+1; inner<numbers.length; inner++){
                System.out.print("("+start+","+numbers[inner]+")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("total pairs are : "+totalPairs);
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        pairedarray(numbers);


    } 
}
