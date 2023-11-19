public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number <0){
            return -1;
        }
        int first = number %10, last=0;
        for(;number >0; number= Math.floorDiv(number,10)){
            last = number;
        }
        return (first + last);
    }
}
