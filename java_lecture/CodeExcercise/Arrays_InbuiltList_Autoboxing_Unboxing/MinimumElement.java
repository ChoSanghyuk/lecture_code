import java.util.Scanner;

public class MinimumElement {
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }
    private static int[] readElements(int number){
        int[] array = new int[number];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i <number ; i++){
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }
    private static int findMin(int[] array){
        int minimum = array[0];
        for(int i =1 ; i < array.length; i++){
            if(minimum > array[i]){
                minimum = array[i];
            }
        }
        return minimum;
    }
    
}
