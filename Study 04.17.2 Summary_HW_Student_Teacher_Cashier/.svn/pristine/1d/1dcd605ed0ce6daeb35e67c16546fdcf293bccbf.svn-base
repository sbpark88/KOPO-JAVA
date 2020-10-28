
public class Student extends People {
	int korScore;
	int engScore;
	int mathScore;
	int totalScore;
	double avgScore;
	
	// Step 1.1.
	public Student(String name, int age, int korScore, int engScore, int mathScore) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	// Step 1.2.
//	public void reportCard() {
//		this.totalScore = this.korScore + this.engScore + this.mathScore;
//		this.avgScore = Math.round(( (double)this.totalScore / 3) * 100) / 100.0;	// 소수 둘째짜리까지 구하기 위해 Math.round(원래수*100)/100.0 을 했다. 100으로 나누면 안 됨. 소수 셋째자리까지 구하려면 Math.round(원래수*1000)/1000.0  
//		System.out.println(super.toString() + " 학생의 점수는");
//		System.out.println("국어 : " + this.korScore + " 영어 : " + this.engScore + " 수학 : " + this.mathScore);
//		System.out.println("총점 : " + this.totalScore + " 평균 : " + this.avgScore);
//	}
	
	// Step 1.2. 위에꺼를 계산과 출력을 각각의 메소드로 분리시켰음.
	public void calc() {
		this.totalScore = this.korScore + this.engScore + this.mathScore;
		this.avgScore = Math.round(( (double)this.totalScore / 3) * 100) / 100.0;	// 소수 둘째짜리까지 구하기 위해 Math.round(원래수*100)/100.0 을 했다. 100으로 나누면 안 됨. 소수 셋째자리까지 구하려면 Math.round(원래수*1000)/1000.0
	}
	
	// 방법 1.
	public void reportCard() {
		this.calc();
		System.out.println(super.toString() + " 학생의 점수는");
		System.out.println("국어 : " + this.korScore + " 영어 : " + this.engScore + " 수학 : " + this.mathScore);
		System.out.println("총점 : " + this.totalScore + " 평균 : " + this.avgScore);
	}
	
	// 방법 2.
//	public String toString() {
//		super.toString();
//		this.calc();
//		System.out.println(super.toString() + " 학생의 점수는");
//		System.out.println("국어 : " + this.korScore + " 영어 : " + this.engScore + " 수학 : " + this.mathScore);
//		System.out.println("총점 : " + this.totalScore + " 평균 : " + this.avgScore);
//		return "";
//	}

}
