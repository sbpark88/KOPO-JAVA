// 객체데이터와 생성자의 활용, 등수와 매트릭스 정렬에 대해 학습한다.
// 등수를 구하는 이중 for문과 정렬을 하는 이중 for문은 비슷하지만 다르다. j의 시작점에 대해 주목한다.

import java.util.Arrays;

public class ScorePrint_executionClass {
	public static void main(String[] args) {
		
		// Step 1. 학생 10명의 데이터를 객체데이터로 만들어 배열로 생성.		
		ScorePrint s[] = new ScorePrint[10]; // 클래스 ScorePrint를 이름 s로 배열로 만들거다. ScorePrint를 10개를 만들어 메모리에 할당해라. 즉, 배열 하나로 묶어서 이곳에 0번부터 9번까지 10개의 ScorePrint 클래스 방을 오려다 붙인거다.
		s[0] = new ScorePrint("홍길동", 100, 100, 80);	// s의 0번방 ScorePrint 클래스에는 "홍길동", 100, 100을 생성자로 넣어라.
		s[1] = new ScorePrint("둘리", 10, 10, 90);		// s의 1번방 ScorePrint 클래스에는 "둘리", 10, 10을 생성자로 넣어라.
		s[2] = new ScorePrint("고길동", 74, 46, 34);
		s[3] = new ScorePrint("짱구", 39, 85, 60);
		s[4] = new ScorePrint("이순신", 41, 65, 45);
		s[5] = new ScorePrint("장보고", 26, 100, 70);
		s[6] = new ScorePrint("이성계", 93, 57, 76);
		s[7] = new ScorePrint("희동이", 24, 41, 20);
		s[8] = new ScorePrint("또치", 98, 95, 0);
		s[9] = new ScorePrint("박혁거세", 32, 54, 99);
		
		// Step 2. 객체데이터를 이용해 과목별 총점을 구한 후 평균을 구함.
		int totalMidKorean = 0;
		int totalMidEnglish = 0;
		int totalMidMath = 0;
		int numberOfstudents = s.length;
		for (int i = 0; i < numberOfstudents; i++) {
			totalMidKorean = totalMidKorean + s[i].midKorean;
			totalMidEnglish = totalMidEnglish + s[i].midEnglish;
			totalMidMath = totalMidMath + s[i].midMath;
		}
		int totalMidAllClass = totalMidKorean + totalMidEnglish + totalMidMath;
		
		double avgMidKorean = (double)totalMidKorean / numberOfstudents;
		double avgMidEnglish = (double)totalMidEnglish / numberOfstudents;
		double avgMidMath = (double)totalMidMath / numberOfstudents;
		double avgMidAllClass = (double)(avgMidKorean + avgMidEnglish + avgMidMath) / 3;
		
		System.out.println("중간고사 국어 총점은 " + totalMidKorean);
		System.out.println("중간고사 국어 평균은 " + avgMidKorean);
		System.out.println("중간고사 영어 총점은 " + totalMidEnglish);
		System.out.println("중간고사 영어 평균은 " + avgMidEnglish);
		System.out.println("중간고사 수학 총점은 " + totalMidMath);
		System.out.println("중간고사 수학 평균은 " + avgMidMath);	
		System.out.println("중간고사 전과목 총점은 " + totalMidAllClass);
		System.out.println("중간고사 전과목 평균은 " + avgMidAllClass);
		
		System.out.println("");
		
//		// Step 3. 학생의 데이터를 관리하고 등수를 구하기 위해 매트릭스로 각 행에 한 사람씩 객체 데이터를 생성.
//		String studentRank[][] = new String[10][3];		// 나중에 등수를 넣을거라 [10][2] 대신 [10][3]으로 생성.
//		for (int i = 0; i < numberOfstudents; i++) {
//			System.out.println(s[i].name + "의 국어 점수는 "  + s[i].midKorean + " , 영어 점수는 " + s[i].midEnglish + " , 수학 점수는 " + s[i].midMath + " , 총점은 " + s[i].midSum);
//			studentRank[i][0] = s[i].name;							// 1열에는 이름을 넣는다.
//			studentRank[i][1] = Integer.toString(s[i].midSum);		// 2열에는 개인 총점을 넣는다.
//			studentRank[i][2] = "1";								// 3열에는 등수를 넣는다.
//		}
//		
//		
//		System.out.println("");
//		
//		
//		// Step 4. 등수 구하기. 모두 1등으로 시작해서 나보다 점수 높은 사람이 있다면 +1등씩 더함.
//		for (int i = 0; i < numberOfstudents; i++) {
//			int rankTemp = 1;	// i번째 학생의 등수 계산을 위해 1등으로 선언.
//			for (int j = 0; j< numberOfstudents; j++) {
//				if (s[i].midSum < s[j].midSum) {	// i번째 학생이 j번째 학생보다 점수가 낮다면 +1등씩 더함.
//					rankTemp = rankTemp + 1;		// Integer.parseInt(studentRanki[i][1]) < Integer.parseInt(studentRanki[j][1])
//				}
//				
//			}
//			studentRank[i][2] = Integer.toString(rankTemp);	// 매트릭스가 String이라 형변환.
//		}
//
////		// 위에 Step 4. 는 Step 3.에서 만든 매트릭스를 이용해 이렇게 구할 수도 있다. 다만 형변환을 계속 해야해서 위에 방법으로 구현했다.
////		for (int i = 0; i < numberOfstudents; i++) {
////			int rankTemp = 1;	// i번째 학생의 등수 계산을 위해 1등으로 선언.
////			for (int j = 0; j< numberOfstudents; j++) {
////				int prevStudent = Integer.parseInt(studentRank[i][1]);
////				int nextStudent = Integer.parseInt(studentRank[j][1]);
////				if (prevStudent < nextStudent) {	// i번째 학생이 j번째 학생보다 점수가 낮다면 +1등씩 더함.
////					rankTemp = rankTemp + 1;
////				}
////				
////			}
////			studentRank[i][2] = Integer.toString(rankTemp);	// 매트릭스가 String이라 형변환.
////		}
//		
//	
//		
//		System.out.println("");
//		
//		
//
////		// [10][3] 매트릭스 디버깅용
////		for (int i = 0; i < numberOfstudents; i++) {
////			System.out.println(Arrays.toString(studentRank[i]));
////		}
////		System.out.println("");
//		
//		
//		// Step 5.1 등수 출력하기.
//		
//		for (int i = 0; i < numberOfstudents; i++) {
//			System.out.println(studentRank[i][0] + "은 " + studentRank[i][2] + "등입니다.");
//		}
//		
//		System.out.println("");
//		
//		// Step 5.2 등수로 정렬해서 출력하기. (이거는 위에 
//		
//		String RankAscendingOrder[] = new String[10];
//		
//		for (int i = 0; i < numberOfstudents; i++) {
//			int rankTemp = 1;
//			for (int j = 0; j< numberOfstudents; j++) {
//				if (s[i].midSum < s[j].midSum) {	// i번째 학생이 j번째 학생보다 점수가 낮다면 +1등씩 더함.
//					rankTemp = rankTemp + 1;
//				}
//				
//			}
//			RankAscendingOrder[rankTemp - 1] = studentRank[i][0];	// 1등부터 10등까지니까 배열에 0번부터 9번까지 넣어야 해서 'rankTemp - 1'.
//		}
//		
//
//		for (int i = 0; i < numberOfstudents; i++) {
//			System.out.println((i + 1) + "등은 " + RankAscendingOrder[i] + "입니다.");
//		}
		
		
		
		
		
		System.out.println("");

		
		
		
		// ***** Step 3. ~ Step 5.2 배열 자체를 정렬시키는 방법으로 축약하기 *****
		// New Step 3. 학생의 데이터를 관리하고 등수를 구하기 위해 매트릭스로 각 행에 한 사람씩 객체 데이터를 생성.
		String studentRank[][] = new String[10][2];		// 이 경우 등수를 배열에 포함할 필요가 없어  studentRank[10][2]로 만들어도 된다.
		for (int i = 0; i < numberOfstudents; i++) {
			System.out.println(s[i].name + "의 국어 점수는 "  + s[i].midKorean + " , 영어 점수는 " + s[i].midEnglish + " , 수학 점수는 " + s[i].midMath + " , 총점은 " + s[i].midSum);
			studentRank[i][0] = s[i].name;							// 1열에는 이름을 넣는다.
			studentRank[i][1] = Integer.toString(s[i].midSum);		// 2열에는 개인 총점을 넣는다.
		}
		
		
		System.out.println("");
		
		
		// New Step 4. 배열 자체를 정렬시키키고 출력하기.
		for (int i = 0; i < numberOfstudents; i++) {		// i를 앞에 있는 학생, j를 뒤에 있는 학생으로 선언하고 비교하기.
			for (int j = i; j< numberOfstudents; j++) {		// 이때는 int j = 0 이 아니라 int j = i 로 시작한다.
				
				int prevStudent = Integer.parseInt(studentRank[i][1]);
				int nextStudent = Integer.parseInt(studentRank[j][1]);
				if (prevStudent < nextStudent) {	// 앞에 있는 학생 < 뒤에 있는 학생 라면 실행.
					String temp[] = studentRank[i];
					studentRank[i] = studentRank[j];
					studentRank[j] = temp;
				}
				
			}

		}
		
		
		for (int i = 0; i < numberOfstudents; i++) {
			System.out.println((i + 1) + "등은 " + studentRank[i][0] + "입니다.");
		}

		
		
		
		
	}

}
