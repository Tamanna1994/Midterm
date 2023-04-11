package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String str = "madam";
        boolean result = isPalindrome(str);
        System.out.println(str+" IsPalindrome = "+ result);


    }
    private static boolean isPalindrome(String str) {

        if(str==null) {
            return false;
        }
        if(str.length()<=1) {
            return true;
        }
        String first = str.substring(0,1);
        String last = str.substring(str.length()-1, str.length());
        if(!first.equals(last)) {
            return false;

        }
        else {
            return isPalindrome(str.substring(1, str.length()-1));
        }

    }
}
