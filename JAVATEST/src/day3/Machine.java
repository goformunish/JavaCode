package day3;

public class Machine {
	public Machine() {
		System.out.println("Machine constructor");
	}
int engineSize;
public Machine (int engineSize)
{
	this.engineSize=engineSize;
			System.out.println("Machine Constructor "+engineSize);
}
public void start()
{
System.out.println("Start method of machine");
}
public void stop()
{
System.out.println("Stop method of machine");
}
}
