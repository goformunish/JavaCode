package co.munish.threads;
class message {
	String msg;
	
	message()
	{
		msg="msg initialized";
		
	}
	
	void write()
	{
		msg="I am overriding the msg";
		System.out.println("Writing the message");
	}
	void read()
	{
		System.out.println("Message is "+msg);
		
	}
}
class reader extends Thread 
{
message m;
reader(message n)
{
	m=n;
}
public void run()
{
	synchronized(m)
	{
		m.read();
	}
}
}

class writer extends Thread 
{
message m;
writer(message n)
{
	m=n;
}
public void run()
{
	synchronized(m)
	{
		m.write();
	}
}
}
public class practise {
	
	public static void main(String[] args) {
		message m=new message();

		//mes.read();
		//mes.write();
		reader rd=new reader(m);
		writer wt=new writer(m);
		rd.start();
		rd.start();
		
		
		

	}

}
