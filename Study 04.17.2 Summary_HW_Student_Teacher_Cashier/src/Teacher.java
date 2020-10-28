
public class Teacher extends People {
	String className;
	Student[] stuNum;	// Student[0] ~ Student[9] 클래스를 배열로 모두 불러와야 학생 데이터를 사용할 수 있다.
	int stuRank;
	
	// Step 2.1.
	public Teacher(String name, int age, String className, Student[] stuNum) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.className = className;
		this.stuNum = stuNum;		
	}
	
	// Step 2.2. 등수를 구하는 로직.
	public void ranking (int thisstudentTotalScore, int stuLen) {
		for(int i = 0; i < stuLen; i++) {
			if(thisstudentTotalScore < stuNum[i].totalScore) {
				stuRank++;
			}
			
		}
	}
	
	// Step 2.2. 메인 로직.
	public void StudentInfo() {
		int stuLen = stuNum.length;
		// 방법 1. // 예쁘게 보려면 학생 클래스 역시 방법 1 로 되어있어야 함.
		for (int i = 0; i < stuLen; i++) {
			stuRank = 1;
			if (i == 0) {
				System.out.println(super.toString() + " 선생님반\n 학생명단   |  국어  |  영어  |  수학  |  총점  |  평균  |  등수");
			} else {
				
			}
			this.ranking(stuNum[i].totalScore, stuLen);
			System.out.println(stuNum[i] + "     " 	+ String.format("%3d", stuNum[i].korScore)
										  + "     " + String.format("%3d", stuNum[i].engScore)
										  + "     " + String.format("%3d", stuNum[i].mathScore)
										  + "     " + String.format("%3d", stuNum[i].totalScore)
										  + "   " + String.format("%.2f", stuNum[i].avgScore)
										  + "    " + String.format("%2d", this.stuRank));	// 꼭 칸을 띄워주고 싶지 않더라도 변수와 변수 사이에는 ""를 넣어줘야한다. 안 그러면 변수끼리 합연산을 해버린다!!
			
		}
		
		
		// 방법 2. 
//		for (int i = 0; i < stuLen; i++) {
//			stuRank = 1;
//			if (i == 0) {
//				System.out.println(super.toString() + " 선생님반\n");
//			} else {
//				
//			}
//			this.ranking(stuNum[i].totalScore, stuLen);
//			System.out.println(stuNum[i] + "등수 : " + String.format("%2d", this.stuRank));	// 꼭 칸을 띄워주고 싶지 않더라도 변수와 변수 사이에는 ""를 넣어줘야한다. 안 그러면 변수끼리 합연산을 해버린다!!
//
//		}
		
	}

}
