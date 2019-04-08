public class empl {
	int sal=70;
	int bonus=90;
	empl ()
	{
		
		sal=40;
		bonus=5;
	}
	empl(int sal, int bonus)
	{
		this.sal=sal;
		this.bonus=bonus;
	}
	void calc()
	{
	
		int totsal=sal+bonus;
		System.out.println(totsal);
	}
	
}