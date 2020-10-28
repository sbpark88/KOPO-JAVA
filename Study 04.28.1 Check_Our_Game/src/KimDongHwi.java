import java.util.Random;
public class KimDongHwi extends Player{
	KimDongHwi() {
		this.name = "김동휘";
		this.hp = 100;
	}
	
	// 공격 받는 데미지가 그냥 상수라 변경할 필요 없음.
	
	@Override 
	public void underAttack(Player attacker) {
		super.underAttack(attacker);
		
		if (!this.isMiss()) {
			System.out.println(attacker.name + "의 공격이 빗나갔습니다.");
		}else {
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
