// 생성자와 객체데이터를 활용하는 방법을 배운다.
// Q ) 학생 10명의 중간, 기말고사 총점과 평균을 구하라.

public class Student_executionClass {
	public static void main(String[] args) {
		
		// 방법 1. 생성자를 이용. (객체데이터를 활용할 수 있어 코드도 간결하고 에러가 적다.)
		// 접근 3. 객체데이터에 배열을 이용할거다. 이렇게 하면 코드도 줄일 수 있고, 학생/중간/기말 따로 관리해서 생기는 오류를 방지할 수 있다. 
		Student s[] = new Student[10]; // 클래스 Student를 이름 s로 배열로 만들거다. Student를 10개를 만들어 메모리에 할당해라. 즉, 배열 하나로 묶어서 이곳에 0번부터 9번까지 10개의 Student 클래스 방을 오려다 붙인거다.
		s[0] = new Student("홍길동", 100, 100);	// s의 0번방 Student 클래스에는 "홍길동", 100, 100을 생성자로 넣어라.
		s[1] = new Student("둘리", 10, 10);		// s의 1번방 Student 클래스에는 "둘리", 10, 10을 생성자로 넣어라.
		s[2] = new Student("고길동", 74, 46);
		s[3] = new Student("짱구", 39, 85);
		s[4] = new Student("이순신", 41, 65);
		s[5] = new Student("장보고", 26, 100);
		s[6] = new Student("이성계", 93, 57);
		s[7] = new Student("희동이", 24, 41);
		s[8] = new Student("또치", 98, 95);
		s[9] = new Student("박혁거세", 32, 54);
		
		int totalMiddleScore = 0;
		int totalFinalScore = 0;
		int numberOfstudent = s.length;
		for (int i = 0; i < numberOfstudent; i++) {
			totalMiddleScore = totalMiddleScore + s[i].middleScore;
			totalFinalScore = totalFinalScore + s[i].finalScore;
		}
		
		double avgMiddleScore = (double)totalMiddleScore / numberOfstudent;
		double avgFinalSocre = (double)totalFinalScore / numberOfstudent;
		
		System.out.println("중간고사 총점은 " + totalMiddleScore);
		System.out.println("중간고사 평균은 " + avgMiddleScore);
		System.out.println("기말고사 총점은 " + totalFinalScore);
		System.out.println("기말고사 평균은 " + avgFinalSocre);
		
		
//		// 접근 2. 객체데이터로 10개만 만들어 넘기면 된다.
//		Student s0 = new Student("홍길동", 100, 100);
//		Student s1 = new Student("둘리", 10, 10);
//		
//		// 접근 1. 모든 데이터를 하나하나 넘기는 방법.
//		이거를 10번 반복해야 하는데 위에 방법처럼 객체데이터로 만들어 생성자에 전달할거다.
//		Student s0 = new Student();
//		s0.name = "홍길동";
//		s0.middleScore = 100;
//		s0.finalScore = 100;
		
		
		
		
//		// 방법 2. setter, getter 이용하는 경우. 국내 자바업계는 이렇게 쓴다는데 코드가 너무 길어진다.
//		Student[] s = new Student[10];
//		
//		s[0] = new Student();
//		s[0].setName("홍길동");
//		s[0].setMiddleScore(100);
//		s[0].setFinalScore(100);
//		s[1] = new Student();
//		s[1].setName("둘");
//		s[1].setMiddleScore(10);
//		s[1].setFinalScore(10);
//		s[2] = new Student();
//		s[2].setName("고길동");
//		s[2].setMiddleScore(74);
//		s[2].setFinalScore(46);
//		s[3] = new Student();
//		s[3].setName("짱구");
//		s[3].setMiddleScore(39);
//		s[3].setFinalScore(85);
//		s[4] = new Student();
//		s[4].setName("이순신");
//		s[4].setMiddleScore(41);
//		s[4].setFinalScore(65);
//		s[5] = new Student();
//		s[5].setName("장보고");
//		s[5].setMiddleScore(26);
//		s[5].setFinalScore(100);
//		s[6] = new Student();
//		s[6].setName("이성계");
//		s[6].setMiddleScore(93);
//		s[6].setFinalScore(57);
//		s[7] = new Student();
//		s[7].setName("희동이");
//		s[7].setMiddleScore(24);
//		s[7].setFinalScore(41);
//		s[8] = new Student();
//		s[8].setName("또치");
//		s[8].setMiddleScore(98);
//		s[8].setFinalScore(95);
//		s[9] = new Student();
//		s[9].setName("박혁거세");
//		s[9].setMiddleScore(32);
//		s[9].setFinalScore(54);
//		
//		int totalMiddleScore = 0;
//		int totalFinalScore = 0;
//		int numberOfstudent = s.length;
//		for (int i = 0; i < numberOfstudent; i++) {
//			totalMiddleScore = totalMiddleScore + s[i].getMiddleScore();
//			totalFinalScore = totalFinalScore + s[i].getFinalScore();
//		}
//		
//		double avgMiddleScore = (double)totalMiddleScore / numberOfstudent;
//		double avgFinalSocre = (double)totalFinalScore / numberOfstudent;
//		
//		System.out.println("중간고사 총점은 " + totalMiddleScore);
//		System.out.println("중간고사 평균은 " + avgMiddleScore);
//		System.out.println("기말고사 총점은 " + totalFinalScore);
//		System.out.println("기말고사 평균은 " + avgFinalSocre);
		
		
		
	}

}
