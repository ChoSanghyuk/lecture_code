public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number <0){
            return -1;
        }
        int sum=0;
        for(;number >0; number = Math.floorDiv(number, 10)){
            int remainder = number%10;
            if (remainder %2 ==0)
                sum += remainder;
        }
        return sum;
        
    }
}
