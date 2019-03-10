package day3;

public class demoCar {

	public static void main(String[] args) {
		Machine mac=new Machine();
		Car alto=new Car();
		mac.start();
		mac.stop();
		alto.restart();
		alto.reset();
		Machine ford=new Car();
		ford.start();
		ford.stop();  	
	}

}
