package access;

public abstract class threedshape {
double volume(int len, int height)
{
	double volume=area(len)*height;
	return volume;
}
abstract double  area(int len);

}
