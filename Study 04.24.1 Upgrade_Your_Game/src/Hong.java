import java.util.Random;

public class Hong extends Player {
	Hong() {
		this.name = "홍길동";
		this.hp = 100;
	}
	
	@Override
	public void underAttack(Player attacker) {
		super.underAttack(attacker);

		Random r = new Random();
		int damage = 10 + r.nextInt(10);
		this.hp = this.hp - damage;
		System.out.println(this.name + "은(는) " + damage + "의 피해를 입었습니다.");

		this.checkHp();
	}
}
