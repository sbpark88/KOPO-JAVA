// 숫자와 문자열이 섞였을 때 묵시적 형변환이 어떻게 작동하는지 확인함.

public class lecture5_typeWhenNumStringMixed {
	public static void main(String[] args) {
		
		// 앞에서부터 실행해 나가기 때문에 10과 3을 숫자로 인식. 13을 만들고 뒤에 문자열과 더하기 위해 문자 13으로 바꿔서 더한다. 13AB
		String text1 = 10 + 3 + "AB";
		
		// 괄호로 묶어줬기 때문에 확실히 숫자로 인식. 13을 더한 후 뒤에 문자열과 더하기 위해 문자 13으로 바꿔서 더한다. 13AB
		String text2 = (10 + 3) + "AB";
		
		// 앞에서부터 실행해 나가기 때문에 문자 "AB"에 문자 10을 더하고 문자 3을 더한다. AB103
		String text3 = "AB" + 10 + 3;
		
		// 괄호로 묶어줬기 때문에 확실히 숫자로 인식. 문자 "AB"에 (13)을 더한다. AB13
		String text4 = "AB" + (10 + 3);
		
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
		System.out.println(text4);
		
	}

}
