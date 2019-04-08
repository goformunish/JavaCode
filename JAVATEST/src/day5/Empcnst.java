package day5;

public class Empcnst {
	int sal, bonus;
	public Empcnst(int sal, int bonus)
	{
		System.out.println("I am in a constructor");
		this.sal=sal;
		this.bonus=bonus;
	}
 void calsal()
{
	int  calsal;
	calsal=sal+bonus;
	System.out.println(+calsal);
}

}
