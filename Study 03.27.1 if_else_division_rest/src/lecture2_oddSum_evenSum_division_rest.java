// 1. 연속된, 홀수, 짝수의 등차급수를 학습함.
// 2. 나누어지는 수와 나누는 수를 입력 받아 몫과 나머지를 계산하는 로직을 작성함.

import java.util.Scanner;

public class lecture2_oddSum_evenSum_division_rest {
	public static void main(String[] args) {
		
		int totalSum = 0;
		int oddSum = 0;
		int evenSum = 0;
		
		for(int i = 0; i < 100; i++) {
			totalSum = totalSum + (i + 1);
		}
		
		System.out.println("1부터 100까지의 숫자의 합은 " + totalSum + " 입니다.\n");
		
		
		for(int i = 0; i < 100; i++) {
			if ((i + 1) % 2 != 0) {
				oddSum = oddSum + (i + 1);
			}
		}
		
		System.out.println("1부터 100까지의 홀수의 합은 " + oddSum + " 입니다.\n");
		
		for(int i = 0; i < 100; i++) {
			if ((i + 1) % 2 == 0) {
				evenSum = evenSum + (i + 1);
			}
		}
		
		System.out.println("1부터 100까지의 짝수의 합은 " + evenSum + " 입니다.\n");
		
		
		// 파이썬에서는 10 / 3 을 하면 몫을 구할 수 있는데 자바에는 몫을 구하는 연산자가 없다.
		// 10 / 3 한 값을 int 형변환 해주면 된다.
		
		System.out.println("나누고 싶은 수를 정수로 입력해주세요.");
		Scanner s = new Scanner(System.in);
		double dividend = s.nextDouble();
		
		System.out.println("몇으로 나누겠습니까? (정수로 입력해주세요.)");
		double divisor = s.nextDouble();
		
		int quotient = 0;
		double remainder = 0;
		
		if (divisor != 0) {
			quotient = (int)(dividend / divisor);
			remainder = dividend % divisor;
			System.out.println(dividend + "를 " + divisor + "로 나눈몫은 " + quotient + "이고 나머지는 " + remainder + "입니다." );
		} else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		
	}
}
