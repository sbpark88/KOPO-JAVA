
public class Student {
	
	// 방법 1. 생성자를 이용. (객체데이터를 활용할 수 있어 코드도 간결하고 에러가 적다.)
	String name;
	int middleScore;
	int finalScore;
	
	// 생성자 이용하기. 일반적으로 객체데이터 만들 때는 생성자 이용하는게 코드가 간결해진다.
	Student(String name, int middleScore, int finalScore) {
		this.name = name;
		this.middleScore = middleScore;
		this.finalScore = finalScore;
	}
	
	
//	// 방법 2. setter, getter 이용하는 경우. 국내 자바업계는 이렇게 쓴다는데 코드가 너무 길어진다.
//	private String name;
//	private int middleScore;
//	private int finalScore;
//	
//	// String name에 대한 setter(public void), getter(public String) 만들기.
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return this.name;
//	}
//	
//	// int middleScore에 대한 setter(public void), getter(public int) 만들기.
//	public void setMiddleScore(int middleScore) {
//		this.middleScore = 	middleScore;
//	}
//	public int getMiddleScore() {
//		return this.middleScore;
//	}
//	
//	// int finalScore에 대한 setter(public void), getter(public int) 만들기.	
//	public void setFinalScore(int finalScore) {
//		this.finalScore = finalScore;
//	}
//	public int getFinalScore() {
//		return this.finalScore;		
//	}

}
