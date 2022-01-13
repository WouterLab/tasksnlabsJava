public class Task9{
	public static void main(String[] args){
	System.out.println(nextPrime(12));
	}
	public static int nextPrime(int number) {
		boolean prime = true;
		int next = number;
		while (true) {
			prime = true;
			for (int i = 2; i < next - 1; i++) {
				if (next % i == 0) prime = false;
			}
			if (prime) return next;
			next++;
		}
	}
}