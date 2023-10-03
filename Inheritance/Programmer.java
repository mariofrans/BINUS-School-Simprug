package Inheritance;

class Programmer extends Employee
{
	int bonus = 1000;
	public static void main(String[]args)
	{
		Programmer P = new Programmer();
		System.out.print("Programmer salary is: " + P.bonus);
		System.out.print("Programmer salary is: " + P.salary);
	}
}
