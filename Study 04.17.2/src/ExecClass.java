import java.util.Random;

public class ExecClass {
	public static void main(String[] args) {
		// Step 1.1. 학생 데이터 생성.
		// Student 클래스의 변수에 직접 접근하기 위해서 배열을 Super 클래스인 People 말고 Student 클래스로 직접 만든다.
		Student[] stu = new Student[10];
		stu[0] = new Student("공유", 42, 100, 95, 100);
		stu[1] = new Student("둘리", 23, 91, 15, 62);
		stu[2] = new Student("쵸파", 15, 47, 20, 90);
		stu[3] = new Student("또치", 67, 50, 32, 47);
		stu[4] = new Student("펭수", 32, 74, 52, 89);
		stu[5] = new Student("빼꼼", 32, 90, 100, 20);
		stu[6] = new Student("타요", 15, 90, 74, 38);
		stu[7] = new Student("루키", 20, 25, 100, 21);
		stu[8] = new Student("토니", 53, 12, 56, 100);
		stu[9] = new Student("포코", 61, 69, 74, 17);
		
		// Step 1.2. Student 클래스한테 학생 자신의 성적을 스스로 계산하도록 함.
		int stuLen = stu.length;
		for(int i = 0; i < stuLen; i++) {
			stu[i].reportCard();	// 방법 1.
//			stu[i].toString();		// 방법 2.
		}
		
		System.out.println("----------");
		// Step 2.1. 선생 데이터 생성.		
		Teacher tea = new Teacher("호랑이", 999, "특별반", stu);
		
		// Step 2.2. Teacher 클래스한테 선생 정보와 학생 명단, 성적, 등수를 계산하여 출력하도록 함.
		tea.StudentInfo();

		System.out.println("----------");
		// Step 3.1. 매점 직원 데이터 생성.
		Cashier cashier = new Cashier("강호동", 49, stu);
		
		// 학생들의 매점 이용을 랜덤하게 생성.
		Random r = new Random();
		int salesCount = 0;
		while (salesCount < 100) {	// 총 100번의 매출을 학생과 금액을 랜덤하게 생성함.
			cashier.sale(r.nextInt(10), r.nextInt(5001) + 1000);	// 0~9번 학생이 랜덤하게 1000~6000원을 사용.
			salesCount++;	
		}
		
		
		// Step 3.2. Cashier 클래스한테 매점 직원의 정보와 전체, 학생별 매출 정보를 출력하게 함.
		System.out.println(cashier);
				
	}

}
