package co.munish.io;
import java.util.*;

public class demodate {

	public static void main(String[] args) {
		Date date=new Date();
System.out.println(date);
Calendar cal=Calendar.getInstance();
System.out.println(cal.get(cal.HOUR_OF_DAY));
System.out.println(cal.get(cal.MINUTE));
System.out.println(cal.get(cal.SECOND));
Scanner scn=new Scanner(System.in);
System.out.println("Enter the value of a: ");
int a=scn.nextInt();
System.out.println("Ënter the value of b: ");
int b=scn.nextInt();
int c=a+b;
System.out.println("Sum of values you entered is: "+c);
	}

}
