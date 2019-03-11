package day4;

public class Cylinder extends ThreeDshape{

	@Override
	public double calculateArea(int radius) {
		double area=Math.PI*radius*radius;
		return area;
	}

}
