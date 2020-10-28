
public class Student extends People {
	int korScore;
	int mathScore;
	int engScore;
	int totalScore;
	double avgScore;
	
	Student(String name, int age, int korScore, int mathScore, int engScore) {
		super(name, age);
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
		this.calcScore();
	}
	
	public void calcScore() {
		this.totalScore = this.korScore + this.mathScore + this.engScore;
		this.avgScore = (double)this.totalScore / 3;
	}

}
