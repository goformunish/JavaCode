package day2;

import day2.Employee;

public class demoEmployee {

	public static void main(String[] args) {
		Employee munish;
		munish=new Employee(); 
munish.setsal(200);
munish.setBonus(20);

		System.out.println(munish.calculateSalary());
	
		System.out.println(munish.getSal());
	}

}
