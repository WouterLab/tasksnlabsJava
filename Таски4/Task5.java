public class Task5{
    public static void main(String[] args){
    System.out.println(BMI("205 pounds", "73 inches"));
    }
public static String BMI(String weight, String height) {

        String[] weig = weight.split(" ");
        String[] heig = height.split(" ");
        String result = "";

        double kilos = weig[1].equals("pounds") ? Double.parseDouble(weig[0]) * 0.453592 : Double.parseDouble(weig[0]);
        double meters = heig[1].equals("inches") ? Double.parseDouble(heig[0]) * 0.0254 : Double.parseDouble(heig[0]);

        double val = kilos / (meters * meters);
        val = Math.round(val * 10.0)/10.0;

        if (val < 18.5) result += val+" Underweight";
        if (val >= 18.5 && val <= 24.5) result += val + " Normal weight";
        if (val >= 25 && val <= 29.9) result += val + " Overweight";
        if (val >= 30) result += val + " Obesity";
        return result;

    }
}