package Constructor;
//initialize an object upon creation
//similar to method
//same name as the class it is in

public class Constructor 
{
	double width;
	double height;
	double depth;

	Constructor(double width, double height, double depth)
	{
		System.out.println(width*height*depth);
	}
	 
	public static void main(String[]args)
	{
		Constructor Box1 = new Constructor(10,20,30);
		Constructor Box2 = new Constructor(10,25,30);
		Constructor Box3 = new Constructor(30,30,30);
	}

}
