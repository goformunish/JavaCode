package day5;

public class Emp1 {
	 private int sal;
	private int bonus;
	
	public void setsal(int sal)
	{
		if (sal>=0)
		this.sal=sal;
		else System.err.println("Please enter the valid value");
	}
	
	public void setBonus(int bonus) {
		if (bonus>=0)
		this.bonus = bonus;
		else System.err.println("Please enter the valid value");
	}

	public int getSal() {
		return sal;
	}

	public int getBonus() {
		return bonus;
	}

	void calsal()
	{
		int calsal;
		calsal=sal+bonus;
		System.out.println(+calsal);
	}

}
