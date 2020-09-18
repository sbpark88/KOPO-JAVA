import java.util.Random;

public class Enemy {
//public abstract class Enemy {
	String type;
	int hp;
	boolean isLive = true;
	
	public Enemy() {
		this.type = "피라미";
		this.hp = 100;
	}
	
	public Enemy(String type, int hp) {
		this.type = type;
		this.hp = hp;
	}
	
	public void underAttack() {
		Random r = new Random();
		int damage = r.nextInt(20) + 10;
		this.hp = this.hp - damage;
		System.out.println(this.type + "은(는) " + damage + "의 데미지를 입었습니다. 남은 HP : " + this.hp);
		this.checkHP();
		
	}
	
//	public abstract void underAttack(); // 난 underAttack()이라는 메소드가 있어. 하지만 Super 클래스에서는 선언만 하고 구현은 안 할거야! 그건 Sub 클래스가 할거야! (위에 class도 abstract로 바꿔준다.)
										// 이렇게 하고 Sub 클래스를 생성하면 underAttack()을 만들라고 자동완성 시켜준다.
	public void checkHP() {
		if (this.hp < 1) {
			System.out.println(this.type + "이(가) 파괴되었습니다.");
			this.isLive = false;
		}
	}

}
