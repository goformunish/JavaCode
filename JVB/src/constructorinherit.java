class a {
	int len;
	a()
	{
		len=15;
		System.out.println("Constructor A");
	}
}
 class b extends a
 {
	 b()
	 {
		 System.out.println("Constructor B");
	 }
 }
 class c extends b 
 {
	 c()
	 {
		 System.out.println("Constructor C");
	 }
 }
public class constructorinherit {

	public static void main(String[] args) {
		c cref=new c();
		System.out.println(cref.len);
			}

}
