package access;

public class set {
private int sal, bonus;
void calsal()
{
if (sal<=0)
{
	System.out.println("Please enter the valid value");
} else this.sal=sal;
if (bonus<=0)
{
	System.out.println("Enter the valid value of bonus");
}
else
	this.bonus=bonus;
	int totsal=sal+bonus;
System.out.println(totsal);
}
public void setSal(int sal) {
	this.sal = sal;
}
public void setBonus(int bonus) {
	this.bonus = bonus;
}
}
