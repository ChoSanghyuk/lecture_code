public class SpeedConverter {

   
   public static long toMilesPerHour(double kilometerPerHour){
       if (kilometerPerHour < 0){
           return -1;
       }
       long converted = Math.round(kilometerPerHour / 1.609d);
       return converted;
       
   }
   public static void printConversion(double kilometerPerHour ){
       long milePerHour = toMilesPerHour(kilometerPerHour);
       if (milePerHour < 0){
           System.out.println("Invalid Value");
       }
       else{
           System.out.println(kilometerPerHour+ " km/h = " + milePerHour + " mi/h");
       }
   }
   
}
