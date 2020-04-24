import java.util.Arrays;

public class SortOdd {
    public static int[] sortArray(int[] array) {
        int n = array.length;

        int oddnum = 0;
        for (int i = 0; i < n; i++)
        {
            if(array[i] % 2 != 0) {  oddnum++;  }
        }

        int[] arraytmp = new int[oddnum];
        int[] arrayfinal = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++)
        {
            if(array[i] % 2 != 0)
            {
                arraytmp[j] = array[i];
                j++;
            }
        }
        Arrays.sort(arraytmp);
        j = 0;
        for (int i = 0; i < n; i++)
        {
            if(array[i] % 2 == 0)
            {
                arrayfinal[i] = array[i];
            }
            else
            {
                arrayfinal[i] = arraytmp[j];
                j++;
            }
        }
        return arrayfinal;
    }
}
