public class PlayingCat {
    public static boolean isCatPlaying(boolean isSummer, int temperature){
        if(isSummer){
            if( (temperature >=25) && (temperature <= 45)){
                return true;
            }
            return false;
        }
        else {
            if( (temperature >=25) && (temperature <= 35)){
                return true;
            }
            return false;
        }
    }
}
