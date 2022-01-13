public class Task2{
	public static void main(String[] args){
	System.out.println(findZip("all zip files are zipped"));
	}
	public static int findZip(String fz) {
		if (fz.lastIndexOf("zip") != fz.indexOf("zip")&& fz.indexOf("zip") != -1 ) {
			return fz.lastIndexOf("zip");
		}
		return -1;
	}
}