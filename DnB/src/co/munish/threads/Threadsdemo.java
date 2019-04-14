package co.munish.threads;

class mythread extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			
			System.out.println("Mythread " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class mythread1 extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Mythread1 " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class mythread2 implements Runnable
{
	public void run()
	{
		for (int i=1;i<=10;i++)
		{
		System.out.println("Mythread implementing the runnable");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
class task {
	void task() {
		System.out.println("This is a task");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Threadsdemo {

	public static void main(String[] args) {
		mythread thr = new mythread();
		thr.start();
		try {
			thr.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		mythread1 thr1 = new mythread1();
		thr1.start();
		Runnable r=new mythread2();
		Thread thr2=new Thread(r);
		thr2.start();
		thr.setPriority(Thread.MAX_PRIORITY);
		thr1.setPriority(Thread.MIN_PRIORITY);
		thr2.setPriority(Thread.NORM_PRIORITY);
		System.out.println("Prio for thr is "+thr.getPriority());
		System.out.println("Prio for thr1 is "+thr.getPriority());
		System.out.println("Prio for thr2 is "+thr.getPriority());
		/*
		 * task tes=new task(); tes.task(); System.out.println("Main method started");
		 */
		for (int i = 0; i <= 10; i++) {
			System.out.println("-------------Main----------------");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("For loop in main ended");
	}

}
