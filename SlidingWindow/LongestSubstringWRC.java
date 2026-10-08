import java.util.Scanner;

public class LongestSubstringWRC {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        for(int i = 0; i < s.length(); i++) {
            int[] hash = new int[256];
            for(int j = i; j < s.length(); j++) {
                if(hash[s.charAt(j)] == 1) {
                    break;
                }
                maxlen = Math.max(maxlen , j - i + 1);
                hash[s.charAt(j)] = 1;
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a String : ");
            String s = sc.nextLine();

            LongestSubstringWRC obj = new LongestSubstringWRC();
            int result = obj.lengthOfLongestSubstring(s);

            System.out.println("Length of longest substring: " + result);

        }
    }
}