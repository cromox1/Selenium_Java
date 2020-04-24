/*
You are given an array (which will have a length of at least 3, but could be very large) containing integers.
The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single
integer N. Write a method that takes the array as an argument and returns this "outlier" N.

Examples
[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11
(the only odd number)

[160, 3, 1719, 19, 11, 13, -21]
Should return: 160
(the only even number)
 */

public class FindOutlier {
    static int find(int[] integers) {
        int newodd = 0, neweven = 0, oddnumber = 0, evennumber = 0, nombor = 0;

        for (int i=0; i < integers.length; i++)
        {
            if (integers[i] % 2 == 0)
            {
                newodd++;
                if (newodd == 1)
                {oddnumber = integers[i];}
            }
            else
            {
                neweven++;
                if (neweven == 1)
                {evennumber = integers[i];}
            }
        }
        if (neweven == 1) {
            nombor = evennumber;
        }
        else if (newodd == 1) {
            nombor = oddnumber;
        }
        return nombor;
    }
}

// https://www.codewars.com/kata/5526fc09a1bbd946250002dc/solutions/java