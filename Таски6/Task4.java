import java.util.*;
public class Task4{
	public static void main(String[] args) {
		String[] b= {"b"};
    	 System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2",b));
	}
	public static String stripUrlParams(String url, String[] paramsToStrip) {
        if (!url.contains("?")) return url;

        String[] params = url.split("\\?{1}")[1].split("\\&");
        Map<String, String> map = new LinkedHashMap<String, String>();
        for (String p : params) {
            String[] s = p.split("={1}");
            map.put(s[0], s[1]);
        }
        if (paramsToStrip != null) {
            for (String s : paramsToStrip) {
                map.remove(s);
            }
        }
			
        StringBuilder sb = new StringBuilder();
        sb.append(url.split("\\?{1}")[0]);
          if (map.size() > 0)
              sb.append("?");
          for (Map.Entry entry : map.entrySet()) {
              sb.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
            }
			
        return sb.toString().substring(0, sb.length() - 1);
        }
    }