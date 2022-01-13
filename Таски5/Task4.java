public class Task4 {
    public static void main(String[] args) {
        System.out.println(sumDigProd(16, 28));
    }
    private static int sumDigProd(int ... v){ 
        int k = 0;                             
        for(int i=0;i<v.length;i++)
            k+=v[i];
        int u = 1;
        String s = Integer.toString(k);
        for(int j=0;j<s.length();j++)
            u*=Character.getNumericValue(s.charAt(j));
        if(u>9) 
        	return sumDigProd(u);
        else 
        	return u;
    }
}