import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ExecMain {
	public static void main(String[] args) throws IOException  {
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(".//Hello Polytech.txt");
			out = new FileOutputStream(".//Hello Polytech2.txt");
			System.out.println("실행1");
			while(true) {
				int data = in.read();
				System.out.println("실행2 : " + data);
				if (data == -1) {
					System.out.println("실행3");
					break;
				}
				out.write(data);
				System.out.println("실행4");
			}
		} catch (Exception e) {
			System.out.println("실행5");
		} finally {	// try ~ catch 구문 뒤에 붙어 '작동을 보장해야 하는 로직'을 넣는다.
			if (in != null) {
				in.close();
			}
			if (out != null ) {
				out.close();
			}
			System.out.println("실행6");
		}
	}
}
