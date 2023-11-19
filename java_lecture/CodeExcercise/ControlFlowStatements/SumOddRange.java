public class SumOddRange {
    public static boolean isOdd(int number){
        if(number <=0 || number%2==0){
            return false;
        }
        else{
            return true;
        }
    }
    public static int sumOdd(int start, int end){
        if( !(start>0 && end>=start ) ){
            return -1;
        }
        int sum =0;
        if(!isOdd(start)){
            start +=1;
        }
        for(;start<=end;start +=2){
            sum += start;
        }
        return sum;
    }
}
