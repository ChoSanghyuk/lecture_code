package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    double myDouble = 20.00d;
	    double myDouble2 = 80.00d;
        double remainder = ((myDouble + myDouble2)*100d) % 40;
        boolean isZero = (remainder == 0);
        System.out.println(isZero);
        if(isZero != true)
            System.out.println("Got some remainder");

    }
}
