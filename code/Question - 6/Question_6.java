public class Question_6 {
	public static void main(String[] args) {
		final int counter = 8; // Display 8 per line
		int count = 0; // Count the number of prime numbers
		System.out.println("The prime numbers between 2 and 1,000, inclusive are \n");

		// Repeat until find the prime numbers
		for (int number = 2; number <= 1000; number++) {
			// Assume the number is prime
			boolean flag = true; //if flag is true number is prime
			
			// Test whether number is prime
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0)	{ // if true, number is not prime
					flag = false;	// Set flag to false
					break;	// Exit the for loop
				}
			}
			// Write the prime number and increase the count
			if (flag == true) {
				count++;	
				if (count % counter == 0) {
					// Create new line
					System.out.println(number);
				}
				else
					System.out.print(number + " ");
			}
		}
	}
}
