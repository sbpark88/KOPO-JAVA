
public class People {	// 얘는 기본적으로 java.lang.Object의 Sub class다. 즉, 'public class People extends java.lang.Object'와 같다. 
	protected String name;
	int age;
	double height;
	
//	public String toString() {
//		return this.name;
//	}
	
	public String toString() {	// 따라서 toString()은 Object 클래스에 있는 메소드이기 때문에 없어도 사용할 수 있다.
								// 다만, 위 main 메소드에서 s1.toString()는 Student@36aa7bc2 를 반환해 'Student@36aa7bc2의 점수 100, 50' 을 출력할거다.
								// 이유는 재정의 하지 않았을 경우 Object 클래스가 toString()으로 반환하는 것은 s1이라는 방의 메모리 주소 자체를 반환하기 때문이다.
		System.out.println("명단");
		return this.name;
	}
	
}
