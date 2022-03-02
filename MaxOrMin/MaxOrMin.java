package MaxOrMin;
import java.util.Scanner;

public class MaxOrMin {

	private static Scanner temp;

	public static void main(String[] args) 
	{
		temp = new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		int X = temp.nextInt();
		System.out.print("Please enter your second number: ");
		int Y = temp.nextInt();
		
		if(X>Y)
		{
			System.out.print("Your first number is bigger than your second number");
		}
		else if(X<Y)
		{
			System.out.print("Your first number is less than your second number");
		}
		else
		{
			System.out.print("Your first number is equal to your second number");
		}
	}
}
