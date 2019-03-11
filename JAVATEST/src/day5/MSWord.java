package day5;

public class MSWord implements MSOffice{

	@Override
	public void start() {
		System.out.println("Start method of MS Word");
		
	}

	@Override
	public void saveas() {
		System.out.println("Saveas method of MS Word");
		
	}

	@Override
	public void save() {
		System.out.println("Save method of MS Word");
		
	}

}
