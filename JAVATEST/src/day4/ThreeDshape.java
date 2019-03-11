package day4;

public abstract class ThreeDshape {

	public double calculateVolume(int length, int height)
	{
		double volume;
		volume=calculateArea(length)*height;
		return volume;
	}
	public abstract double calculateArea(int length);
	
}
