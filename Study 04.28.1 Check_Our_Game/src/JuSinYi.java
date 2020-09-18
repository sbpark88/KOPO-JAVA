import java.util.Random;

public class JuSinYi extends Player {
	int damage;
	
	JuSinYi() {
		this.name = "주신이";
		this.hp = 100;
	}

	@Override
	public void underAttack(Player attacker) {
		super.underAttack(attacker);

		damage = 10;
		if (attacker.name.equals("주신이")) {
			damage = ((JuSinYi)attacker).damage;
		}
		
		if (!this.isMiss()) {
			System.out.println(attacker.name + "의 공격이 빗나갔습니다.");
		} else if (this.shield()) {
			System.out.println(attacker.name + "의 공격을 막았습니다.");
		} else {
			this.hp = this.hp - 30;
			System.out.println(this.name + "은(는) 30의 피해를  입었습니다.");
		}
		this.checkHp();
	}

	public boolean isMiss() {
		Random r = new Random();
		if (r.nextInt(2) == 1) {
			return true;
		}
		return false;
	}

	public boolean shield() {
		Random r = new Random();
		if (r.nextInt(2) == 1) {
			return true;
		}
		return false;
	}


	public void heal() {
		Random r = new Random();
		if (this.hp < 50) {
			int recovery = r.nextInt(10);
			this.hp = this.hp + recovery;
			System.out.println("※HP가 50이하로 떨어져 회복 기능이 실행되었습니다.※");
			System.out.println("HP가 "+ recovery + "만큼 회복되었습니다.");
		} else {
			return;
		}
	}
}
