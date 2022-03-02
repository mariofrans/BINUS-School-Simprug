package ReturnValue;

public class SetDimBox 
{
	public static void main(String[]args)
	{
	SetDim mybox = new SetDim();
	
	mybox.setDim(10, 20, 15);
	double volume = mybox.volume();
	System.out.print(volume);
	}
}
