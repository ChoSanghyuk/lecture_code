public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes <0){
            System.out.println("Invalid Value");
        }
        else{
            long days = minutes / (60*24);
            System.out.println(minutes+" min = " + Math.floorDiv(days,365)+" y and "+days%365+" d"   );
        }
    }
}
