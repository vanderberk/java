# Java Questions and Answers

## Question 1
Write a program that prompts the user to enter three integers and display the integers in non-decreasing order.

### Solution
First we try find the smallest number so we compare first number1 and number2 if number2 is smaller than the number1 sorting these 2 number. After that, we compare the number1 and number3 because number3 is can be smaller than number1, if number3 is smaller than number1 we sorting these two number. Finally we compare the number2 and number3.

```javascript
import java.util.Scanner;
public class Question_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 3 integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();

		// Sort numbers
		int temp;
		if (number2 < number1 || number3 < number1){
			if (number2 < number1){
				temp = number1;
				number1 = number2;
				number2 = temp; 
			}
			if (number3 < number1){
				temp = number1;
				number1 = number3;
				number3 = temp;
			}
		}
		if (number3 < number2){
			temp = number2;
			number2 = number3;
			number3 = temp;
		}
		System.out.println(number1 + " " + number2 + " " + number3);
	}
}
```

