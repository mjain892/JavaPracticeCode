import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubsttr {
    public static String getUniqueCharacterSubstring(String input) {
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < input.length(); end++) {
            char currChar = input.charAt(end);
            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar)+1, start);
                System.out.println(start);
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end + 1);
            }
            visited.put(currChar, end);
        }
        return output;
    }

    public static int longestUniqueSubsttr(String str)
    {
        int n = str.length();

        // Result
        int res = 0;

        for(int i = 0; i < n; i++)
        {

            // Note : Default values in visited are false
            boolean[] visited = new boolean[256];

            for(int j = i; j < n; j++) {
                // If current character is visited
                // Break the loop
                if (visited[str.charAt(j)] == true)
                    break;
                    // Else update the result if
                    // this window is larger, and mark
                    // current character as visited.
                else {
                    res = Math.max(res, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }
            // Remove the first character of previous
            // window
            visited[str.charAt(i)] = false;
        }
        return res;
    }

    // Driver code
    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        System.out.println("The input string is " + str);

        System.out.println(getUniqueCharacterSubstring(str));

        int len = longestUniqueSubsttr(str);
        System.out.println("The length of the longest " +
                "non-repeating character " +
                "substring is " + len);
    }
}

