// 문자의 비교연산, 문자를 숫자로 형변환, 종료 조건을 사용자가 입력하여 작동하는 것을 학습함.

import java.util.Scanner;

public class lecture1_textComparisonStopCondition {
	public static void main(String[] args) {
		
		// 1. 숫자를 입력 받아 짝수인지 홀수인지 판단하세요.
		// 2. "q"라는 문자가 입력되면 종료되는 조건을 만드세요.
		
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 999999; i++) {
			System.out.println("숫자를 입력하세요. 종료 시 q 입력.");	// 문자열을 입력 받아 분리시키는거 정리해보기. split
			String inputNumber = s.nextLine();	// 클래스 이름을 만들 때는 대문자로 시작한다. 즉 대문자로 시작하면 클래스다. // 클래스 외에는 소문자로 시작.
			
			if (inputNumber.equals("q")) {	// 문자열은 == 로 비교가 안 된다. (간혹 되는 경우 있지만 안 된다고 생각해라.) 크다 작다 비교연산도 문자열은 > 로 안 된다.
				break;
			}
			
			int convertNumber = Integer.parseInt(inputNumber);
			
//			int convertNumber = (int)inputNumber;	//	자바에서는 이렇게는 문자를 숫자로 변환할 수 없다.
			
			if (convertNumber % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.err.println("홀수입니다.");
			}
			
			System.out.println();
			
		}

	}

}
