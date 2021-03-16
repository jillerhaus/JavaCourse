public class BarkingDog {
    // We have a dog that likes to bark. We need to wake up if the dog is barking at night!
    // Write a method shouldWakeUp that has 2 parameters
    // 1st parameter should be of type boolean and be named barking. it represents whether our dog is currently barking
    // 2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            // We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true
            if (((hourOfDay > 22) && (hourOfDay <= 24)) || ((hourOfDay >= 0) && (hourOfDay < 8))) {
                return true;
            }
        }
        // in all other cases return false
        return false;
    }
}
