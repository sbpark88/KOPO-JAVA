import java.util.Random;

public class BossMob extends Monster {
	Random r = new Random();
	
	String bossName;
	
	public BossMob () {
		this.bossName = "디아블로";
		this.hp = 30000;
		this.recovery = 100;
		this.toString();
	}
	
	public String toString() {
		System.out.print(this.bossName);
		return super.toString();
	}
	
	@Override
	public int attack() {
		if (r.nextInt(10) == 0) {	// 10% 확률로 실행.
			System.out.println("디아블로가 치명타로 공격합니다!");
			this.damage = 800 + r.nextInt(800);
			return this.damage;
		} else {					// 90% 확률로 실행.
			this.damage = 200 + r.nextInt(400);
			return this.damage;
		}
	}
	
	@Override
	public void checkHP() {
		if (this.hp < 1) {
			System.out.println(this.bossName + "이(가) 죽었습니다.");
			this.isLive = false;
			this.hp = 0;	// 사망시 HP 마이너스 된 값 0으로 보정.
		}
	}
	
	@Override
	public void recoveryHP() {
		if (this.hp < 30000) {
			this.hp = this.hp + this.recovery;
		}
		if (this.hp > 30000) {	// 회복은 하지만 자신의 최대 HP를 넘어갈 수 없도록 보정.
			this.hp = 30000;
		}
	}
	
	
	public int skill() {
		this.damage = 500 + r.nextInt(1000);
		return this.damage;
	}

}
