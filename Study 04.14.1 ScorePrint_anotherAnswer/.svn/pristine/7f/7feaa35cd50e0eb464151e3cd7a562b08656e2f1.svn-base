
public class Student_executionClass {
	public static void main(String[] args) {
		Student stu[] = new Student[10];	        // Student 클래스를 자료형으로 가지는 stu라는 이름의 배열을 만들어라. 그리고 비어있는 방 10칸을 사용할 수 있게 메모리에 배정해 초기화해라. (이건 배열을 만드는거다. 아래 객체데이터를 만드는 것과 혼동하지 말 것.)
		stu[0] = new Student("홍길동", 100, 100, 80);	// stu 배열의 0번 방에 Student를 오려다 넣어라. 그 방은 "홍길동", 100, 100, 80을 생성자로 가진다. (객체 데이터를 만드는거.)
		stu[1] = new Student("둘리", 10, 10, 90);		// stu 배열의 1번 방에 Student를 오려다 넣어라. 그 방은 "둘리", 10, 10, 90을 생성자로 가진다.
		stu[2] = new Student("고길동", 74, 46, 34);
		stu[3] = new Student("짱구", 39, 85, 60);
		stu[4] = new Student("이순신", 41, 65, 45);
		stu[5] = new Student("장보고", 26, 100, 70);
		stu[6] = new Student("이성계", 93, 57, 76);
		stu[7] = new Student("희동이", 24, 41, 20);
		stu[8] = new Student("또치", 98, 95, 0);
		stu[9] = new Student("박혁거세", 32, 54, 99);
		
		int totalKorScore = 0;
		int totalMathScore = 0;
		int totalEngScore = 0;
		int stuLen = stu.length;
		for (int i = 0; i < stuLen; i++) {
			totalKorScore = totalKorScore + stu[i].korScore;
			totalMathScore = totalMathScore + stu[i].mathScore;
			totalEngScore = totalEngScore + stu[i].engScore;

		}
		
		// 지난번 순위를 이중 for문으로 구했던 것의 바깥 for문에 해당한다. i 번째 학생.
		for (int i = 0; i < stuLen; i++) {	// 위 for문에 합칠 수 없다. 0~9번 방이 모두 채워진 이후에 i번째 학생의 점수를 0~9번째 학생의 점수와 비교를 해야하기 때문이다.
			stu[i].printInfo();			// 얘는 그냥 i번째 정보만 있으면 되기 때문에 위 for문에 들어가도 상관 없다. 다만 총점, 평균, 등수를 한 줄에 출력하기 위해 여기 넣었다.
			stu[i].printLevel(stu);		// 객체 데이터 stu = {stu[0] ~ stu[9]}배열 전체를 인풋 파라미터로 전달한다.
		}
			
	}

}
