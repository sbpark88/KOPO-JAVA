
public class Student {
	private String name;	// 직접 접근하지 않는 애들은 private로 보호를 해줘도 된다. (생성자 말고 stu[i].name 이런애들 말하는거다.)
	int korScore;			// 얘네는 stu[i].korScore로 직접 접근을 하기 때문에 보호하면 안 된다. 할거면 setter getter 엄청나게 만들어야한다.
	int mathScore;
	int engScore;
	private int totalScore;
	private double avgScore;
	private int level = 1;

	Student(String name, int korScore, int mathScore, int engScore) {
		this.name = name;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
		
		// 이 부분을 아래 calc()로 따로 빼서 분리할 수 있다.
//		this.totalScore = korScore + mathScore + engScore;
//		this.avgScore = (double)this.totalScore / 3;
		this.calc();
	}
	
	public void calc() {
		this.totalScore = korScore + mathScore + engScore;
		this.avgScore = (double)this.totalScore / 3;		
	}
	
	
	
	public void printInfo() {
		System.out.print("이름: " + this.name);
		System.out.print("  국어: " + this.korScore);
		System.out.print("  수학: " + this.korScore);
		System.out.println("  영어: " + this.korScore);
		System.out.print("학생 총점: " + this.totalScore + " 평균: " + this.avgScore);
	}
	
	// 지난번 순위를 이중 for문으로 구했던 것의 안쪽 for문에 해당한다. 이거를 통째로 Student_executionClass의 for문 안에 pritLevel 안에 오려다 붙여보면 이해가 될거다.
	public void printLevel(Student[] student) {	// Student_executionClass한테서 객체데이터를 배열로 받기 때문에 인풋 파라미터를 이렇게 받는다. stu = {stu[0] ~ stu[9]} 
		int studentLen = student.length;
		for (int j = 0; j < studentLen; j++) {	// 지역 변수라 i로 해도 되지만 지난번과 비교를 쉽게 하기 위해 j로 잡았다.
			if (this.totalScore < student[j].totalScore) {
				this.level++;		
			}
		}
		System.out.println("  등수: " + level);
	}
	
	// 위 로직을 순위를 구하는 로직과 출력을 하는 로직을 따로 분리하면 이렇게 사용할 수 있다.
//	public void findMyLevel(Student[] student) {
//		int studentLen = student.length;
//		for (int j = 0; j < studentLen; j++) {	// 지역 변수라 i로 해도 되지만 지난번과 비교를 쉽게 하기 위해 j로 잡았다.
//			if (this.totalScore < student[j].totalScore) {
//				this.level++;		
//			}
//		}
//	}
//	
//	public void printLevel(Student[] student) {	// Student_executionClass한테서 객체데이터를 배열로 받기 때문에 인풋 파라미터를 이렇게 받는다. stu = {stu[0] ~ stu[9]} 
//		this.findMyLevel(student);
//		System.out.println("  등수: " + level);	// 얘만 남기고 위에 등수를 구하는 로직은 따로 메소드로 뺀 다음 this.findMyLevel(student);로 넘겨줄 수도 있다.
//	}
	
	
	

}
