import java.util.Random;
import java.util.Scanner;

public class GameManager {
	Player[] group1;
	Player[] group2;
	
	GameManager(Player[] group1, Player[] group2) {
		this.group1 = group1;
		this.group2 = group2;
	}
	
	// group1이 group2를 공격 	
	public void attackType1() {
		Random random = new Random();
		for (int i = 0; i < this.group1.length; i++) {
			if(this.group1[i].isLive) {
				int targetIndex = random.nextInt(this.group2.length);
				System.out.println(this.group1[i].name + "이(가) " + this.group2[targetIndex] + "(" + targetIndex + ")" + "를(을) 공격했습니다.");
				this.group2[targetIndex].underAttack(this.group1[i]);
			}
		}
	}
	
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
		
		public boolean checkAllDieType1() {
			boolean checkAllDie = true;
			for (int i = 0; i < group1.length; i++) {
				checkAllDie = checkAllDie && !group1[i].isLive;
				// 이 if문 2개를 위에 라인 하나로 줄인거다.
//				if (group1[i].isLive == false) {
//					group1AllDie = false;
//				} else if (group1[i].isLive == false && group1AllDie == true) {
//					group1AllDie = true;
//				}
				System.out.println(group1[i]);
			}
			return checkAllDie;
		}
		
		public boolean checkAllDieType2() {
			boolean checkAllDie = true;
			for (int i = 0; i < group1.length; i++) {
				checkAllDie = checkAllDie && !group2[i].isLive;
			}
			return checkAllDie;
		}
		
		public void play() {
			Scanner scanner = new Scanner(System.in);
			for (int i = 0; i < 99999; i++) {
				System.out.println("턴 진행을 위해서 리턴을 입력해주세요.");
				scanner.nextLine();

				System.out.println("그룹 1 상태");
				this.attackType1();
				if (checkAllDieType2()) {
					System.out.println("그룹 1이 승리했습니다.");
					break;
				}
				System.out.println("그룹 2 상태");
				this.attackType2();
				if (checkAllDieType1()) {
					System.out.println("그룹 2가 승리했습니다.");
					break;
				}
			}
		}
		
	

}
