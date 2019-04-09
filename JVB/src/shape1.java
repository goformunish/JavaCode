public class shape1 {
void calc(int r)
{
	double area=Math.PI*r*r;
	System.out.println(area);
}
void calc(int len, int bread)
{
	double area=len*bread;
	System.out.println(area);
}
void calc(int len, double bread)
{
	double area=len*bread;
	System.out.println(area);
}
void calc(int len, int bread, int height)
{
	double area=len*bread*height;
			System.out.println(area);
}
}
