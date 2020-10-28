import java.util.Random;

public class Player2 extends Player {
	int heal;
	int leftHP;
	int damage;
	
	Player2() {
		this.name = "오성훈";
		this.hp = 100;
		this.heal = heal;
		this.leftHP = leftHP;
	}
	@Override
	public void underAttack(Player attacker) {
		super.underAttack(attacker);
		
		damage = 10;
		if (attacker.name.equals("오성훈")) {
			damage = ((Player2)attacker).damage;
		}
		
		Random r = new Random();
		int damage = 15 + r.nextInt(10);
		this.hp = this.hp - damage;
		this.heal = r.nextInt(10)+5;
		this.leftHP = this.hp + this.heal;
		if (this.hp > 100) {
			System.out.println(this.name + "님은 " + damage + "의 피해를 입었습니다");
			System.out.println(this.name + "님은 스킬 사용으로 " + heal + "만큼의 치유를 하였습니다" + "현재 HP의 상태: " + this.leftHP);
		}
		

		this.checkHp();
	}
}



