/*
There is an array with some numbers. All numbers are equal except for one. Try to find it!

Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
It’s guaranteed that array contains more than 3 numbers.

The tests contain some very huge arrays, so think about performance.

This is the first kata in series:
- Find the unique number (this kata)
- Find the unique string
- Find The Unique
 */

// https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java
// https://www.codewars.com/kata/find-the-unique-number-1/solutions/java

public class FindUniq {
    public static double findUniq(double arr[]) {
        // Do the magic
        double uniq = 0;
        for (int i = 0; i < arr.length-2; i++) {
            if (arr[i] != arr[i+1] && arr[i+1] != arr[i+2])
                uniq = arr[i+1];
            else if (arr[i] == arr[i+1] && arr[i+1] != arr[i+2])
                uniq = arr[i+2];
            else if (arr[i] != arr[i+1] && arr[i+1] == arr[i+2])
                uniq = arr[i];
        }
        return uniq;
    }
}

/*
MY OLD SOLUTION

public class Kata {
    public static double findUniq(double arr[]) {
      // Do the magic
        int length = arr.length;
        double uniq = 0;

        double maxx = arr[0], minn = arr[0];
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxx)
                maxx = arr[i];
            if (arr[i] < minn)
                minn = arr[i];
            total = total + arr[i];
        }
        double purata = total / length;

        if ( purata - minn > maxx - purata)
            uniq = minn;
        else
            uniq = maxx;
        return uniq;
    }
}

 */
