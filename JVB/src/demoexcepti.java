
public class demoexcepti {

	public static void main(String[] args)  {
		try {
			excepti ec=new excepti();
			ec.invoke();
			ec.login();
			ec.adduser();
			ec.logout();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
finally
{
	System.out.println("Close the browser");
}
	}

}
