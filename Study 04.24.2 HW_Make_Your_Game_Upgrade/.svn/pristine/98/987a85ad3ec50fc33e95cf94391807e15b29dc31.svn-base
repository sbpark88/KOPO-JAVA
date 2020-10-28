import java.util.Random;
import java.util.Scanner;

public class GameManager {
	Units[] player;
	Units[] mob;
	int damage;
	
	public GameManager(Units[] player, Units[] mob) {
		System.out.println("플레이어는 전투가 시작되면 스킬을 1개 부여받고 이후 5턴마다 하나씩 부여받습니다.");
		System.out.println("스킬은 바로 사용할 수도 있지만 모아둘 경우 한 번에 2배, 3배로 공격할 수 있습니다.");
		System.out.println("대신 스킬을 모은 턴은 플레이어는 공격을 하지 않습니다.\n");
		System.out.println("소서리스는 10% 확률로 적의 공격을 회피하고 턴당 100의 체력을 회복합니다.");
		System.out.println("바바리안은 20% 확률로 10%의 대미지를 돌려주고 턴당 150의 체력을 회복합니다.");

		this.player = player;
		this.mob = mob;		
	}
	
	
	// player가 mob를 공격 	
		public void attackType1() {
			Random random = new Random();
			for (int i = 0; i < this.player.length; i++) {
				if(this.player[i].isLive) {
					int targetIndex = random.nextInt(this.mob.length);
					
//					System.out.println(this.player[i].skillTree));
					int j = 1;
					System.out.println(this.player[i].name + "이(가) " + this.mob[targetIndex] + "(" + targetIndex + ")" + "를(을) 공격했습니다.");
					damage = this.player[i].attack(j);
					this.mob[targetIndex].underAttack(this.player[i], int damage);
				}
			}
		}
		
		// mob가 player를 공격 	
			public void attackType2() {
				Random random = new Random();
				for (int i = 0; i < this.mob.length; i++) {
					if(this.mob[i].isLive) {
						int targetIndex = random.nextInt(this.player.length);
						System.out.println(this.mob[i].name + "이(가) " + this.player[targetIndex] + "(" + targetIndex + ")" + "를(을) 공격했습니다.");
						damage = this.player[j].attack(i);
						this.player[targetIndex].underAttack(this.mob[i], int damage);
					}
				}
			}
			
			public boolean checkAllDieType1() {
				boolean checkAllDie = true;
				for (int i = 0; i < player.length; i++) {
					checkAllDie = checkAllDie && !player[i].isLive;	// checkAllDie가 True니까 !player.isLive즉, ! 이붙어서 반대값이 나오니 모두 죽으면 True && True
					// 이 if문 2개를 위에 라인 하나로 줄인거다.
//					if (player[i].isLive == false) {
//						playerAllDie = false;
//					} else if (player[i].isLive == false && playerAllDie == true) {
//						playerAllDie = true;
//					}
					System.out.println(player[i]);
				}
				return checkAllDie;
			}
			
			public boolean checkAllDieType2() {
				boolean checkAllDie = true;
				for (int i = 0; i < player.length; i++) {
					checkAllDie = checkAllDie && !mob[i].isLive;
				}
				return checkAllDie;
			}
			
			public void play() {
				Scanner scanner = new Scanner(System.in);
				for (int i = 0; i < 99999; i++) {
					System.out.println("턴 진행을 위해서 리턴을 입력해주세요.");
					scanner.nextLine();

					System.out.println("Player 상태");
					this.attackType1();
					if (checkAllDieType2()) {
						System.out.println("Player가 승리했습니다.");
						break;
					}
					System.out.println("Mob 상태");
					this.attackType2();
					if (checkAllDieType1()) {
						System.out.println("Mob이 승리했습니다.");
						break;
					}
				}
			}

}
