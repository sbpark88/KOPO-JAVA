import java.util.Random;

public class GoGilDong extends Player {
	GoGilDong() {
		this.name = "고길동";
		this.hp = 50;
	}
	
	@Override
	public void underAttack(Player attacker) {
		super.underAttack(attacker);
		
		if (!this.isMiss()) {
			System.out.println(attacker.name + "의 공격이 빗나갔습니다.");
		} else {
			System.out.println(this.name + "은(는) 20의 피해를 입었습니다.");
			this.hp = this.hp - 20;
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
}
