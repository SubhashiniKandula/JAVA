import java.util.*;
public class PalindromeString{
    public static Scanner scn = new Scanner(System.in);

    public static boolean palindromeString(String str){
        boolean isPalindrome = false;
        int si = 0, ei = str.length()-1;
        while(si < ei) {
            if (str.charAt(si) == str.charAt(ei)) {
                isPalindrome = true;
            }
            si++;
            ei--;
        }
        return isPalindrome;
    }

    public static void main(String[] args){
    System.out.println(palindromeString(scn.nextLine()));
    }
}
