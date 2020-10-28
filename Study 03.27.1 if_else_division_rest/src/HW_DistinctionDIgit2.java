// 스캐너로 숫자를 입력 받아 자릿수와 자릿수 이하의 숫자를 계산하는 로직을 만듦.

import java.util.Scanner;

public class HW_DistinctionDIgit2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int divided = s.nextInt();
		int divisor1 = 10;
		int divisor10 = 100;
		int divisor100 = 1000;
		int divisor1000 = 10000;
		int divisor10000 = 100000;

	
		System.out.println(divided + "의 일의 자릿수는 " + (divided % divisor1) + "입니다.\n");		// 10으로 나눈 나머지
		
		System.out.println(divided + "의 십의 자릿수 이하는 " + (divided % divisor10) + "입니다.");		// 100으로 나눈 나머지
		System.out.println(divided + "의 십의 자릿수는 " + (divided % divisor10 / divisor1) + "입니다.\n");		// 100으로 나눈 나머지를 10으로 나눈 몫
		
		System.out.println(divided + "의 백의 자릿수 이하는 " + (divided % divisor100) + "입니다.");	// 1,000으로 나눈 나머지
		System.out.println(divided + "의 백의 자릿수는 " + (divided % divisor100 / divisor10) + "입니다.\n");	// 1,000으로 나눈 나머지를 100으로 나눈 몫
		
		System.out.println(divided + "의 천의 자릿수 이하는 " + (divided % divisor1000) + "입니다.");	// 10000으로 나눈 나머지
		System.out.println(divided + "의 천의 자릿수는 " + (divided % divisor1000 / divisor100) + "입니다.\n");	// 10,000으로 나눈 나머지를 1,000으로 나눈 몫
		
		System.out.println(divided + "의 만의 자릿수 이하는 " + (divided % divisor10000) + "입니다.");	// 100,000으로 나눈 나머지
		System.out.println(divided + "의 만의 자릿수는 " + (divided % divisor10000 / divisor1000) + "입니다.\n");	// 100,000으로 나눈 나머지를 10,000으로 나눈 몫

	}

}
