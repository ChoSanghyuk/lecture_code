public class NumberToWords {
    
    public static void numberToWords(int number){
        if (number <0){
            System.out.println("Invalid Value");
        }
        int reversed = reverse(number);
        int digitCount = getDigitCount(number);
        int reversedDigitCount =0;
        
        for(int i= reversed; i >0 ; i/=10){
            reversedDigitCount++;    
            switch(i%10){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
        while (digitCount - reversedDigitCount >0){
            System.out.println("Zero");
            reversedDigitCount++;
        }
    }
    
    public static int reverse(int number){
        int temp =0;
        for(int i = number; i !=0; i/=10){
            temp = temp*10 + i%10;
        }
        return temp;
    }
    
    public static int getDigitCount(int number){
        if(number <0){
            return -1;
        }
        int count =1;
        for(int i = number; i>=10; i/=10){
            count++;
        }
        return count;
    }
}
