import java.util.Random;

public class Enemy3 extends Enemy {
	
	public Enemy3(String type, int hp) {
		super(type, hp);
		
	}
	
	
	
	public void underAttack() {
		Random r = new Random();
		int damage = r.nextInt(20) + 10;
		this.hp = this.hp - damage;
		System.out.println(this.type + "은(는) " + damage + "의 데미지를 입었습니다. 남은 HP : " + this.hp);
		this.checkHP();
		
	}

}
