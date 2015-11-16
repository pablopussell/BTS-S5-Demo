public class IsItAPrime {

	public static void main(String[] args) {
		System.out.println("The primes betweenumber 1 anumberd 100 are: ");
		for (int number = 1; number <= 100; number++) {
			if (isPrime(number)) {
				System.out.println(number + " ");
			}
		}
	}

	private static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

}
