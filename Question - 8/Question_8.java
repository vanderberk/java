public class Question_8 {
	public static void main(String[] args) {
		System.out.println("The perfect numbers less than 10,000:");
		int sum;	// Holds the sum of the positive divisors
		// Find all perfect numbers less than 10,000
		for (int i = 1; i < 10000; i++) {
			sum = 0;	// Reset sum

			for (int k = 1; k < i; k++) {
				// Test for divisor
				if (i % k == 0)
					sum += k;
			}
			// Test if sum of all positive divisors are equal to number
			if (i == sum)
				System.out.println(i);
		}
	}
}