
public class except {

	public static void main(String[] args) {

		try {
			int arr[] = { 1, 2, 3, 4, 5, 6 };
			for (int i = 0; i <= arr.length-1; i++) {
				System.out.println(arr[i]);
				/* String mun = "Munish";
				char chararr[]=mun.toCharArray();
					String value= String.valueOf(chararr,10,10);
				System.out.println(value);*/
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Exception occured");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index Exception occured");
		} catch (RuntimeException e) {
			System.out.println("Run time Exception occured");
		}

		catch (Exception e) {
			System.out.println("Exception occured");
		}
finally {
	System.out.println("I always execute");
}
	}

}
