import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class ClassApp {

	public static void main(String[] args) throws IOException  {
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.6));
		System.out.println(Math.ceil(1.6));
		
		PrintWriter p1= new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();

		PrintWriter p2= new PrintWriter("result2.txt");
		p1.write("Hello 2");
		p1.close();
	}

}
