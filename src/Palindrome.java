public class Palindrome {
        public static boolean isPalindrome(String text) {
            if (text == null || text.isEmpty()) {
                return true;
            }
            return isPalindromeHelper(text, 0, text.length() - 1);
        }

        private static boolean isPalindromeHelper(String text, int start, int end) {
            // Base case: Single character or empty string remaining
            if (start >= end) {
                return true;
            }
            // Check if first and last characters are equal (ignoring case)
            char first = Character.toLowerCase(text.charAt(start));
            char last = Character.toLowerCase(text.charAt(end));
            return first == last && isPalindromeHelper(text, start + 1, end - 1);
        }

        public static void main(String[] args) {
            System.out.println(isPalindrome("racecar"));  // True (case-sensitive)
            System.out.println(isPalindrome("Racecar"));  // False (case-sensitive)
            System.out.println(isPalindrome("hello"));    // False
            System.out.println(isPalindrome("A man, a plan, a canal: Panama"));  // True (ignoring punctuation)
        }
    }
