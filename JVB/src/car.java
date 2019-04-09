public class car extends machine{
	
	car()
	{
		super(10);
		enginesize=10;
		start();
		System.out.println("Car constructor");
	}
void restart()
{
	System.out.println("ReStart method of car class");
	start();
}
void restop()
{
	System.out.println("Stop method of car class");
}
void start() {
	System.out.println("Start method of car class");
}

}
