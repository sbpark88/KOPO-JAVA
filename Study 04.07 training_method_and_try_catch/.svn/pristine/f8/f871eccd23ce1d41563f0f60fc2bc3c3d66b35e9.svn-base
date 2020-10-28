import java.util.Scanner;

// 1. 예외처리 미적용시 로직.
//public class ATM {
//	public void automatedTellerMachine() {
//		Scanner s = new Scanner(System.in);
//		int balance = 0;
//		
//		for (int i = 0; i < 999999; i++) {	// AMT 반복 로직 구현. 종료 조건 구현.
//			System.out.println("잔고를 확인하고 종료하려면 'crash'를 입력해주세요.\n입금을 원하면 입금할 금액을 입력주세요.");
//			String inputMoney = s.nextLine();	// if문에 전달할 값 받음.
//			
//			if (inputMoney.equals("crash")) {	// 'crash'면 잔고를 출력하고 종료.
//				System.out.println("잔고는 " + balance + "원입니다.");
//				break;
//			} else {
//				int convertMoney = Integer.parseInt(inputMoney);	// 입력된 문자 금액을 숫자로 형변환.
//				balance = balance + convertMoney;
//				System.out.println("입금 메시지를 남기기 원하면 적어주시고 원치 않으면 그냥 엔터를 눌러주세요.");	// 메시지 남길지 여부 문의.
//				String inputMessage = s.nextLine();	// 남길 메시지를 받음.
//				
//				if (inputMessage.equals("")) {	// 메시지가 공백인 경우.
//					System.out.println("딸그랑 " + convertMoney);
//										
//				} else {
//					System.out.println(inputMessage + " " + convertMoney);
//				}
//				
//				System.out.println("");
//				
//				
//			}
//		}
//	}
//	
//	
//
//}

//2. 예외처리 적용시 로직.
public class ATM {
	public void automatedTellerMachine(int balance) {
		Scanner s = new Scanner(System.in);
//		int balance = 0;
		
		for (int i = 0; i < 999999; i++) {	// AMT 반복 로직 구현. 종료 조건 구현.
			System.out.println("잔고를 확인하고 종료하려면 'crash'를 입력해주세요.\n입금을 원하면 입금할 금액을 입력주세요.");
			String inputMoney = s.nextLine();	// if문에 전달할 값 받음.
			
			try {	// 'crash'나 금액이 아닌 다른 문자가 들어올 경우 예외처리.
				if (inputMoney.equals("crash")) {	// 'crash'면 잔고를 출력하고 종료.
					System.out.println("잔고는 " + balance + "원입니다.");
					break;
				} else {
					int convertMoney = Integer.parseInt(inputMoney);	// 입력된 문자 금액을 숫자로 형변환.
					balance = balance + convertMoney;
					System.out.println("입금 메시지를 남기기 원하면 적어주시고 원치 않으면 그냥 엔터를 눌러주세요.");	// 메시지 남길지 여부 문의.
					String inputMessage = s.nextLine();	// 남길 메시지를 받음.
					
					if (inputMessage.equals("")) {	// 메시지가 공백인 경우.
						System.out.println("딸그랑 " + convertMoney);
											
					} else {
						System.out.println(inputMessage + " " + convertMoney);
					}
					
					System.out.println("");
					
					
				}
			} catch (Exception e) {		// 예외처리로 잘못 입력했다는 메시지 출력 후 다시 메소드 시작으로 돌아감.
				System.out.println("잘못 입력했습니다.\n");
				automatedTellerMachine(balance);	// 이때 그냥 처음부터 시작하면 잔고가 초기화 되어버림. balance를 인풋 파라미터로 전달.
			}
		}
	}
	
}
