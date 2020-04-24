// TASK = count number of vowels (a,e,i,o,u) in the words

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        int len = str.length();
        for (int i = 0; i < len; i++)
        {
            switch(str.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelsCount++;
                    break;
                default:
                    // do nothing
            }
        }
        return vowelsCount;
    }
}
