import java.util.*;
public class Task2{
    public static void main(String[] args) {
    	 System.out.println(translateWord("flag"));
    	 System.out.println(translateSentence("I like to eat honey waffles."));
    }
 private static String translateWord(String s){
        if(s == "") return "";
        char first_c = Character.toLowerCase(s.charAt(0));
        if(first_c == 'a' || first_c == 'e' || first_c == 'o' || first_c == 'y' || first_c == 'u' || first_c == 'i'){
            s+="yay";
            return s;
        }
        else{
            String s2 = "";
            int i = 0;
            while(!(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' ||
                    s.charAt(i) == 'y' || s.charAt(i) == 'u' || s.charAt(i) == 'i')){
                s2 += s.charAt(i);
                i++;
            }
            s2 += "ay";
            String s3 = "";
            for(int j = i;j<s.length();j++){
                s3 += s.charAt(j);
            }
            s3+= s2;
            return s3;
        }
    }
    private static String translateSentence(String str){
        boolean t = false;
        String str2="";
        if(str.charAt(str.length()-1) == '.') {
            t = true;
            for(int x=0;x<str.length()-1;x++)
                str2+=str.charAt(x);
        }
        else {
            for(int x=0;x<str.length();x++)
                str2+=str.charAt(x);
        }
        int probels = 0;
        for(int i = 0;i<str2.length();i++){
            if(str2.charAt(i) == ' ') probels++;
        }
        String[] p = new String[probels+1];
        Arrays.fill(p,"");
        int j = 0;
        for(int i=0;i<str2.length();i++){
            if(str2.charAt(i) == ' ') j++;
            else p[j] += str2.charAt(i);
        }
        String rez = "";
        for(int i=0;i<p.length;i++){
            if(i!=p.length-1) rez += translateWord(p[i]) + " ";
            else rez += translateWord(p[i]);
        }
        if(t) rez+=".";
        return rez;
    }
}