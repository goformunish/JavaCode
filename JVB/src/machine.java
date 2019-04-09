public class machine {
int enginesize;
machine(int enginesize)
{
	System.out.println("MAchine constructor");
	this.enginesize=enginesize;
}
void start() {
	System.out.println("Start method of machine class");
}
void stop()
{
	System.out.println("Stop method of machine class");
}
}
