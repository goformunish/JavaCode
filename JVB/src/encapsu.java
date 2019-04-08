public class encapsu {
int sal, bonus;
void calc()
{
	int totsal=sal+bonus;
	System.out.println(totsal);
}
public void setsal(int sal)
{
	if (sal>=0)
	{
	this.sal=sal;
} else 
{
	System.err.println("Please enter the valid value of Salary");
}
}

public int getSal() {
	return sal;
}
public int getBonus() {
	return bonus;
}
public void setBonus(int bonus) {
	if (bonus>=0)
	{
	this.bonus = bonus;
}
	else 
	{
		System.err.println("Please enter the valid value of bonus");
	}
}
}