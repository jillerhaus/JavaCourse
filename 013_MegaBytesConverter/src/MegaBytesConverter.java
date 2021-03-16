public class MegaBytesConverter {
    // Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes
    // The method should not return anything (void)
    static public void printMegaBytesAndKiloBytes(int kiloBytes) {
        //If the parameter kiloBytes is less than 0 then print the text "Invalid Value"
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {

            //and it needs to calculate the megabytes and remaining kilobytes from the kiloBytes parameter
            int megaBytes = kiloBytes / 1024;
            int remainingKilobytes = kiloBytes % 1024;

            //Then it needs to print a message in the format "XX KB = YY MB and ZZ KB"
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKilobytes + " KB");
        }

    }
}
