public class Task1{
	public static void main(String[] args){
	System.out.println(solutions(1, 0, -1));
	}
	public static int solutions(int a,int b,int c) {
	double d=Math.pow(b,2)-4*a*c;
	if (d>0){
		return 2;
	}
	if (d==0){
		return 1;
	}
	else {
		return 0;
	}
	}
}