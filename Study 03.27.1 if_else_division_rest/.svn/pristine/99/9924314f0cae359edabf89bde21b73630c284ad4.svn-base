// 스캐너를 이용해 숫자를 입력 받아 여러가지 계산을 수행함.

import java.util.Scanner;

public class HW_InputNumber_Calculate {
	public static void main(String[] args) {
		System.out.println("화면에 숫자를 입력해주세요.");
		// 사용자로부터 코드를 입력받는다.
		
		Scanner s = new Scanner(System.in);
		// 입력 받기 위해 스캐너 코드를 작성한 후 스캐너 모듈을 가져온다.
		
		double userInputNumber = s.nextDouble();
		// 입력 받은 숫자를 정수값 변수 userInputNumber에 저장한다.
		if((userInputNumber-(int)userInputNumber) % 2 == 0) {
			System.out.println("당신이 입력한 숫자는 " + (int)userInputNumber + " 입니다.");
			System.out.println("당신이 입력한 숫자에 +10을 한 값은 " + (int)(userInputNumber + 10) + " 입니다.");
			System.out.println("당신이 입력한 숫자에  -5를 한 값은 " + (int)(userInputNumber - 5) + " 입니다.");
			System.out.println("당신이 입력한 숫자에  *2를 한 값은 " + (int)(userInputNumber * 2) + " 입니다.");
			if(userInputNumber % 2 == 0) {
				System.out.println("당신이 입력한 숫자에  /2를 한 값은 " + (int)(userInputNumber / 2) + " 입니다.");
			} else {
				System.out.println("당신이 입력한 숫자에  /2를 한 값은 " + (userInputNumber / 2) + " 입니다.");
			}
			System.out.println("당신이 입력한 숫자에  %3을 한 값은 " + (int)(userInputNumber % 3) + " 입니다.");
		} else {
			System.out.println("당신이 입력한 숫자는 " + userInputNumber + " 입니다.");
			System.out.println("당신이 입력한 숫자에 +10을 한 값은 " + (userInputNumber + 10) + " 입니다.");
			System.out.println("당신이 입력한 숫자에  -5를 한 값은 " + (userInputNumber - 5) + " 입니다.");
			System.out.println("당신이 입력한 숫자에  *2를 한 값은 " + (userInputNumber * 2) + " 입니다.");
			System.out.println("당신이 입력한 숫자에  /2를 한 값은 " + (userInputNumber / 2) + " 입니다.");
			System.out.println("당신이 입력한 숫자에  %3을 한 값은 " + (userInputNumber % 3) + " 입니다.");		
		}

	}

}