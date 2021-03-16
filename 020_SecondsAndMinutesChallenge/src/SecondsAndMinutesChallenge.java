public class SecondsAndMinutesChallenge {

    // Create a method called getDurationString with two parameters: minutes, seconds
    public static String getDurationString(int minutes, int seconds) {
        String resultString = "Unknown Error";
        // Validate that minutes is >= 0
        // Validate that seconds is [0,59]
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            // The method should return "Invalid Value"
            resultString = "Invalid Value";

        } else {
            // if the parameters are valid then calculate how many hours, minutes and seconds the timeframe is
            int hours = minutes / 60;
            int minutesRemainder = minutes % 60;
            resultString = String.format("%02dh %02dm %02ds", hours, minutesRemainder, seconds);

        }
        System.out.println(resultString);
        return resultString;
    }

    // Create a 2nd method of the same name but with only one parameter: Seconds
    public static void getDurationString(int seconds) {
        int minutes = seconds / 60;
        int secondsRemainder = seconds % 60;
        System.out.println(String.format("%02ds = %02dm %02ds", seconds, minutes, secondsRemainder));
        getDurationString(minutes, secondsRemainder);

    }
}
