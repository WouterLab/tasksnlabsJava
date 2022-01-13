import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(encrypt("Hello")));
        int[] mas={72, 33, -73, 84, -12, -3, 13, -13, -68}; 
        System.out.println(decrypt(mas));
    }
    private static int[] encrypt(String str){
        int[] array = new int[str.length()];
        array[0] = str.charAt(0);
        for(int i=1;i<str.length();i++){
             array[i] = (str.charAt(i) - str.charAt(i-1));
        }
        return array;
    }
    private static String decrypt(int[] array){
        String str = "";
        str += (char) array[0];
        for(int i=1;i<array.length;i++){
            int a = str.charAt(i-1);
            str += (char) (a + array[i]);
        }
        return str;
    }
}