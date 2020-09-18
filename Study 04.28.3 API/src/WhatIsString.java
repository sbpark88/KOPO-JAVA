
public class WhatIsString {
	public static void main(String[] args) {
		
		String a = "Hello";
		System.out.println(a);
		System.out.println(a.hashCode());
		System.out.println();
		
		// String은 매번 새로운 메모리 공간을 할당한다. (메모리 공간 재활용 X)
		a = a + "1";
		System.out.println(a);
		System.out.println(a.hashCode());
		System.out.println();
		
		a = a + "1";
		System.out.println(a);
		System.out.println(a.hashCode());
		System.out.println();
		

		StringBuffer b = new StringBuffer("Hello");
		System.out.println(b);
		System.out.println(b.hashCode());
		System.out.println();
		
		// StringBuffer는 메모리 공간을 재활용한다.
		b = b.append("1");
		System.out.println(b);
		System.out.println(b.hashCode());
		System.out.println();
		
		// StringBuffer의 활용
		StringBuffer str = new StringBuffer("Hello");
		System.out.println(str);
		System.out.println(str.hashCode());
		System.out.println();
		
		str.append(" Politech");
		System.out.println(str);
		System.out.println(str.hashCode());
		System.out.println();
		
		str.reverse();
		System.out.println(str);
		System.out.println(str.hashCode());
		System.out.println();
		
		
	}

}
