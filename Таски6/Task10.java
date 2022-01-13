import java.util.*;
public class Task10 {
	public static void main(String[] args)
    {
    System.out.println(palindromeDescendant(11211230));
}
public static boolean palindromeDescendant(int num) {
        String ns = Integer.toString(num);
        String rs = "";
        for(int i = 0; i < ns.length(); i++) rs = ns.charAt(i) + rs;

        for(int i = 0; ns.length() >= 2; i++){
            if(ns.equals(rs)) return true;
            ns = "";
            for(int y = rs.length() - 1; y > 0; y = y - 2) ns += Character.getNumericValue(rs.charAt(y)) + Character.getNumericValue(rs.charAt(y - 1));
            rs = "";
            for(int x = 0; x < ns.length(); x++) rs = ns.charAt(x) + rs;
        }
        return false;
    }
}