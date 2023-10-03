package XPY;
import java.util.Scanner;

public class XPY 
{
	private static Scanner temp;

	public static void main(String[]args)
	{
		temp = new Scanner(System.in);
		System.out.print("Please enter the value of X: " );
		int X = temp.nextInt();
		System.out.print("Please enter the value of Y: " );
		int Y = temp.nextInt();
		System.out.print("The value of X to the power of Y is: " + (int)Math.pow(X,Y));
	}
}
