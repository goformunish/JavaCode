
public class methodoverload {
  void calculate(int a)
{
	double area=a*a;
	System.out.println("Area of the square is "+area);
}
  void calculate (int len, int bread)
{
	double area=len*bread;
	System.out.println("Area of the rectangle is "+area);
}
  void calculate (int len, double bread)
{
	double area=len*bread;
	System.out.println("Area of the rectangle is "+area);
}
  void calculate (double len, int bread)
{
	double area=len*bread;
	System.out.println("Area of the rectangle is "+area);
}
}
