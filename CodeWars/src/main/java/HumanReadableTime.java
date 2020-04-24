public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        // Do something
        int sec = seconds - 60*(seconds/60);
        int min = seconds/60 - 60*(seconds/(60*60));
        int hrs = seconds/(60*60);
        String timereadable = intToString(hrs) + ":" + intToString(min) + ":" + intToString(sec);
        return timereadable;
    }
    public static String intToString(int input) {
        String output = new String();
        if (input < 10) {
            output = "0" + Integer.toString(input);
        } else {
            output = Integer.toString(input);
        }
        return output;
    }
}
