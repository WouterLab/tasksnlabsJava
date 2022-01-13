import java.util.*;
public class Task3{
    public static void main(String[] args) {
    	 System.out.println(validColor("rgb(0,,0)") );
    }
   public static boolean validColor(String color) {
        String s = color.substring(color.indexOf("(")+1, color.indexOf(")"));
        String[] parts = s.split(",");

        if (color.contains(" (")) 
            return false;
        if (color.contains("rgba") && parts.length != 4) 
            return false;
        else if (color.contains("rgb(") && parts.length != 3) 
            return false;

        boolean percentage = false;
        int num = 0;
        double dec = 0;       
        for (String value : parts) {

            if (value.contains("%"))
                percentage = true;
            
						if (value.equals("")) 
							return false;
					
            value = value.trim().replaceAll("%","");

            if (!value.contains("."))
                num = Integer.parseInt(value);
            else
                dec = Double.parseDouble(value);
            if (!color.contains("rgba") && value.contains("."))
                return false;

            if (!percentage) {               
                if (num < 0 || num > 255) 
                    return false;
                if (color.contains("rgba") && 
										(value.contains(".") && dec > 1.0 ||
                    (value.contains(".") && dec < 0)))
                        return false;

            } else {
                if (num < 0 || num > 100) 
                    return false;

            }

        }

        return true;
  }
}