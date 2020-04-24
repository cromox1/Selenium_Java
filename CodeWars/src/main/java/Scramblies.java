import java.util.Arrays;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {

        str1 = sortString(str1);
        str2 = sortString(str2);
        // System.out.println(str1);
        // System.out.println(str2);
        if (str1.length() >= str2.length()) {

            int result = 0;
            for (int i = 0; i < str2.length(); i++) {
                if (str1.indexOf(str2.charAt(i)) >= 0) {
                    int nocharstr1 = 0;
                    for (int j = 0; j < str1.length(); j++) {
                        if (str1.charAt(j) == str2.charAt(i)) {
                            nocharstr1++;
                        }
                    }
                    int nocharstr2 = 0;
                    for (int j = 0; j < str2.length(); j++) {
                        if (str2.charAt(j) == str2.charAt(i)) {
                            nocharstr2++;
                            if (nocharstr2 > nocharstr1)
                                break;
                        }
                    }
                    if (nocharstr1 >= nocharstr2)
                        result = 1;
                    else {
                        result = 0;
                        break;
                    }
                } else {
                    result = 0;
                    break;
                }
            }
            if (result == 1)
                return true;
            else
                return false;
        }
        else
            return false;
    }

    /*
    public int charCountList(String str)
    {
        int count = 0; char strList[];
        for (int i = 0; i < str.length(); i ++)
        {

        }
        for(int j = 0; j < str.length(); j++)
        {    if(str.charAt(j) == c)
            count++;
        }
        strList[count] =
        return strList
    }
    */


    public static String sortString(String input)
    {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }
}