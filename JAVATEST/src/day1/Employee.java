package day1;

public class Employee {
int sal;
int bonus;
public Employee()
{
System.out.println("I am in a constructor");
	sal=200;
	bonus=300;
	}
public Employee(int sal, int bonus)
{
System.out.println("I am in a constructor");
	this.sal=sal;
	this.bonus=bonus;
	}

void calculateSalary() {
	int totalsal=sal+bonus;
	System.out.println(+totalsal);
}
	int calculateSalary1() {
		int totalsal=sal+bonus;
		 
		 return totalsal;
		 
	}	
		int calculateSalary2(int sal,int bonus) {
			int totalsal=sal+bonus;
			return totalsal;
}
}
