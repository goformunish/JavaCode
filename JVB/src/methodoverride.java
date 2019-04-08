class parent {
	void override()
	{
		System.out.println("This is parent method");
	}
}

class child extends parent
{
 	void override()
	{
		System.out.println("This is child method");
	}
}

public class methodoverride {

	public static void main(String[] args) {
		child cref=new child();
cref.override();
	}

}
