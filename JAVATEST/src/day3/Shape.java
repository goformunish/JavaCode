package day3;

public class Shape {


public double calcarea(int length, int breadth)
{
	int area;
	area=length*breadth;
	return area;
	}
public double calcarea(int side)
{
	double area;
	area=side*side;
	return area;
}
public double calcarea(double radius)
{
	double area;
	area=Math.PI*radius*radius;
	return area;
}

}
