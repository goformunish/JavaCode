import java.util.PriorityQueue;
public class pqdemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer> (); 
		for (int i=10; i>=1;i--)
		{
			pq.add(new Integer(i));
		}
for (int i=0;i<10;i++)
{
	Integer c=pq.poll();
	System.out.println(c);
}
	}

}
