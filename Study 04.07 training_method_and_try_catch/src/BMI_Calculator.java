
public class BMI_Calculator {
	public String BMICal (double height, double weight) {	// 아웃풋은 String, 메소드 이름은 BMICal, 인풋은 double height, double weight)
		
		// 분모가 0이 들어올 수도 있으니까 예외처리.
		try {
			double bmi = (weight / (height * height / 10000));	// 신장의 단위를 m로 계산해야해서 cm를 m로 바꾸며 단위 환산.
					if (bmi >= 30) {
						return "비만";
					} else if (bmi < 30 && bmi >= 24) {
						return "과체중";
					} else if (bmi < 24 && bmi >= 20) {
						return "정상";
					} else if (bmi < 20 && bmi >= 15) {
						return "저체중";
					} else if (bmi < 15 && bmi >= 13) {
						return "여윔";
					} else if (bmi < 13 && bmi >= 10) {
						return "영양 실조증";
					} else {	// bmi < 10
						return "소모증";
					}
		} catch (Exception e) {
			return "키를 제대로 입력해주세요.";
		}
		
		
		
		
	}

}
