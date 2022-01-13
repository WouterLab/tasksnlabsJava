public class Task7 {
    public static void main(String[] args)
    {
    System.out.println(longestNonrepeatingSubstring("abcabcbb"));
}
 private static boolean someS(String str){
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(i == j) continue;
                if(str.charAt(i) == str.charAt(j)) return false;
            }
        }
        return true;
    }
    private static String longestNonrepeatingSubstring(String str){
        String rez = "";
        String rez2 = "";
        for(int j=0;j<str.length();j++) {
            rez = "";
            for (int i = j; i < str.length(); i++) {
                if (i == 0) rez += str.charAt(i);
                else {
                    while (someS(rez)) {
                        rez += str.charAt(i);
                        if(i != str.length()-1) i++;
                        String r = rez;
                        r += str.charAt(i);
                        if (!someS(r)) break;
                    }
                    if(rez.length() > rez2.length()) rez2 = rez;
                    break;
                }
            }
        }
        return rez2;
    }
}