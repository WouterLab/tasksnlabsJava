import java.util.*;
public class Task8 {
    public static void main(String[] args)
    {
    System.out.println(convertToRoman(2));
}
    private static String oneDigit(int a){
        if(a == 1) return "I";
        else if(a==2) return "II";
        else if(a==3) return "III";
        else if(a==4) return "IV";
        else if(a==5) return "V";
        else if(a==6) return "VI";
        else if(a==7) return "VII";
        else if(a==8) return "VIII";
        else if(a==9) return "IX";
        else if(a==0) return "";
        return "Error";
    }
    private static String desDigit(int a){
        if(a == 1) return "X";
        else if(a==2) return "XX";
        else if(a==3) return "XXX";
        else if(a==4) return "XL";
        else if(a==5) return "L";
        else if(a==6) return "LX";
        else if(a==7) return "LXX";
        else if(a==8) return "LXXX";
        else if(a==9) return "XC";
        else if(a==0) return "";
        return "Error";
    }
    private static String soDigit(int a){
        if(a == 1) return "C";
        else if(a==2) return "CC";
        else if(a==3) return "CCC";
        else if(a==4) return "CD";
        else if(a==5) return "D";
        else if(a==6) return "DC";
        else if(a==7) return "DCC";
        else if(a==8) return "DCCC";
        else if(a==9) return "CM";
        else if(a==0) return "";
        return "Error";
    }
    private static String tDigit(int a){
        if(a == 1) return "M";
        else if(a==2) return "MM";
        else if(a==3) return "MMM";
        return "Error";
    }
    private static String convertToRoman(int a){
        String rez = "";
        if(a<0 || a>3999) return "Error";
        String b = Integer.toString(a);
        if(b.length() == 1) rez = oneDigit(Character.getNumericValue(b.charAt(0)));
        else if(b.length() == 2){
            rez += desDigit(Character.getNumericValue(b.charAt(0)));
            rez += oneDigit(Character.getNumericValue(b.charAt(1)));
        }
        else if(b.length() == 3){
            rez += soDigit(Character.getNumericValue(b.charAt(0)));
            rez += desDigit(Character.getNumericValue(b.charAt(1)));
            rez += oneDigit(Character.getNumericValue(b.charAt(2)));
        }
        else if(b.length() == 4){
            rez += tDigit(Character.getNumericValue(b.charAt(0)));
            rez += soDigit(Character.getNumericValue(b.charAt(1)));
            rez += desDigit(Character.getNumericValue(b.charAt(2)));
            rez += oneDigit(Character.getNumericValue(b.charAt(3)));
        }
        return rez;
    }
}