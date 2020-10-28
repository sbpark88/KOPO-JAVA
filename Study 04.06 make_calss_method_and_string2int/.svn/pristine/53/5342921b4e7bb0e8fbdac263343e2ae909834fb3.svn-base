// Math1 클래스와 그 안에 메소드를 만들어 끌어다 사용하는 것을 학습함.

import java.util.Scanner;

public class lecture2_make_method {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// 메소드는 단독으로 작동하는게 아니고 반드시 클래스와 같이 작동한다. Math1에 만들었다.
		
		Math1 m = new Math1();	// Math1이라는 이름을 가지는 객체변수를 생성.
		m.sumTwoNumber(10, 15);
		
		Math1 mmmm = new Math1();	// 따로 만들어도 되지만 같은 클래스에 있으면 따로 나눌 필요가 없다.
		mmmm.multi3(8);
		
		m.multi3(9);	// 같은 클래스라면 그냥 한 번만 소환하고 이렇게 사용하면 된다.
		
		
		int KKK = m.outputMulti3(70);	// 아웃풋이 있는 메소드
		System.out.println(KKK);
		
		
		// 수업중 실시간 퀴즈
		System.out.println("\n\n-----------------------");
		
		System.out.println("1번째 숫자를 입력해주세요.");
		int num1 = s.nextInt();
		System.out.println("2번째 숫자를 입력해주세요.");
		int num2 = s.nextInt();
		// 1. 값 2개를 1개의 배열로 넘겨서 메소드에서 배열을 분리해서 계산할 수 있음.
		// 2. 값 2개를 문자열로 받아 분리한 다음 숫자로 변환해서 넘겨줘서 계산할 수 있음.
		// 3. 스캐너 자체를 메소드에 넣을 수도 있음.
		
		m.sumTwoNumber(num1, num2);	// 1. 인풋만 있고 아웃풋이 없는 메소드 사용. void 메소드.
		
		System.out.println("합 : " + m.outputTwoNumber(num1, num2));	// 2. 인풋과 아웃풋이 모두 있는 메소드 사용.
		
		
		
	}

}
