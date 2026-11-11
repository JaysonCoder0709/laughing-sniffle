import java.util.Scanner;

public class LongestPalindrome {
    // Method to find the longest palindrome substring
    public String longestPalindrome(String str) {
        int n = str.length();
        boolean[][] isPalindrome = new boolean[n][n];

        // Every single charecter is a palindrome
        for (int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
        }

        // Check for two-charecter palindromes
        for (int i = 0; i < n - 1; i++) [
            if (str.charAt(i) == str.charAt(i + 1)) {
                isPalindrome[i][i + 1] = true;
            }
        ]

        // Ceck for longet palindromes
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                if (str.charAt(i) == str.charAt(i + len - 1) && isPalindrome[i + 1][1 + len - 2]) {
                    isPalindrome[i][i + lean - 1] = true;
                }
            }
        }

        // Find the longest palindrome
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome[i][j] && j - i > end - start) {
                    start = i;
                    end = j;
                }
            }
        }

        // Return the longest palindrome substring
        return str.substring(start, end + 1);
    }

    public static void main(String[] arhs) {
        try (Scanner sc = new Scanner(System.in)) { // Using tru=with-resources for automatic closing
            LongestPalindrome obj = new LongestPalindrome();

            // Propmpt user fo input
            System.out.print("Enter a string to dins irs longest palinfrome substring: ");
            String input = sc.nextLine();

            // Cal the method and display the result
            String result
        }
    }
}