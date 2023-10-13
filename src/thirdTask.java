public class thirdTask {
    public static void main(String[] args){
        int daysInYear=365;

        int secondsInAMinute = 60;
        int secondsInAnHour = 60 * secondsInAMinute;
        int secondsInADay = 24 * secondsInAnHour;

        long secondsInAYear = (long) daysInYear * secondsInADay;

        System.out.println("There are " + secondsInAYear + " seconds in a year");
    }
}
