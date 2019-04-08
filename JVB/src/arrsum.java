public class arrsum {
public static void sum(int arr[])
{
	int sum=0;
	for (int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println("Sum of the elements of the array is "+sum);
}
}
