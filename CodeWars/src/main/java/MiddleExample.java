/*
You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd,
return the middle character. If the word's length is even, return the middle 2 characters.

#Examples:
Kata.getMiddle("test") should return "es"
Kata.getMiddle("testing") should return "t"
Kata.getMiddle("middle") should return "dd"
Kata.getMiddle("A") should return "A"
 */

public class MiddleExample {
    public static String getMiddle(String word) {
        //Code goes here!
        int lent = word.toCharArray().length;
        int half = lent / 2;
        String midtext = "";
        if (lent % 2 == 0)
            midtext = midtext + word.toCharArray()[half-1] + word.toCharArray()[half];
        else
            midtext = midtext + word.toCharArray()[half];
        return midtext;
    }
}

// https://www.codewars.com/kata/56747fd5cb988479af000028/solutions/java
