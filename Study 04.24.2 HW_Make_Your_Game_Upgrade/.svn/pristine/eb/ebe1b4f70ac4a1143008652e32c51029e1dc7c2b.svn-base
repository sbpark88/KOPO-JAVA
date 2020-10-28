
public class Units {
	
	String mobName[] = {"루나틱","픽키","콘도르","카라멜","코코","쵸코","프릴도라","키메라","크램프","프리저","피카츄","파이리","꼬북이","야도란","이상해씨","스켈레톤","밤의 울음꾼","피의 이교도","뒤틀린 숙주","전기뱀장어","골로르","영혼 갈취자","서큐버스","빙하 거인","빙하 괴수"};
	String bossName[] = {"디아블로","메피스토"};
	String heroName[] = {"소서리스","바바리안","아마존","네크로맨서","팔라딘"};
	String name;
	int hp;
	int maxHp;
	boolean isLive = true;
	int recovery;
	int blending;
	int damage;
	int saveskill;
	int defense;
	int level;
	int exp;
	int avoidance;
	
	@Override
	public String toString() {
//		System.out.print(" (HP: " + this.hp + ")   ");
		return " (HP: " + this.hp + ")   ";
	}
	
	public void underAttack(Units attacker, int damage) {
		if (!this.isLive) {
			return;
		}
	}
	
	public void checkHP() {
		if (this.hp < 1) {
			System.out.println(this.name + "이(가) 죽었습니다.");
			this.isLive = false;	// 사망 처리.
			this.hp = 0;			// 사망시 HP 마이너스 된 값을 0으로 보정.
		}
	}
	
	public void recoveryHP() {
		if (this.hp < this.maxHp) {
			this.hp = this.hp + this.recovery;
		}
		if (this.hp > this.maxHp) {		// 회복이 자신의 최대 HP를 넘가지 않도록 보정.
			this.hp = this.maxHp;
		}
	}
	
	public int skill(int select) {
		return 0;
	}
	
	public int attack(int select) {
		return 0;
	}

}
