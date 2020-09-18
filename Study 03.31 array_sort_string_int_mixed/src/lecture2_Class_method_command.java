// 클래스와 메소드의 관계, 명령으로 사용하는 방법을 학습함.

import java.util.Arrays;
import java.util.Scanner;

public class lecture2_Class_method_command {
		public static void main(String[] args) {	// 메소드(method)는 중괄호로 묶는다. 메소드 = 타 언어에서 함수라 부르는 것.
													// 메소드를 사용할 때(command)는 () 괄호로 명령한다.
													// 메소드는 일반적으로 클래스 안에 만들어 실행한다. 그리고 클래스는 대문자로 시작한다.
			
			int[] numbers = new int[10];	// 빈 배열을 선언.
			Scanner s = new Scanner(System.in);
			
			for (int i = 0; i < numbers.length; i++) {	// 배열의 길이만큼 실행.
				System.out.println((i + 1) + "번째 숫자를 입력해주세요.");
				numbers[i] = s.nextInt();		// 클래스.메소드 // 클래스야.메소드 해줘 // 스캐너야.인트값에 넣어줘 (메소드를 사용할 때는 ()로 명령)
			}									
			
//			Arrays a2 = new Arrays();
			System.out.println(Arrays.toString(numbers));
			// 클래스.메소드 // 클래스야.메소드 해줘 // (자주 쓰이는 것들은 자바 이미 포함되어있다. 즉, 내장함수다. 클래스 Arrays는 대문자로 시작한.)
	
			
		}

}
