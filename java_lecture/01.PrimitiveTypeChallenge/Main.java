package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte byteNUm = 120;
        short shortNum = 3100;
        int intNum = 63241;
        long longNum = 50000L + 10L*(byteNUm + shortNum + intNum ); // long type 뒤에는 L
        System.out.println(longNum);
    }
}
