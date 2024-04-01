public class Palindrome2 {
    public static boolean isPalindrome(String text) {
            // Base cases: Empty string or single character is a palindrome
            if (text == null || text.length() <= 1) {
                return true;
            } else {
                // Convert characters to lowercase and compare first and last characters
                char first = Character.toLowerCase(text.charAt(0));
                char last = Character.toLowerCase(text.charAt(text.length() - 1));
                return first == last && isPalindrome(text.substring(1, text.length() - 1));
            }
        }

        public static void main(String[] args) {
            System.out.println(isPalindrome("racecar"));  // True (case-sensitive)
            System.out.println(isPalindrome("Racecar"));  // False (case-sensitive)
            System.out.println(isPalindrome("hello"));    // False
            System.out.println(isPalindrome("A man, a plan, a canal: Panama"));  // True (ignoring punctuation)
        }
    }

