import java.util.Scanner;
 
public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum=0, count =0;
        while(scanner.hasNextInt()){
            sum += scanner.nextInt();
            scanner.nextLine();
            count++;
        }
        System.out.println("SUM = "+ sum+" AVG = " + Math.round( (double)sum/count )  );
    }
}
