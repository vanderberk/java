import java.util.Scanner;
public class Question_10 {
	/* Method isPalindrome returns true if number is a palindrome */
	public static boolean isPalindrome(int number) {
		int check = reverse(number);
		if(number == check){
			return true;
		}else{
			return false;
		}
	}

	/* Method reverse returns the reversal of an integer */
	public static int reverse(int number) {
		String reverse = ""; 	// Holds reversed number
		String n = number + ""; // Convert number to string
		// Reverse string
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		return Integer.parseInt(reverse); // Return reversed integer
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int number = input.nextInt();
		if(isPalindrome(number)){
			System.out.println("Number is Palindrome");
		}else{
			System.out.println("Number is not Palindrome");
		}
		input.close();
	}
}
