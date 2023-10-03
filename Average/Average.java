package Average;
import java.util.Scanner;

public class Average 
{
	private static Scanner temp;
	
	public static void main(String[] args) 
	{
		temp = new Scanner(System.in);
		System.out.print("Please enter 1st number: ");
		int NUMB1 = temp.nextInt();
		System.out.print("Please enter 2nd number: ");
		int NUMB2 = temp.nextInt();
		System.out.print("The average of the 2 numbers are: " + (NUMB1 + NUMB2)/2);
	}

}
