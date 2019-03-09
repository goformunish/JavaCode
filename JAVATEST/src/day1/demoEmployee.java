package day1;

public class demoEmployee {

	public static void main(String[] args) {
		Employee munish;
		munish=new Employee();
munish.sal=7000;
munish.bonus=700;
munish.calculateSalary();
int sal=munish.calculateSalary1();
System.out.println(+sal);
int sal1=munish.calculateSalary2(6500,500);
System.out.println(+sal1);
	}

}
