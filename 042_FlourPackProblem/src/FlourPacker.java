public class FlourPacker {

    // Write a method called canPack with three parameters of type int named bigCount, smallCount and goal
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // The parameter bigCount represents the count of big flour bags (5 kilos)
        // The parameter smallCount represents the 1 kg flour bags
        // the parameter goal represents the goal amount of kilos of flour needed to assemble a package
        // Therefore the sum of the kilos of bigCount and small count must be at least equal to the value of goal
        // The method should return true if it is possible to make a package with goal kilos of flour
        // If the sum is greater than goal, ensure that only full bags are used towards the goal amount. For example if
        // goal = 9, bigCount = 2 and smallCount = 0, the method should return false since each bag each big bag has 5 kilos
        // and cannot be divided
        // if goal = 9, bigCount = 1 and smallCount = 5, the method should return tru because 1 full big bag and 4
        // full small bags equal goal and it's ok if there are additional bags left over
        // if any of the parameters return negative, return false

        if ((smallCount < 0) || (bigCount < 0) || (goal < 0)) {
            return false;
        }
        for( int i = 0; i <= bigCount; i++) {
            if (i * 5 == goal) {
                return true;
            } else {
                for (int j = 0; j <= smallCount; j++) {
                    if ((i * 5) + (j) == goal) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
