// 빈 배열을 생성하고 스캐너로 값을 입력해보는 연습을 함.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lecture1_makeEmptyArray {
	public static void main(String[] args) {
		
		// 사용자로부터 값 5개를 입력 받아 배열로 만들고 합 구하기.
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);	// 필요하다면 2개를 불러낼 수도 있다. 아마 안 쓸 것 같지만...
		
		System.out.println("정수 5개를 입력하겠습니다.");
		
		int[] arr2 = new int[5];		// 공간을 미리 만들어줘야한다.
		int arrSum = 0;					// 합을 담을 변수 선언.
		
		
		for (int i = 0; i < arr2.length; i++) {	// .length로 배열의 길이를 반환해서 반복문에 조건으로 사용한다.
			System.out.println((i+1) + "번째 숫자를 입력해주세요.");
			arr2[i] = s.nextInt();
			arrSum += arr2[i];
		}
        System.out.println("");
		System.out.println("입력한 숫자는 다음과 같습니다.");
		System.out.println(Arrays.toString(arr2));
		System.out.println("입력 받은 값 5개의 합은 " + arrSum + "입니다.");
	
	}


}
