import java.util.Scanner;

public class EvenOddCheck {
	public void checkEvenOddUnderUserInput() {
		System.out.println("숫자를 입력해주세요.");
		
		int userInput = 0;
		Scanner s = new Scanner(System.in);
		
//		userInput = s.nextInt();	// 이것도 try 안으로 들어가야 에러가 나지 않는다. 이게 try catch 밖에 나와 있으면 애초에 int로 선언한 변수에 문자를 넣게 되니 에러가 발생.
		
		try {	// 에러가 발생할만한 상황에서 예외처리 하는 방법.
			userInput = s.nextInt();	// try catch 안에 있기 때문에 에러가 나도 죽지 않고 catch로 가서 예외처리 된다. 
			
			if (userInput % 2 == 0) {
				System.out.println("" + userInput + "은(는) 짝수입니다.");
			} else {
				System.out.println("" + userInput + "은(는) 홀수입니다.");
			}			
		} catch (Exception e) {
			System.out.println("숫자(정수)만 입력해주세요.");
		}
		
		
		
	}

}
