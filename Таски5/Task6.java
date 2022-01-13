public class Task6 {
    public static void main(String[] args) {
        System.out.println(validateCard(1234567890123456L));
    }
 
private static boolean validateCard(long a) {
        String s = Long.toString(a);
        String s2 = "";
        if(s.length() < 14 || s.length() > 19) return false;
        for(int i=0;i<s.length()-1;i++){
            s2 += s.charAt(i); 
        }
        int step1 = Character.getNumericValue(s.charAt(s.length()-1));
        StringBuffer s3 = new StringBuffer(s2);
        s3.reverse(); 
        String s4 = "";
        for(int i=0;i<s3.length();i++){ 
            if( i % 2 == 0){
                int c = Character.getNumericValue(s3.charAt(i)) * 2;
                if(c < 10)
                    s4 += Integer.toString(c);
                else if( c == 10)
                    s4 += Integer.toString(1);
                else {
                    String u = Integer.toString(c);
                    int d = Character.getNumericValue(u.charAt(0)) + Character.getNumericValue(u.charAt(1));
                    s4 += Integer.toString(d);
                }
            }
            else s4 += s3.charAt(i);
        }
        int u = 0;
        for(int i=0;i<s4.length();i++)
            u+= Character.getNumericValue(s4.charAt(i));  
        String step4 = Integer.toString(u);
        return (10 - Character.getNumericValue(step4.charAt(step4.length()-1)) == step1);
    }
}