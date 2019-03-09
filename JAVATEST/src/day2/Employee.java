package day2;

public class Employee{
private int sal;
  public int getSal() {
	return sal;
}

public int getBonus() {
	return bonus;
}

int bonus;

public void setsal(int sal)
{
	if (sal>=0) {
		this.sal=sal;
	}
	else {
		System.err.println("Invalid sal");
	}
}

public void setBonus(int bonus) {
	this.bonus = bonus;
}

int calculateSalary() {
	int totalsal=sal+bonus;
	return totalsal;
}

}
