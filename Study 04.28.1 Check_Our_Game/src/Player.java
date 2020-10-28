
public class Player {
	String name;
	int hp;
	boolean isLive = true;
	
	public void underAttack(Player attacker) {
		if (!this.isLive) {		// 공격자의 생존 여부 판단.
			return;
		}
	}
	
	@Override
	public String toString() {
		return this.name + "의 HP : " + this.hp;
	}
	
	public void checkHp() {
		if (this.hp < 1) {
			isLive = false;
		}
	}
}
