
public class typepromotion {
    public static void main(String[] args) {
        byte a = 12;
        char b = 13;
        short c = 14;
        byte promote = (byte) (a+b+c);
        System.out.println(promote);
    }
}
