
public class AMT_executionClass {
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		// 1. 예외처리 미적용시 로직.
//		atm.automatedTellerMachine();	
		
		// 2. 예외처리 적용시 로직.
		atm.automatedTellerMachine(0);	// ATM 클래스의 실행 메소드의 예외조건 때문에 0이란 입력 값을 넣고 시작.		

	}

}
