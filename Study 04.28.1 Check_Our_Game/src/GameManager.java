import java.util.Random;
import java.util.Scanner;

public class GameManager {
	Player[] group1;
	Player[] group2;
	
	GameManager(Player[] group1, Player[] group2) { 	// 자료형이 Player 클래스인 group1, group2 두 변수의 각각의 객체들을 배열로 받아온다.
		this.group1 = group1;
		this.group2 = group2;
	}
	
	// group1이 group2를 공격 	
	public void attackType1() {
		Random random = new Random();
		for (int i = 0; i < this.group1.length; i++) {	// group1의 인원만큼 공격을 수행한다.
			if(this.group1[i].isLive) {		// 우선 group1의 인원 각각의 생존 여부를 확인.
				int targetIndex = random.nextInt(this.group2.length);	// group2의 인원 중 한 명을 선택해 공격하기 위해 랜하게 선택.
				System.out.println(this.group1[i].name + "이(가) " + this.group2[targetIndex] + "(" + targetIndex + ")" + "를(을) 공격했습니다.");
				this.group2[targetIndex].underAttack(this.group1[i]);	// 타겟이 된 group2의 객체는 group1로부터 공격 받는다.
				// 여기서 매우 중요한 객체의 개념이 적용된다.
				// group2가 공격 받는 것은 group2의 객체에 있는 underAttack이라는 메소드에 의해 공격 받는다.
				// 이 때, underAttack은 공격자인 group1의 객체를 인풋 파라미터로 받는다. 즉, group1 객체가 가지는 값을 객체 2에 반영할 수가 있다.
			}
		}
	}
	// 그렇다면 여기서 알 수 있는 사실은?
	// 1. group1은 0번부터 n번까지 돌아가며 살아있는지 확인하고 1번씩 공격한다.
	// 2. group2가 공격 받은 총 횟수는 group1의 인원수 만큼 공격 받지만, 누가 공격 받았는지는 랜덤 함수에 의해 결정... 즉, 누구는 공격 안 받을 수도 있고 누구는 2번 공격 받을 수도 있다.
	// 3. GoGilDong의 underattack을 보면 일정하게 -20이라는 공격을 받고 있지만, 공격자의 객체를 인풋 파라미터로 받게 되면, 공격 받는 객체는 공격자 객체가 가지는 공격력을 통해 입는 피해를 구현할 수 있게 된다.
	
	// group2가 group1을 공격 	
		public void attackType2() {
			Random random = new Random();
			for (int i = 0; i < this.group2.length; i++) {
				if(this.group2[i].isLive) {
					int targetIndex = random.nextInt(this.group1.length);
					System.out.println(this.group2[i].name + "이(가) " + this.group1[targetIndex] + "(" + targetIndex + ")" + "를(을) 공격했습니다.");
					this.group1[targetIndex].underAttack(this.group2[i]);
				}
			}
		}
		
		public boolean checkAllDieType1() {					// group1의 전원 사망 여부를 확인하는 메소드.
			boolean checkAllDie = true;						// 우선 모두 사망한 것으로 가정한다.
			for (int i = 0; i < group1.length; i++) {		// group1의 인원만큼 0번부터 n번까지 순차로 확인.
				checkAllDie = checkAllDie && !group1[i].isLive;	// 기본적으로 각 객체의 isLive는 true다. Player 클래스에서 각 객체의 생사여부를 확인하는 메소드를 만들어 죽게 되면 false로 바꿔준다.
																// 따라서 앞에 !을 붙여주면 해당 객체가 살아 있다면 !true는 false가 된다. 따라서 checkAllDie는 && 연산자에 의해 하나라도 false니까 false가 된다.
																// 만약, 해당 객체가 죽어서 false가 되었다면 !false에 의해 true가 되니까 checkAllDie는 True가 된다. 이렇게 group1의 객체 수만큼 반복하여 전원이 사망했는지를 확인한다.
				// 이 if문 2개를 위에 라인 하나로 줄인거다.
//				if (group1[i].isLive == false) {
//					group1AllDie = false;
//				} else if (group1[i].isLive == false && group1AllDie == true) {
//					group1AllDie = true;
//				}
				System.out.println(group1[i]);
			}
			return checkAllDie;		// group1이 모두 죽었으면 true, 한 명이라도 살아 있다면 false를 반환한다.
		}
		
		
		public boolean checkAllDieType2() {
			boolean checkAllDie = true;
			for (int i = 0; i < group1.length; i++) {
				checkAllDie = checkAllDie && !group2[i].isLive;
				System.out.println(group2[i]);
			}
			return checkAllDie;
		}
		
		public void play() {		// 위에 메소드는 전부 게임 진행을 위해 각각의 기능을 하는 메소드를 만든거고, 실제 진행을 하는 메소드는 이거 하나다.
			Scanner scanner = new Scanner(System.in);
			for (int i = 0; i < 99999; i++) {		// 턴 진행(게임 진행)을 돌려주는 메소드.
				System.out.println("턴 진행을 위해서 리턴을 입력해주세요.");
				scanner.nextLine();

				System.out.println("그룹 1 상태");		// 위에서 정의한 checkAllDie를 이용해 
				this.attackType1();					// group1이 group2를 공격하는 메소드를 실행.
				if (checkAllDieType2()) {			// group2가 모두 죽었는지 확인하여 얻은 boolean을 이용한다. true면 아래 print를 찍고 break; 종료.
					System.out.println("그룹 1이 승리했습니다.");
					break;
				}
				
				System.out.println("");		// 구분을 위해 넣음.
				
				System.out.println("그룹 2 상태");
				this.attackType2();
				if (checkAllDieType1()) {
					System.out.println("그룹 2가 승리했습니다.");
					break;
				}
				
				System.out.println("-----------------" + (i + 1) + " 턴 종료 " + "-----------------");		// 구분을 위해 넣음.
			}
		}

}
