import java.util.HashSet;
import java.util.Set;

/*Count the number of Duplicates
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits
that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase)
and numeric digits.

Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice*/
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        char[] arr = text.toLowerCase().toCharArray();
        Set temp = new HashSet();

        for (char i : arr) {
            if (countElement(arr, i) > 1) {
                temp.add(i);
            }
        }
        return temp.size();
    }

    public static int countElement(char[] str, char elem) {
        int counter = 0;
        for (int i = 0; i < str.length; i++) counter += (str[i] == elem) ? 1 : 0;

        return counter;
    }

}
