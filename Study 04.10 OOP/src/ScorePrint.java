
public class ScorePrint {
	
	String name;
	int midKorean;
	int midEnglish;
	int midMath;
	int midSum;
	
	// 생성자 이용하기. 일반적으로 객체데이터 만들 때는 생성자 이용하는게 코드가 간결해진다.
	ScorePrint(String name, int midKorean, int midEnglish, int midMath) {
		this.name = name;
		this.midKorean = midKorean;
		this.midEnglish = midEnglish;
		this.midMath = midMath;
		this.midSum = this.midKorean + this.midEnglish + this.midMath;
	}

}
