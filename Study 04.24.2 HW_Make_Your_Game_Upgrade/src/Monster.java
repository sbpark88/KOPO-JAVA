import java.util.Random;

public class Monster extends Units {
	Random r = new Random();
	
	public Monster() {
		this.name = this.mobName[r.nextInt(this.mobName.length)];
		this.hp = 2000 + r.nextInt(1000);
		this.toString();
	}
	
	@Override
	public String toString() {
		System.out.print(this.name + super.toString());
		return "";
	}
	
	@Override
	public void underAttack(Units attacker, int damage) {
		super.underAttack(attacker, 0);	// 생사 확인.
		
		this.hp = this.hp - damage;
	}
	
	@Override
	public int attack(int select) {
		this.damage = 25 + r.nextInt(30);		
		return this.damage;
	}
	
	
}
