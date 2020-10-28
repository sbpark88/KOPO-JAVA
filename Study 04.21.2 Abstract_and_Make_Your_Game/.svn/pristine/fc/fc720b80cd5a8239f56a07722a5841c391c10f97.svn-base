import java.util.Random;

public class Enemy2 extends Enemy {
	
	public Enemy2(String type, int hp) {
		super(type, hp);
	}
	
	@Override
	public void underAttack() {
		int damage = 20;
		this.hp = this.hp - damage;
		System.out.println(this.type + "은(는) " + damage + "의 데미지를 입었습니다. 남은 HP : " + this.hp);
		
		Random r = new Random();
		int heal = r.nextInt(20);
		this.hp = this.hp + heal;
		System.out.println(this.type + "은(는) " + heal + "의 HP를 회복했습니다. 남은 HP : " + this.hp + "\n");
		
		this.checkHP();
	}

}
