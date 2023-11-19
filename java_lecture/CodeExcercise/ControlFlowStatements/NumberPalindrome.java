public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        if (number <0){
            number *= -1;
        }
        int reversed = 0, origin = number;
        for(; number >0 ; number = Math.floorDiv(number,10) ){
            reversed = 10*reversed + number%10;
        }
        
        if (reversed == origin){
            return true;
        }
        return false;
    }
 
}
