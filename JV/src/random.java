import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class random {

	public static void main(String[] args) throws IOException {
		Random r=new Random();
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				"C:\\Users\\C58810\\ECD\\DnB\\Data\\initial_load_2019_20000\\20000\\output.txt", true));
for (int i=0;i<=10000;i++)
{
	System.out.println(r.nextInt(100));
	bw.write(r.nextInt(100000)+"\n");
}
bw.close();
	}

}
