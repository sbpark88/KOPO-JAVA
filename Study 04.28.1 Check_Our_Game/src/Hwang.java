import java.util.Random;

public class Hwang extends Player {
	int damage;
	
	Hwang() {
		this.name = "황현빈";
		this.hp = 150;
	}
	
	@Override
	public void underAttack(Player attacker) {
		super.underAttack(attacker);
		
		int damage = 10;
		if (attacker.name.equals("황현빈")) {
			damage = ((Hwang)attacker).damage;
		}
		
		Random r = new Random();
		int underAttackType = r.nextInt(5);
//		int damage = 10 + r.nextInt(10);
		if (underAttackType == 0) {
			this.hp = this.hp - damage;
			System.out.println(this.name + "은(는) " + damage + "의 피해를 입었습니다.");
		} else if (underAttackType == 1) {
			System.out.println(this.name + "은(는) 공격을 회피하였습니다.");
		} else if (underAttackType == 2) {
			this.hp = this.hp - (damage - 10);
			System.out.println(this.name + "은(는) 공격을 방어하여 " + (damage - 10) + "의 피해를 입었습니다.");
		} else if (underAttackType == 3) {
			this.hp = this.hp + (this.hp / 2);
			if (this.hp > 150) {
				this.hp = 150;
				System.out.println("HP가 최대치입니다. 더이상 회복할 수 없습니다");
			} else {
				System.out.println(this.name + "은(는) 남은 체력의 반만큼 회복하였습니다.");
			}			
		} else if (underAttackType == 4) {
			this.hp = this.hp - (damage + 10);
			System.out.println(this.name + "은(는) 공격을 정통으로 맞아 " + (damage + 10) + "의 피해를 입었습니다.");
		}

		this.checkHp();
	}
}
