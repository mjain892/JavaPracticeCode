class FindMinMaxString {
    public static void main(String args[]) {
        findMethod("My name is Mayank Jain");
    }
    public static void findMethod(String s) {
        String str = s + " ";
        char ch = ' ';
        int len = str.length(), l = 0;
        int min = len, max = 0;
        String shortest_word = "", longest_word = "", word = "";
        for (int i = 0; i < len; i++) {
            ch = str.charAt(i);
            if (ch != ' ') {
                word += ch;

            } //if ends
            else {
                l = word.length();
                if (l < min) {
                    min = l;
                    shortest_word = word;
                } //if ends
                if (l > max) {
                    max = l;
                    longest_word = word;
                }
                word = "";
            }
        }
        System.out.println("Shortest word = " + shortest_word + " with length " + min);
        System.out.println("Longest word = " + longest_word + " with length " + max);
    }
}