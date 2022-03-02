package HelloExercise;
import java.util.Scanner;

public class HelloExercise 
{
	private static Scanner temp;
	
	public static void main(String[] args)
	{
		temp = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String NAME = temp.next();
		System.out.print("Hello " + NAME);
	}
}
