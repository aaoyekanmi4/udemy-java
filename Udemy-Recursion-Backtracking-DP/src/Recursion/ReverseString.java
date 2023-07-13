package Recursion;

public class ReverseString {
    //head recursion
    public String reverse(String s) {
        // your algorithm here
        if(s.length() == 0) {
            return "";
        }
        return s.charAt(s.length() -1) + reverse(s.substring(0, s.length() -1));
    }
    //tail recursion
    public String reverseTail(String s, String result) {
        if (s.length() == 0) {
            return result;
        }
        return reverseTail(s.substring(0, s.length() -1), result + s.charAt(s.length() -1));
    }
}
