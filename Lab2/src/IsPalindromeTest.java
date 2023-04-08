import mylib.StringFun;

public class IsPalindromeTest {

    public static void main(String[] args) {

        String test = "abcd";
        String test2 = "abba";
        String test3 = "     abcba";
        String test4 = "abcde";
        String test5 = "    ABCba";

        System.out.println(StringFun.isPalindrome(test));

        System.out.println(StringFun.isPalindrome(test2));

        System.out.println(StringFun.isPalindrome(test3));

        System.out.println(StringFun.isPalindrome(test4));

        System.out.println(StringFun.isPalindrome(test5));
    }
}
