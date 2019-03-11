package day4;

public class Car extends Machine {
	public Car()
	{
		
		super(10);
		
		System.out.println("Car constructor");
	}
	public void restart()
	{
				System.out.println("Restart method from Car Class");
	}
	public void reset ()
	{
		System.out.println("Reset class from Car Class");
	}
	@Override
	public void start()
	{
		System.out.println("This is an over-riden method");
	}

}
