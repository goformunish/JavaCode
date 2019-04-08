
public class clonearr {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int clonearr[]=arr.clone();
		System.out.println(arr!=clonearr);
for (int i=0;i<clonearr.length;i++)
{
	System.out.println(clonearr[i]);
}
	}

}
