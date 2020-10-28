import java.util.Random;
import java.util.Scanner;

public class Hunt_the_Mobs_on_Field {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
				
		int mobNum = 5 + r.nextInt(6);
		int damageBar;
		int damageSor;
		
		// Player 생성.
		Player[] player = new Player[2];
		player[0] = new Sorceress();
		player[1] = new Barbarian();
		
		System.out.println(player[0]);
		System.out.println(player[1] + "\n");
		
		System.out.println("플레이어는 전투가 시작되면 스킬을 1개 부여받고 이후 5턴마다 하나씩 부여받습니다.");
		System.out.println("스킬은 바로 사용할 수도 있지만 모아둘 경우 한 번에 2배, 3배로 공격할 수 있습니다.");
		System.out.println("대신 스킬을 모은 턴은 플레이어는 공격을 하지 않습니다.\n");
		
		// 일반몹 생성.
		// 방법 1.
//		CommonMob mob = new CommonMob(mobNum);
//				
//		Monster[] mob = new Monster[mobNum];
//
//		for (int i = 0; i < mobNum; i++) {
//			mob[i] = new CommonMob(i);
//		}
//	
//		System.out.println(mob);
		
		// 방법 2.
		Monster[] mob = new Monster[mobNum];
		
		for (int i = 0; i < mobNum; i++) {
			mob[i] = new CommonMob();
		}
		System.out.println("가 나타났습니다.");
		
		
		// 일반몹과 전투 진행.
		for (int i = 0; i < 9999; i++) {
			System.out.println("턴 진행 (리턴 입력)");
			s.nextLine();
			

			// 플레이어의 공격.
			if (i % 5 == 0) {
				damageSor = 0;	// 최초 턴 이후 스킬을 모았을 때 이전에 턴에 저장된 값에 의해 일반 공격이 실행되지 않도록 초기화.
				damageBar = 0;	// 최초 턴 이후 스킬을 모았을 때 이전에 턴에 저장된 일반 공격력 값에 의해 플레이어의 공격이 실행되지 않도록 초기화.
				damageSor = player[0].skill();
				damageBar = player[1].skill();
			} else {
				damageSor = player[0].attack();
				damageBar = player[1].attack();
			}
			
			if (player[0].isLive) { // Player 1이 살아있다면 실행.
				if (damageSor == 0) {
					System.out.println(player[0].playerName + "는 스킬을 " + player[0].saveskill + "개 모았습니다.");
				} else {
					System.out.println(player[0].playerName + "가 공격력 " + damageSor + "으로 공격합니다.");	
				}
			}
			if (player[1].isLive) { // Player 2가 살아있다면 실행.
				if (damageBar == 0) {
					System.out.println(player[1].playerName + "은 스킬을 " + player[1].saveskill + "개 모았습니다.");
				} else {
					System.out.println(player[1].playerName + "이 공격력 " + damageBar + "으로 공격합니다.");
				}
			}
			System.out.println("");
			
			
			for (int j = 0; j < mobNum; j++) {
				if (mob[j].isLive) { // j번째 몹이 살아있다면
					// Player 1 Sorceress가 공격.
					mob[j].hp = mob[j].hp - damageSor;
					mob[j].checkHP();
				}
				if (mob[j].isLive) { // j번째 몹이 Player 1 Sorceress의 공격을 받고 살아있다면
					// Player 2 Barbarian이 공격.
					mob[j].hp = mob[j].hp - damageBar;
					mob[j].checkHP();
					int damage;
					// j번째 몹이 Player1, 2의 공격을 받고 살아있다면 몹이 플레이어를 공격.
					damage = mob[j].attack();
					System.out.println(mob[j] + "이(가) 공격력" + damage + "으로 공격합니다.");
					player[0].hp = player[0].hp - damage;
					player[1].hp = player[1].hp - damage;
				}

			}
			System.out.println("");
			
			
			// 몹의 남은 체력 표시 및 종료 조건 생성.
			int remainTotalHP = 0; // 종료조건 생성용.
			for (int j = 0; j < mobNum; j++) {
				System.out.print(mob[j].toString());
				remainTotalHP = remainTotalHP + mob[j].hp;
			}
			System.out.println("\n");
			if (remainTotalHP != 0) {
				System.out.print("플레이어의 체력은 ");
			} else {
				System.out.print("몹이 모두 죽었습니다. 남은 체력은 ");
			}
			
			System.out.print(player[0].toString()); // toString은 출력시 "다른 문장"이나 + " " + 와 결합하면 순서 인식을 안 하는지 순서가 엉망이 되어 분리함.
			System.out.print(" ");
			System.out.print(player[1].toString());
			
			System.out.println("\n");
			
			if (remainTotalHP == 0) {
				break;
			}
			
			// 플레이어는 살아있다면 매 턴마다 체력을 일정량 회복합니다.
			if (player[0].isLive) {
				player[0].recoveryHP();
				System.out.println(player[0].playerName + "은 최대 " + player[0].recovery + "만큼 체력을 회복합니다.");
			}
			if (player[1].isLive) {
				player[1].recoveryHP();
				System.out.println(player[1].playerName + "은 최대 " + player[1].recovery + "만큼 체력을 회복합니다.");
			}
			System.out.println("----------------------------------------------");
			
					
		}
		
		System.out.println("\n\n");
		BossMob boss = new BossMob();
		System.out.println("가 나타났습니다.\n\n");
		
		
		// 보스몹 디아블로와 전투 진행.
		for (int i = 0; i < 9999; i++) {
			System.out.println("턴 진행 (리턴 입력)");
			s.nextLine();
			

			// 플레이어의 공격.
			if (i % 5 == 0) {
				damageSor = player[0].skill();
				damageBar = player[1].skill();
			} else {
				damageSor = player[0].attack();
				damageBar = player[1].attack();
			}
			
			if (player[0].isLive) { // Player 1이 살아있다면 실행.
				if (damageSor == 0) {
					System.out.println(player[0].playerName + "는 스킬을 " + player[0].saveskill + "개 모았습니다.");
				} else {
					System.out.println(player[0].playerName + "가 공격력 " + damageSor + "으로 공격합니다.");	
				}
				boss.hp = boss.hp - damageSor;
			}
			if (player[1].isLive) { // Player 2가 살아있다면 실행.
				if (damageBar == 0) {
					System.out.println(player[1].playerName + "은 스킬을 " + player[1].saveskill + "개 모았습니다.");
				} else {
					System.out.println(player[1].playerName + "이 공격력 " + damageBar + "으로 공격합니다.");
				}
				boss.hp = boss.hp - damageBar;
			}
			System.out.println("");
			
			
			if (boss.isLive) {
//				boss.hp = boss.hp - damageSor - damageBar;
				boss.checkHP();
				// Player 1, 2의 공격을 받고 살아있다면 디아블로가 플레이어를 공격. 
				int damage;
				damage = boss.attack();
				System.out.println(boss.bossName + "가 공격력 " + damage + "으로 공격합니다.");
				if (player[0].isLive) {
					player[0].hp = player[0].hp - damage;
				}
				if (player[1].isLive) {
					player[1].hp = player[1].hp - damage;
				}
				
			}

			
			
			// 디아블로의 남은 체력 표시 및 종료 조건 생성.
			
			System.out.println(boss.toString());
			
			System.out.println("\n");
			
									
			System.out.print("플레이어의 체력은 ");
			System.out.print(player[0].toString()); // toString은 출력시 "다른 문장"이나 + " " + 와 결합하면 순서 인식을 안 하는지 순서가 엉망이 되어 분리함.
			System.out.print(" ");
			System.out.print(player[1].toString());
			
			System.out.println("\n");
			
			if (!boss.isLive) {
				System.out.println("플레이어가 이겼습니다. 게임을 종료합니다.");
				break;
			} else if (!player[0].isLive && !player[1].isLive) {
				System.out.println("플레이어는 졌습니다. 게임을 종료합니다.");
			}
			
			
			// 플레이어는 살아있다면 매 턴마다 체력을 일정량 회복합니다.
			if (player[0].isLive) {
				player[0].recoveryHP();
				System.out.println(player[0].playerName + "은 최대 " + player[0].recovery + "만큼 체력을 회복합니다.");
			}
			if (player[1].isLive) {
				player[1].recoveryHP();
				System.out.println(player[1].playerName + "은 최대 " + player[1].recovery + "만큼 체력을 회복합니다.");
			}	
			
			// 디아블로 역시 살아있다면 매 턴마다 체력을 일정량 회복합니다.
			if (boss.isLive) {
				boss.recoveryHP();
				System.out.println(boss.bossName + "은 최대 " + boss.recovery + "만큼 체력을 회복합니다.");
			}
			System.out.println("----------------------------------------------");
			
			
			
					
		}
		
	}

}
