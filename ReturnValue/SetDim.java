package ReturnValue;

public class SetDim 
{
	double width;
	double height;
	double depth;
	double volume; 
	
	double volume()
	{
		volume = width * height * depth;
		System.out.print("Volume is: " + volume);
		return volume;
	}
	
	void setDim(double height, double width, double depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}


