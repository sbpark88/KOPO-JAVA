import java.util.Scanner;

public class Test1 {
	public void doAction() throws Exception {
		Scanner s = new Scanner(System.in);
		int inputNumber = s.nextInt();
		if(inputNumber ==1) {
			throw new Exception("input 1");
			
		}
	}

}
