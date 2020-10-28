// 문자를 입력 받아 컴퓨터와 하는 가위바위보 게임을 만듦.

import java.util.Random;
import java.util.Scanner;

public class HW_ScissorsRockPaperGame {
	public static void main(String[] args) {
				
		System.out.println("'가위', '바위', '보'를 입력해주세요.");
		
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		String you = s.nextLine();		// 문자로 입력을 받는다.
		int yourNum = 0;				// 계산을 위해 문자를 특정 숫자값으로 변환해 담을 공간.
		int computer = r.nextInt(3);	// 컴퓨터의 값을 입력 받는다.
		
		
		if (you.equals("가위")) {			// 문자열은 다른 언어와 달리 == 비교 연산자를 사용할 수 없다. equlas(Object)를 사용한다.
			yourNum = 0;				// 계산을 위해 문자를 숫자로 변환.
		} else if (you.equals("바위")) {
			yourNum = 1;
		} else {
			yourNum = 2;
		} 
		
		// print에 한글로 출력을 하기 위한 변수 선언.
		String scissors = "가위";
		String rock = "바위";
		String paper = "보";
		
		String yourDecision = "none";
		String computerDecision = "none";
		
		// 0:가위, 1:바위, 2:보  어떤것을 냈는 매칭시켜주기 위한 변수 선언.
		if (yourNum == 0) {
			yourDecision = scissors;
		} else if (yourNum == 1) {
			yourDecision = rock;
		} else {
			yourDecision = paper;
		}
		
		if (computer == 0) {
			computerDecision = scissors;
		} else if (computer == 1) {
			computerDecision = rock;
		} else {
			computerDecision = paper;
		}
		
		// 어떤 것을 냈는지 출력.
		System.out.print("사용자는 " + yourDecision + "을(를) 냈고 ");
		System.out.print("컴퓨터는 " + computerDecision + "을(를) 내서 ");
		
		// 승패 여부를 가려서 결과를 출력해주는 로직.
		if (yourNum == computer) {
			System.out.println("사용자와 컴퓨터는 비겼습니다.");
		} else if (yourNum - computer == 1) {
			System.out.println("사용자가 이겼습니다.");
		} else if (yourNum - computer == -2) {
			System.out.println("사용자가 이겼습니다.");
		} else {
			System.out.println("컴퓨터가 이겼습니다.");
		}
			
		
	}
	

}