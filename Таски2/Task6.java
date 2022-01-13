public class Task6{
	public static void main(String[] args){
	System.out.println(Fibonacci(7));
	}
	public static int Fibonacci(int a) {
	int b=0;
	int c=1;
	int fib=0;
	for(int i=1;i<=a;i++){
		fib=b+c;
		b=c;
		c=fib;
	}
	return fib; 
	}
}