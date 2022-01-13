public class Task3 {
    public static void main(String[] args) {
        System.out.println(canComplete("butl", "beautiful"));
    }
private static int kolvoOneSimbol(String a,char c){
        int kolvo = 0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) == c) kolvo++;
        }
        return kolvo;
    }
    private static boolean canComplete(String a,String b){
        if(a.charAt(0) != b.charAt(0)) return false;
        int k = 0;
        for(char c = 'a';c <= 'z';c++){
            if(kolvoOneSimbol(a,c) > kolvoOneSimbol(b,c)) return false;
        }
        return true;
    }
}