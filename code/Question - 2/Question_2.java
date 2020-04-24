import java.util.Scanner;
public class Question_2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		boolean withinCircle = (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10);
		System.out.println("Point (" + x + ", "+ y + ") is " + ((withinCircle) ? "in " : "not in ") + "the circle"); 
		
		input.close();
	}
}
