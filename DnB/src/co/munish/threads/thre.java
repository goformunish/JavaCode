package co.munish.threads;

class thee extends Thread 
{
	String msg="I am message who sleeps";
	void read ()
	{
		for (int i=0;i<=2;i++)
		{
		System.out.println(msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}
}
public class thre {

	public static void main(String[] args) {
	thee th=new thee();
	
th.read();

	}

}
