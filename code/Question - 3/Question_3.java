import java.util.Scanner;
public class Question_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Enter 3 point A,B and C
		double Ax = 0.0;
		double Ay = 0.0;
		double Bx = 200.0;
		double By = 0.0;
		double Cx = 0.0;
		double Cy = 100.0;
			
		System.out.println("Please enter the one point:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		//Take the point from user
		
		//Calculate each angle between lines
		double cos1 = ((x-Ax) * (x-Bx)+(y-Ay)*(y-By)) / (Math.pow((Ax-x)*(Ax-x) + (Ay-y)*(Ay-y), 0.5) * (Math.pow((Bx-x)*(Bx-x)+(By-y)*(By-y), 0.5)));
		double cosson1 = Math.acos(cos1);
		double son1 = Math.toDegrees(cosson1);
		double cos2 = ((x-Bx) * (x-Cx)+(y-By)*(y-Cy)) / (Math.pow((Bx-x)*(Bx-x) + (By-y)*(By-y), 0.5) * (Math.pow((Cx-x)*(Cx-x)+(Cy-y)*(Cy-y), 0.5)));
		double cosson2 = Math.acos(cos2);
		double son2 = Math.toDegrees(cosson2);
		double cos3 = ((x-Cx) * (x-Ax)+(y-Cy)*(y-Ay)) / (Math.pow((Cx-x)*(Cx-x) + (Cy-y)*(Cy-y), 0.5) * (Math.pow((Ax-x)*(Ax-x)+(Ay-y)*(Ay-y), 0.5)));
		double cosson3 = Math.acos(cos3);
		double son3 = Math.toDegrees(cosson3);
			
		//Sum of all angles(degree)
		double sum = son1+son2+son3;
		//0.001 is possible error from floating point
		if(Math.abs(sum-360)<0.001){
			System.out.println("The point is in the triangle!");
		}else{
			System.out.println("The point is not in the triangle!!");
		}
		
		input.close();
	}
	
}
