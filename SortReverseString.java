import java.util.Arrays;
import java.util.Collections;

public class SortReverseString {

        public static void main(String[] args) {
            String str = "Hello world";
            // Convert the string to a character array
            char[] charArray = str.toCharArray();
            // Reverse the character array
            Arrays.sort(charArray);
            // Convert the character array back to a string
            String reversedString = new String(charArray);
            // Print the reversed string
            System.out.println(reversedString);


            String input = "GeeksforGeeks";

            // getBytes() method to convert string
            // into bytes[].
            byte[] strAsByteArray = input.getBytes();

            byte[] result = new byte[strAsByteArray.length];

            // Store result in reverse order into the
            // result byte[]
            for (int i = 0; i < strAsByteArray.length; i++)
                result[i] = strAsByteArray[strAsByteArray.length - i - 1];

            System.out.println(new String(result));
        }
    }

