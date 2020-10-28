
public class ExecClass {	// 얘는 기본적으로 java.lang.Object의 Sub class다. 즉, 'public class ExecClass extends java.lang.Object'와 같다.
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.name = "홍길동";
		s1.middleScore = 100;
		s1.finalScore = 50;
		System.out.println(s1.toString() + "의 점수 " + s1.middleScore + ", " + s1.finalScore);
		// s1에 갔는데 toString()이 없으니까 Super 클래스인 People에 가서 toString()을 실행한다.
		// 따라서 "명단"을 출력하고 this.name 즉,"홍길동"을 반환받아 main 메소드에 있는 println을 수행한다.
		// "홍길동" + "의 점수 " + "100" + ", " + "50" 이 된다.
		// 따라서 최종적으로 다음과 같이 출력 된다.
		// 명단
		// 홍길동의 점수 100, 50
				
		System.out.println("");
		
		Teacher t1 = new Teacher();
		t1.name = "이성계";
		t1.age = 20;
		t1.studyClass = "1학년 1반";
		System.out.println("System.out.println(t1.toString())의 결과");
		System.out.println(t1.toString());
		System.out.println("System.out.println(t1)의 결과");
		System.out.println(t1);	// 위에와 같다. toString()은 생략하고 사용할 수 이는 메소드 중 하나다.
		// t1에 갔는데 toString()가 있다. println을 수행해 "이성계 + "의 나이 : " + "20" + " 가르치는 반 : " + "1학년 1반"을 출력한다.
		// 그리고 super.toString();에 의해 People의 toString()을 실행해 "명단"을 출력한다.
		// People 클래스의 toString()이 this.name을 Teacher 클래스의 toString()에게 반환한다.
		// 하지만 People 클래스의 toString()은 ""만 반환한다.
		// 따라서 최종적으로 다음과 같이 출력된다.
		// 이성계의 나이 : 20 가르치는 반 : 1학년 1반
		// 명단
		
		
//		Object o1 = t1; 을 아래 풀어서 쓰면...
		Object o1;	// 기본적으로 자바가 상속하는 java.lang.Object라는 클래스를 이용하는겠다!
		o1 = (Object)t1;	// 그냥 o1 = t1; 로 써도 되지만, 형변환을 확실하게 명시하고 쓰는게 더 좋다. Teacher 타입의 변수 t1을 강제로 Object 타입으로 형변환.
		// o1에 들어있는 값은 t1과 동일하다. 하지만 Teacher 타입에서 Object 타입으로 바뀌었다.
		t1.studyClass = "1학년 2반";	// 당연히 가능하다.
//		o1.studyClass = "1학년 2반";	// 불가능하다. 에러 발생. o1은 (Object)로 형변환 된 t1의 값을 가지고 있는 것이다. 즉, 정확히 말하면 t1 자체를 가지고 있는 것은 아니다.
									// int a = 7;
									// double b = (double)a; 형변환을 생각해보면 이해가 쉽다. a와 b는 같은 값을 가지고 있지만 double로 형변환 된 값을 가지고 있는 것이지 int 자체를 가지고 있는 것은 아니다.
									// toString()은 Object에도 있기 때문에 사용이 가능한 것.
		
		People p0 = new People();
//		p0.studyClass = "1학년 3반";	// p0는 Sub 클래스의 원본일 뿐 Sub 클래스를 가지고 있는게 아니라 String studyClass를 사용 불가능.
		t1.age = 30;	// t1은 People라는 Super 클래스를 가지고 있기 때문에 int age를 사용 가능.
		// 이것과 비슷한거이려나? 아니면 전혀 다른 예 이려나?
		
		
		System.out.println("System.out.println(o1)의 결과");
		System.out.println(o1);		// System.out.println(o1.toString()) 또는 System.out.println(t1.toString())과 같다.
//		System.out.println(o2);		// System.out.println(t1.toString())과 같다.
		
//		People[] p1 = new People[2];
//		p1[0] = t1;
//		p1[1] = t2;
//		for (int i = 0; i< p1.length; i++) {
//			System.out.println(p1[i].toString());
//		}
		
		
		// 마지막으로 지난번에 배운 Super 클래스의 이름으로 배열을 생성해서 Sub 클래스를 묶기. 
		People[] p1 = new People[2];
		p1[0] = new Student();
		p1[1] = new Teacher();
		
		p1[0].name = "홍길동";
//		p1[0].middleScore = 100; 배열로써 생성한 People이라는 변수 안에 Student()가 들어와 있는거다. 따라서 People에 가지고 있지 않은 변수인 middleScore는 접근을 할 수 없다. (Sub 클래스가 가지고 있는 변수지 Super 클래스의 변수가 아니다.)
//		p1[0].finalScore = 50;
		for (int i = 0; i < p1.length; i++) {
			System.out.println(p1[i]);
		}
		
		
		
		
	}
	
}
