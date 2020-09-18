import java.util.Random;
import java.util.Scanner;

public class Sangmin extends Player {
	int mp;	// mp 정의
	int damage;
	int attackerMp;
	
	public Sangmin() {
			this.name = "이상민";
			this.hp = 100;
			this.mp = 50;
	}
	
	@Override
	public void underAttack(Player attacker) {
			super.underAttack(attacker);
			
			int damage = 10;
			if (attacker.name.equals("이상민")) {
				damage = ((Sangmin)attacker).damage;
			}
		
			Random r = new Random();
			damage = 10 + r.nextInt(10);
			this.hp = this.hp - damage;
			this.checkSkillUsage(attacker);	// 공격받았을 때 스킬 사용 여부 확인 및 스킬 사용.
			System.out.println(attacker.name + "이(가) " + this.name + "을 공격했습니다.");
			System.out.println(this.name + "이(가) " + damage + "의 피해를 입었습니다.");
			this.passiveSkillHp();		// 공격받을 때마다 패시브 스킬을 통해 hp 회복
			if (r.nextInt(2) == 0) {	// 50%의 확률로 패시브 스킬을 통해 mp 회복
					this.passiveSkillMp();
			}
			this.checkHp();
			System.out.println(this.name + "의 남은 mp: " + this.mp);
	}
	
	// skill1 사용 전 mp 확인
	public void checkSkill1Mp() {
			if (this.mp < 10) {
					System.out.println("현재 마나는 " + this.mp + "로 해당 스킬을 사용할 수 없습니다.");
					return;
			}
	}
	
	// skill2, skill3 사용 전 mp 확인
	public void checkSkill2Mp() {
			if (this.mp < 20) {
					System.out.println("현재 마나는 " + this.mp + "로 해당 스킬을 사용할 수 없습니다.");
					return;
			}
	}
	
	// skill4 사용 전 mp 확인
	public void checkSkill3Mp() {
			if (this.mp < 40) {
				System.out.println("현재 마나는 " + this.mp + "로 해당 스킬을 사용할 수 없습니다.");
				return;
			}
	}
	
	// hp passive 스킬
	public void passiveSkillHp() {
			int hpRecovery = 5; // 공격받을 때마다 5씩 회복
			
			this.hp = this.hp + hpRecovery;
			System.out.println("패시브 스킬로 " + this.name + "의 hp가 5 회복되었습니다.");
	}
	
	// mp passive 스킬
	public void passiveSkillMp() {
			int mpRecovery = 20; // 50%의 확률로 20씩 회복
			
			this.mp = this.mp + mpRecovery;
			System.out.println("패시브 스킬로 " + this.name + "의 mp가 20 회복되었습니다.");
	}
	
	// skill1 - 상대방을 침묵(마나 사용 x)시키는 기술
	public void skill1(Player attacker) {
			mp = 10;
			if (attacker.name.equals("이상민")) {
				mp = ((Sangmin)attacker).mp;
			}

			this.checkSkill1Mp();
			long start = System.currentTimeMillis();
			int attackerMp = mp;
			this.mp = this.mp - 20;
			System.out.println("0.001초 동안 상대방이 마나를 쓰지 못하도록 침묵시킵니다.");
			System.out.println("스킬 사용으로 마나 20이 감소되었습니다.");
			for (int i = 0 ; i < 999; i++) {
					long end = System.currentTimeMillis();
					if ((start - end) < 1) {
							mp = 0;
					} else {
							mp = attackerMp;
					}
			}
	}
	
	// skill2 - 현재 체력의 20%를 회복하는 기술
	public void skill2(Player attacker) {
			this.checkSkill2Mp();
			this.hp = (int)(this.hp * 1.2);
			System.out.println("hp를 20% 회복합니다.");
			this.mp = this.mp - 20;
			System.out.println("스킬 사용으로 마나 20이 감소되었습니다.");
	}
	
	// skill3 - 상대방의 공격데미지를 30% 깎음.
	public void skill3(Player attacker) {
			this.checkSkill2Mp();
			damage = (int)(damage * 0.7);
			System.out.println("상대방의 공격데미지를 30% 깎습니다.");
			this.mp = this.mp - 20;
			System.out.println("스킬 사용으로 마나 20이 감소되었습니다.");
	}
	
	// skill4 - 상대방의 hp를 20%의 확률로 90% 깎음.
	public void skill4(Player attacker) {
			this.checkSkill3Mp();
			this.mp = this.mp - 40;
			System.out.println("스킬 사용으로 마나 40이 감소되었습니다.");
			Random r = new Random();
			if (r.nextInt(5) == 0) {
					attacker.hp = (int)(attacker.hp * 0.1);
					System.out.println("상대방의 hp가 90% 감소되었습니다.");
			}
			System.out.println("상대방의 hp가 감소되지 않았습니다.");
	}
	
	// 공격 받았을 때 스킬 사용 여부 확인
	public void checkSkillUsage(Player attacker) {
			System.out.println("스킬을 사용하시겠습니까? 스킬을 사용하려면 1, 사용하지 않으려면 2를 눌러주세요.");
			Scanner scanner = new Scanner(System.in);
			if (scanner.nextInt() == 2) {
					return;
			}
			
			// 스킬 사용 시 스킬 사용 안내창으로 넘어감
			this.skillUsage(attacker);
	}
	
	public void skillUsage(Player attacker) {
			System.out.println("어떤 스킬을 사용하시겠습니까? 1) 침묵, 2)힐, 3)쉴드, 4)궁극기");
			System.out.println("1) 침묵: 상대방의 스킬 사용을 0.001초동안 억제합니다.");
			System.out.println("2) 힐: 현재 체력의 20%를 채웁니다.");
			System.out.println("3) 쉴드: 상대방의 공격 데미지를 30% 깎습니다.");
			System.out.println("4) 궁극기: 상대방의 hp를 10%의 확률로 90% 깎습니다.");
			System.out.println("1, 2, 3, 4 중 하나를 입력하세요.");
			Scanner scanner = new Scanner(System.in);
			int skillNumber = scanner.nextInt();
			if (skillNumber == 1) {
					this.skill1(attacker);
			} else if (skillNumber == 2) {
					this.skill2(attacker);
			} else if (skillNumber == 3) {
					this.skill3(attacker);
			} else if (skillNumber == 4) {
					this.skill4(attacker);
			} else {
					System.out.println("스킬을 사용하실 수 없습니다.");
					return;
			}
	}
}
