public class Main {
    public static void main(String[] args) {

        // Create a for statement using a range [1,1000]
        int sum = 0;
        int nrsFound = 0;
        for(int i = 1; i <= 1000; i++) {
            // Sum all the numbers that can be divided with both 3 and also 5.
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
                sum += i;
                nrsFound++;
                if (nrsFound >= 5){
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
