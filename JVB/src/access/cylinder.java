package access;

public class cylinder extends threedshape{

	@Override
	double area(int len) {
		double areacircle=Math.PI*len*len;
		return areacircle;
	}

	

}
