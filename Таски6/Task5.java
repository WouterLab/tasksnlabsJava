import java.util.*;
public class Task5{
	public static void main(String[] args) {
		String[] b= {"b"};
    	 System.out.println(Arrays.toString(getHashTags("How the Avocado Became the Fruit of the Global Trade")));
	}
	 private static int getMaxLenght(String[] m){
        int k = m[0].length();
        for(int i=1;i<m.length;i++)
            if(m[i].length() > k ) k = m[i].length();
        return k;
    }
    private static String[] getHashTags(String s){
        int size = 0;
        String[] a;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' ') size++;
        }
        int m = 0;
        if(size == 1 || size == 0){
            a = new String[size+1];
            Arrays.fill(a,"#");
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == ' ') m++;
                else if(!(s.charAt(i) == ',')) a[m] += Character.toLowerCase(s.charAt(i));
            }
            if(size == 1){
                if(a[0].length() < a[1].length()){
                    String e = a[0];
                    a[0] = a[1];
                    a[1] = e;
                }
            }
            return a;
        }
        else {
            a = new String[size+1];
            Arrays.fill(a,"#");
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == ' ' ) m++;
                else if(!(s.charAt(i) == ',')) a[m] += Character.toLowerCase(s.charAt(i));
            }
            String rez = "";
            String[] b = new String[3];
            Arrays.fill(b,"");
            int x = 0;
            for(int j=0;j<a.length;j++){
            for(int i=0;i<a.length;i++){
                if(x == 3) break;
                if(a[i].length() == getMaxLenght(a)) {
                    b[x] += a[i];
                    a[i] = "";
                    x++;
                    break;
                }
            }}
            return b;
        }
    }
}