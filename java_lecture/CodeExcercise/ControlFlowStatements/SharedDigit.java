public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b){
        if ( !((a>=10 && a<=99) && (b>=10 && b <=99)) ){
            return false;
        }
        for( ; a>0 ; a=Math.floorDiv(a,10) ){
            int candidate = a%10;
            for( int temp =b ; temp>0 ; temp=Math.floorDiv(temp,10)){
                if (candidate == (temp%10)){
                    return true;
                }
            }
            
        }
        return false;
        
    }
}
