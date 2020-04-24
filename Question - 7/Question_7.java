public class Question_7 {
	public static void main(String[] args) {
		double e = 0.0, value = 10000.0;
		
		e = e + 1; // Newton's series expansions first 1(x^0)
			
		// Compute e value for i = 10000
		for (double i = 1; i <= value; i++) {
			double denominator = i;
			for (double k = i - 1; k >= 1; k--) {
				denominator *= k;
			}
			e += 1 / denominator;  
		}
			
		// Display result
		System.out.println("The e value for i = 10000: " + e);
	}	
}
