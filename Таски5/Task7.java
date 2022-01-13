public class Task7 {
    public static void main(String[] args) {
        System.out.println(numToEng(0));
    }
 private static String numToEng(int a){
        if(!(a >= 0 && a <= 999)) return "Error";
        String s = "";
        String[] onechifr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] tn = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
        String[] twochifr = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String[] threechift = {"","one hundred","two hundred","three hundred","four hundred","five hundred",
                "six hundreds","seven hundred","eight hundred","nine hundred"};
        if(a < 10) return onechifr[a];
        else if(a>= 10 && a <= 20) return tn[a-10];
        else if(a>20 && a<100) {
            String b = Integer.toString(a); 
            int fi = Character.getNumericValue(b.charAt(0));
            int tw = Character.getNumericValue(b.charAt(1));
            s += twochifr[fi] + " " + onechifr[tw];
        }
        else if(a % 100 == 0){
            String b = Integer.toString(a);
            int fi = Character.getNumericValue(b.charAt(0));
            s += threechift[fi];
        }
        else {
            String b = Integer.toString(a);
            int fi = Character.getNumericValue(b.charAt(0));
            int tw = Character.getNumericValue(b.charAt(1));
            int th = Character.getNumericValue(b.charAt(2));
            s += threechift[fi] + " " + twochifr[tw] + " " + onechifr[th];
        }
        return s;
    }
}