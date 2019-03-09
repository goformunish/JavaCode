package day1;

public class demoEmployee {

	public static void main(String[] args) {
		Employee munish;
		munish=new Employee();
munish.sal=200;
munish.bonus=20;
		munish.calculateSalary();
		Employee Parul;
		Parul=new Employee(553,3);
		Parul.calculateSalary();


	}

}
