package day5;

public class demoMSOffice {

	public static void main(String[] args) {
		MSExcel msexcl=new MSExcel();
		msexcl.start();
		msexcl.save();
		msexcl.open();
		MSOffice msexcl1=new MSExcel();
		msexcl1.save();
	}

}
