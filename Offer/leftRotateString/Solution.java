package leftRotateString;

public class Solution {
    // public String LeftRotateString(String str, int n) {
    // if (str.length() == 0 || n < 0) {
    // return new String();
    // }
    // StringBuilder sBuilder = new StringBuilder();
    // sBuilder.append(str.substring(n, str.length()));
    // sBuilder.append(str.substring(0, n));
    // return sBuilder.toString();
    // }

    public String LeftRotateString(String str, int n) {
        if (str.length() == 0 || n < 0) {
            return new String();
        }
        char[] s = str.toCharArray();
        swap(s, 0, n - 1);
        swap(s, n, str.length() - 1);
        swap(s, 0, str.length() - 1);
        return new String(s);
    }

    private void swap(char[] s, int start, int end) {
        while (start < end) {
            char temp;
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String s1 = "abcdefg";
        Solution solution = new Solution();
        System.out.println(solution.LeftRotateString(s1, 3));
    }
}