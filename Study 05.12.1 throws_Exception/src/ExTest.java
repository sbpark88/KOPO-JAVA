import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest {
	// 1. try ~ catch 를 활용한 exception 예외처리. (예외가 발생할만한 곳에 try 처리를 한다.)
	public void doAction() {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 10, 390, 5, 20, 8, 7};
		Scanner scanner = new Scanner(System.in);
		
		// 1.1 try ~ catch 사용의 올바른 예
		for (int i = 0; i < 99; i++) {
			System.out.println("'{1, 2, 10, 390, 5, 20, 8, 7}' 배열이 있습니다. 인덱스를 선택해 주세요.");
			try {
				int inputNumber = scanner.nextInt();
				scanner.nextLine();		// nextInt return 찌꺼기 소거용.
				System.out.println("입력된 숫자에 해당되는 값은 " + arr[inputNumber]);
			} catch (ArrayIndexOutOfBoundsException e) {	// try에서 발생한 에러가 인덱스를 벗어난 경우를 catch한다. (인덱스 범위가 0~7인데 8이 들어오는 경우)
				System.out.println("인덱스의 범위를 벗어났습니다. 0 ~ 7 사이로 입력해주세요.");
			} catch (InputMismatchException e) {		// try에서 발생한 에러가 데이터 타입이 잘못된 경우를 catch한다. (문자에 숫자가 들어오거나, 숫자에 문자가 들어오는 경우)
				scanner.nextLine();		// int에 잘못 들어와 소거되지 못 하고 무한루프를 발생시키는 문자 찌꺼기 소거용.
				System.out.println("문자를 입력했습니다. 숫자를 입력해주세요.");
			} catch (Exception e) {		// 모든 Exception의 부모형태다. 항상 마지막에는 Exception e로 끝내준다. 이 경우는 위에서 인덱스 범위 초과, 데이터 입 에러를 모두 잡아서 마지막 Exception e는 타지 않는다.
										// 위에서 모든 에러를 잡았더라도 혹시 모를 에러에 대비하기 위해 마지막에 모든 에러의 부모형인 Exception e로 끝내줘야한다.
				// 오류 출력 방법 1. e.printStackTrace()
				e.printStackTrace();	// 프로그램이 죽지는 않고 에러메세지를 출력해준다.
				// 오류 출력 방법 2. System.out.println(e.getMessage())
				System.out.println(e.getMessage() + " 오류 발생");
			}
			System.out.println("------------------------------------");
		}
		
//		// 1.2 try ~ catch 사용의 잘못된 예
//		try {
//			int inputNumber = scanner.nextInt();
//			System.out.println("입력된 숫자에 해당되는 값은 " + arr[inputNumber]);
//		} catch (Exception e) {		// 얘는 위로 올라오면 안 된다. 모든 Exception의 부모이기 때문에 반드시 마지막으로 가야한다.
//			System.out.println("오류 발생");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스의 범위를 벗어났습니다.");
//		} 
	}
	
	// 2. throws Exception (예외가 발생 시 호출한 곳으로 가져와 처리를 한다.)
	public void doAction2() throws Exception {	// 에러 발생시 호출한 곳으로 보낼거야.
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 10, 390, 5, 20, 8, 7};
		System.out.println("'{1, 2, 10, 390, 5, 20, 8, 7}' 배열이 있습니다. 인덱스를 선택해 주세요.");
		Scanner scanner = new Scanner(System.in);
		
		int inputNumber = scanner.nextInt();	// 여기서는 에러 처리를 하지 않는다. 에러 발생시 호출한 곳으로 에러를 던진다.
		scanner.nextLine();		// nextInt return 찌꺼기 소거용.
		System.out.println("입력된 숫자에 해당되는 값은 " + arr[inputNumber]);
		
	}

}
