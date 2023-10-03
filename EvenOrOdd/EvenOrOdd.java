package EvenOrOdd;

import java.util.Scanner;

public class EvenOrOdd 
{
	private static Scanner temp;
	
	public static void main(String[] args) 
	{
		temp = new Scanner(System.in);
		System.out.print("Please enter your number between 0 and 100: ");
		int X = temp.nextInt();
		
		if(X<100 && X>0)
		{
			if(X%2 == 1)
			{
			System.out.print("Your number is odd");
			}
			else
			{
			System.out.print("Your number is odd");
			}
		}
		else
		{
			System.out.print("Your number isn't between 0 and 100");
		}
	}
}
