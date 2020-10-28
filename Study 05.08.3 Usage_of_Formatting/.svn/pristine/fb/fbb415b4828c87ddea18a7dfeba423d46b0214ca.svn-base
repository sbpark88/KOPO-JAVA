import java.util.Arrays;

public class HowCanIUseFormatting {
	public static void main(String[] args) {
		
		// Math.random()이 0:1 숫자 랜덤 생성이니까 이걸 5로 곱해주면 0:5 랜덤 생성.
		// 이걸 버림 하면 0, 1, 2, 3, 4 실수형태의 정수(0.0, 1.0 등) 랜덤 생성.
		System.out.println("Math.floor(Math.random() * 5) : " + Math.floor(Math.random() * 5));
		
		System.out.println("-----------------------------------");
		
		System.out.println("1. int, Integer");
		// 1.1 일반 자료형으로 생성한 a
		int intA = 10;
		// 1.2 객체 자료형으로 생성한 b
		Integer integerA = new Integer(5);
		// 1.3 int와 Integer는 자유롭게 형변환 및 연산이 가능하다.
		int intB = integerA;
		Integer integerB = intA;
		System.out.println("int + Integer 연산도 가능하다. " + (intB + integerB));

		System.out.println("-----------------------------------");
		
		// 2. 포맷팅의 몇 가지 예
		System.out.println("2. 포맷팅의 몇 가지 예");
		// Formatting을 하게 되면 더이상 숫자가 아닌 문자열이 된다. (그래서 문자열 처리가 중요하다!!)
		String r1 = String.format("%04d", intA);			// 공간 4로 만들고, 빈 공간에 0을 채움.
		String r2 = String.format("%4d Hello", intA);		// 공간 4를 만들고, 뒤에는 그냥 Hello라는 문자열을 붙임.
		String r3 = String.format("%4o", intA);				// 10(10) -> 12(8) 진수 변환 가능.
		
		System.out.println(r1 + "         <- String.format('%04d', 10)");
		System.out.println(r2 + "   <- String.format('%04d Hello', 10)");
		System.out.println(r3 + "         <- String.format('%o', 10)");
		
		System.out.println("-----------------------------------");		
		
		// 3. 문자열 분리
		System.out.println("3. 문자열 분리");

		System.out.println("'abc,11,22,44'를 ','로 분리");
		String a2 = "abc,11,22,44";
		String[] arr2 = a2.split(",");
		System.out.println(Arrays.toString(arr2));
		System.out.println();
		
		System.out.println("'abc 11 22 44'를 ' '로 분리");
		String a3 = "abc 11 22 44";
		String[] arr3 = a3.split(" ");
		System.out.println(java.util.Arrays.toString(arr3));	// 이렇게 풀네임으로 쓰면 import 없이 쓸 수 있다.
		System.out.println();
		
		System.out.println("정규표현식을 사용항 분리");
		System.out.println("'oib2zqnu32pinfb2pa'를 숫자를 기준으로 분리");
		String a4 = "oib2zqnu32pinfb2pa";
		String[] arr4 = a4.split("[0-9]");						// 정규표현식을 사용한 분리 (숫자를 기준으로 분리)
		System.out.println(Arrays.toString(arr4));
		System.out.println();
		
		// 문자열 치환
		System.out.println("hellow world에서 world를 Polytech으로 치환");
		String a5 = "hellow world";
		a5 = a5.replace("world","Polytech");
		System.out.println(a5);
		System.out.println();
		
		// 인덱스를 이용해 문자열 뽑아내기
		System.out.println("'hello Polytech'에서 인덱스 1:5 문자열 뽑아내기");
		String a6 = a5.substring(1,5);
		System.out.println(a6);
		System.out.println();
		
		// 4. 숫자를 문자열로 바꾸는 가장 쉬운 방법 (숫자 앞에 ""을 더한다.)
		System.out.println("4. 숫자를 문자열로 바꾸는 가장 쉬운 방법 (숫자 앞에 \"\"을 더한다.)");
		int q = 7;
		System.out.println("int q : " + q);
		String k = "" + q;
		System.out.println("String k : " + k  + "   <-" + k.getClass());
		
		
	}

}
