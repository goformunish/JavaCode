package day1;

public class Employee {
int sal;
int bonus;
void calculateSalary() {
	int totalsal=sal+bonus;
	System.out.println(+totalsal);
}
	int calculateSalary1() {
		int totalsal=sal+bonus;
		return totalsal;
	}	
		int calculateSalary2(int sa,int bon) {
			int totalsal=sa+bon;
			return totalsal;
}
}
