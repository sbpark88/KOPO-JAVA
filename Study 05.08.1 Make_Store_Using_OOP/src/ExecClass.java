import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
		// 1. 파는 상품 목록 (표시)
		// 2. 메뉴 숫자를 눌러서 구매
		// 3. 현재 판매된 누적 금액 표시
		// 4. 종료 조건 (-1) 종료
		
		Scanner s = new Scanner(System.in);
		
		int select;
		int sales = 0;
		Goods icecream = new IceCream();
		Goods cupramen = new CupRamen();
		Goods bread = new Bread();
		Goods snack = new Snack();
		
		for (int i = 0; i < 99; i++) {
			System.out.println("안녕하세요. 매점입니다. 물건 구입을 원하면 '1'을, 종료를 원하면 '-1'을 입력해주세요.");
			try {
				select = s.nextInt();
				s.nextLine();	// return 소거용.
				
				if (select == 1) {
					for (int j = 0; j < 99; j++) {
						System.out.println("구매를 원하는 메뉴를 선택해주세요.\n1: 컵라면, 2: 과자, 3: 아이스크림, 4: 빵");
						select = s.nextInt();
						s.nextLine();	// return 소거용.
						if (select == 1) {
							sales = sales + cupramen.price;
						} else if (select == 2) {
							sales = sales + snack.price;
						} else if (select == 3) {
							sales = sales + icecream.price;
						} else if (select == 4) {
							sales = sales + bread.price;
						} else {
							System.out.println("정수만 입력해주세요.");
							continue;
						}	
						break;
					}
				} else if (select == -1) {
					break;
				} else {
					System.out.println("정수만 입력해주세요.");
				}
			} catch (Exception e) {
				System.out.println("정수만 입력해주세요.");
				s.nextLine();
			}
			System.out.println("---------------------------");
			
		}
		System.out.println("누적 금액은 : " + sales);

	}
}
