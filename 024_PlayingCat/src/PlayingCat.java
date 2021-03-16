public class PlayingCat {
    // The cats spend most of the day playing. In particular, they play if the temperature is [25,35]
    // Unless it is summer, then the [25, 45]

    // Write a method isCatPlaying: 2 parameters (boolean summer, int temperature) returns boolean

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int maxTemperature = summer ? 45 : 35;
        if ((temperature >= 25) && (temperature <= maxTemperature)) {
            return true;
        }

        return false;
    }
}
