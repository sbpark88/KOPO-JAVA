// 숫자를 입력 받아 자릿수를 계산하는 방법으로 나눗셈 연산자의 활용법을 학습함.

import java.util.Random;

public class lecture1_distinction_digit {
	public static void main(String[] args) {
		int a = 10;
		int b = 9;
		
		System.out.println(a == 10);	// 조건을 판별하는 방법. == 2개를 이어 붙여서 사용한다. true를 반환.
		System.out.println(a == b);		// 조건을 판별하는 방법. == 2개를 이어 붙여서 사용한다. flase를 반환.
		
		short c = (short)a;				// 명시적 형변환의 예.
		
		Random r = new Random();
//		int a = r.nextInt(200);
		
		
		if ( a > 99) {    // a >= 100
			System.out.println(a + "는 3자리 이상 숫자입니다.");
		} else if ( a > 9) {    // 10 <= a < 100
			System.out.println(a + "는 2자리 이상 숫자입니다.");
		} else {    // 0 < a < 10
			System.out.println(a + "는 1자리 이상 숫자입니다.");
		}
		
		// switch 문으로 바꿔볼 수도 있다. 하지만 가급적 if문 사용에 익숙해지도록 하자.
		if (a % 3 == 0) {
			System.out.println(a + "을 3으로 나눈 나머지는 0입니다.");
		} else if (a % 3 == 1) { 
			System.out.println(a + "을 3으로 나눈 나머지는 1입니다.");
		} else {
			System.out.println(a + "을 3으로 나눈 나머지는 2입니다.");
		}
	
	}
}
