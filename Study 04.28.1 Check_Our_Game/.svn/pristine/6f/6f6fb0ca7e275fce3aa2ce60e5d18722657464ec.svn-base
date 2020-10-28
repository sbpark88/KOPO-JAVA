import java.util.Random;

public class parkjeonggeun  extends Player {
	parkjeonggeun() {
		this.name = "박정근";
		this.hp = 110;
	}
	
	// 상수값이라 변경할 필요 없음.
	
	@Override
	public void underAttack(Player attacker) {
		Random r = new Random();
		super.underAttack(attacker);
		int num= r.nextInt(10);
		if (num >=8 ) {
			System.out.println(attacker.name + "의 공격을 방어해 5의 피해를 받았습니다 .");
		} else if(num >=5 && num <= 7) {
			System.out.println(this.name + "은(는) 치명상을 입어 40의 피해를 받았습니다.");
			this.hp = this.hp - 40;
		}else if(num ==1) {
			System.out.println(this.name+"은(는) 물약을 마셨습니다");
			this.hp=this.hp +15;
		}else {
			System.out.println(this.name+"은(는) 20의 피해를 받았습니다");
			this.hp=this.hp-20;
		}
		
		this.checkHp();
	}
	
	
}
