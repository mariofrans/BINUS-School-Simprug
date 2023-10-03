package Shapes;

import java.util.Scanner;

public class Shapes 
{
	private static Scanner temp;

	public static void main(String[]args)
	{	
		Menu();
	}
		
	static void Menu()
	{
		temp = new Scanner(System.in);
		System.out.println("Please choose a shape: ");
		System.out.println("1.Square");
		System.out.println("2.Rectangle");
		System.out.println("3.Circle");
		System.out.println("4.Triangle");
		System.out.print("Enter the number: ");
		int X = temp.nextInt();
	
			if(X == 1)
			{
				Square(); //calls the square method
			}
			if(X == 2)
			{
				Rectangle(); //calls the rectangle method
			}
			if(X == 3)
			{
				Circle(); //calls the circle method
			}
			if(X == 4)
			{
				Triangle(); //calls the triangle method
			}	
			if(X!=1 && X!=2 && X!=3 && X!=4)
			{
				System.out.println("The value entered doesn't represent any shape");
				System.out.println(" ");
				Repeat();
			}
	}
	
	static void Square()
	{
		temp = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("You chose a square");
		System.out.print("Please enter the sides of the square: ");
		float A = temp.nextInt();
		System.out.println("The area of the square is " + (A*A));
		System.out.println(" ");
		
		System.out.println("Do you want to print shape?");
		System.out.println("1.Yes");
		System.out.println("2.No");
		System.out.print("Please enter the number: ");
		int I = temp.nextInt();
		System.out.println(" ");
		if(I==1)
		{
			for(int G = 1; G <= 4; G++)
			{
				for(int H = 2; H <= 4; H++)
				{
				System.out.print("*");
				System.out.print(" ");
				}
				System.out.println("*");
			}
		}
		System.out.println(" ");	
		Repeat();
	}
	
	static void Rectangle()
	{
		temp = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("You chose a rectangle");
		System.out.print("Please enter the width of the rectangle: ");
		float A = temp.nextInt();
		System.out.print("Please enter the height of the rectangle: ");
		float B = temp.nextInt();
		System.out.println(" ");
		if(B == A)
		{
			System.out.println("The object is not a rectangle because the height and width are the same");
			System.out.println(" ");
			Repeat();
		}
		else
		{
			System.out.println("The area of the rectangle is " + (B*A));
			System.out.println(" ");
			
			System.out.println("Do you want to print shape?");
			System.out.println("1.Yes");
			System.out.println("2.No");
			System.out.print("Please enter the number: ");
			int I = temp.nextInt();
			System.out.println(" ");
			if(I==1)
			{
				for(int G = 1; G <= 3; G++)
				{
					for(int H = 2; H <= 7; H++)
					{
					System.out.print("*");
					System.out.print(" ");
					}
					System.out.println("*");
				}
			}
			System.out.println(" ");	
		}
		Repeat();
	}
	
	static void Circle()
	{
		temp = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("You chose a circle");
		System.out.print("Please enter the radius of the circle: ");
		float A = temp.nextInt();
		System.out.println("The area of the circle is " + ((22*A*A)/7));
		System.out.println(" ");
		
		System.out.println("Do you want to print shape?");
		System.out.println("1.Yes");
		System.out.println("2.No");
		System.out.print("Please enter the number: ");
		int I = temp.nextInt();
		System.out.println(" ");	
		if(I==1)
		{
			System.out.println("    *  *");
			System.out.println(" *        *");
			System.out.println("*          *");
			System.out.println("*          *");
			System.out.println(" *        *");
			System.out.println("    *  *");
		}
		System.out.println(" ");	
		Repeat();
	}
	
	static void Triangle()
	{
		temp = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("You chose a triangle");
		System.out.print("Please enter the length of the triange: ");
		float A = temp.nextInt();
		System.out.print("Please enter the height of the triangle: ");
		float B = temp.nextInt();
		System.out.println("The area of the triangle is " + (A*B)/2);
		System.out.println(" ");
		
		System.out.println("Do you want to print shape?");
		System.out.println("1.Yes");
		System.out.println("2.No");
		System.out.print("Please enter the number: ");
		int I = temp.nextInt();
		System.out.println(" ");	
		if(I==1)
		{
			int K = 1;
			System.out.println("*");
			for(int J = 1; J<5; J++)
			{
				while(K<5)
				{
					for(int L=0;L<=K;L++)
					{
					System.out.print("*");
					System.out.print(" ");
					}
					System.out.println(" ");
					K = K+1;
				}
			}
			System.out.println(" ");	
		}
		Repeat();
	}
	
	static void Repeat()
	{	
		System.out.println("Do you want to repeat?");
		System.out.println("1.Yes");
		System.out.println("2.No");
		System.out.print("Please enter the number: ");
		int Z = temp.nextInt();
		System.out.println(" ");
		if(Z == 1)
		{
			Menu();
		}
		if(Z == 2)
		{
			Thanks();
		}
	}
	
	static void Thanks()
	{
		System.out.print("Thank you for using this app");
	}
}

