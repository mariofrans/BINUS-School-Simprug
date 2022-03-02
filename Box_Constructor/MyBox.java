package Box_Constructor;
//this is the object

public class MyBox 
{
	public static void main(String[] args)
	{
		BoxMethod mybox = new BoxMethod();
		//assign values to my box instance variables
		
		mybox.width = 600;
		mybox.height = 20;
		mybox.depth = 15; //compute volume of box
		
		mybox.volume();
	}
}
