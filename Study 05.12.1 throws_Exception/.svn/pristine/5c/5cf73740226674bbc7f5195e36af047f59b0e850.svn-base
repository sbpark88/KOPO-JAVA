import java.util.Scanner;
import java.util.InputMismatchException;

public class ExecClass {
//	// 1. try ~ catch 를 활용한 exception 예외처리. (예외가 발생할만한 곳에 try 처리를 한다.)
//	public static void main(String[] args) {
//		ExTest exTest = new ExTest();
//		try {
//			exTest.doAction();
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
//	}
	
	// 2. throws Exception (예외가 발생 시 호출한 곳으로 가져와 처리를 한다.)
	public static void main(String[] args){	// 처리할 곳이 있다면... throws Exception으로 ExTest의 doAction2에서 받아온 에러를 다시 위로 던질 수도 있다.
		ExTest exTest = new ExTest();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 99; i++) {
			try {
				exTest.doAction2();
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
	}
}
