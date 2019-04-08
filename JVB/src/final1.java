class jkl {
	void fun()
	{
	System.out.println("Test");	
	}
}
class jkl1 extends jkl
{
	void fun()
	{
}
}
public class final1 {


	public static void main(String[] args) {
int i=10;
final int j=20;
i=30;
System.out.println(i);
System.out.println(j);
jkl c=new jkl();
c.fun();
	}

}
