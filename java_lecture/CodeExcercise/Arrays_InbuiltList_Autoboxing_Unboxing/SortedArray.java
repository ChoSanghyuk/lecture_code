import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int number){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        for(int i =0 ; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }
    
    public static int[] sortIntegers(int[] array){
        int temp;
        boolean unsorted = true;
        while (unsorted){
            unsorted = false;
            for(int i =0 ; i < array.length-1; i++){
            if(array[i] < array[i+1]){
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                unsorted = true;
            }
            }
        }
        return array;
    }
    
    public static void printArray(int[] array){
        for(int i=0; i < array.length; i++){
            System.out.println("Element " + i+" contents " + array[i]);
        }
    }
    
}
