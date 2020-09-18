import java.util.Random;

public class JHP extends Player {
	private int damage;
	private int criticalRatio;
	
	Random r = new Random();
	
	JHP() {
		this.name = "박종환";
		this.hp = 1;
	}

	@Override
	public void underAttack(Player attacker) {
		super.underAttack(attacker);
		
		damage = 99999;
		if (attacker.name.equals("박종환")) {
			damage = ((JHP)attacker).damage;
		}
		

		if (!this.isMiss()) {
			System.out.println(attacker.name + "의 공격이 빗나갔습니다.");
		} else {
			System.out.println(this.name + "은(는)" + damage + "의 피해를 입었습니다.");
			this.hp = this.hp - damage;
		}

		this.checkHp();
		
		if (!this.isLive) {
			System.out.println(this.name + "이 부활했습니다.");
			this.isLive = true;
			this.hp = 1;
		}

	}
	
	public boolean isMiss() {
		if (r.nextInt(3) == 0) {	// 33% 확률로 회피.
			return false;
		}
		return true;
	}
	
	// 어차피 적용은 안 되겠지만...
	public int damage() {
		this.damage = 20 + r.nextInt(10);	// 평타 20~30.
		this.criticalRatio = 1;
		if (r.nextInt(1) == 0) {	// 10% 확률로 평타 (20~30) * 최대 4배수.
			this.criticalRatio = 1 + r.nextInt(3);
			System.out.println("10% 확률로 크리티컬이 발동하여" + this.criticalRatio + "배로 공격합니다.");
		}
		return (this.damage * this.criticalRatio);
	}
	
	
	
	
}