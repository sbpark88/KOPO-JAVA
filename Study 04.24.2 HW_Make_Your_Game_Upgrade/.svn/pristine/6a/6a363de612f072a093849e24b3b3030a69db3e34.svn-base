import java.util.Random;
import java.util.Scanner;

public class Sorceress extends Units {
	Random r = new Random();
	Scanner s = new Scanner(System.in);
	
	public Sorceress() {
		this.name = this.heroName[0];
		this.hp = 6500;
		this.recovery = 50;
		this.saveskill = 0;
	}
	
	@Override
	public String toString() {
		System.out.print(this.name + super.toString());
		return "";
	}
		
	@Override
	public void underAttack(Units attacker, int damage) {
		super.underAttack(attacker, 0);	// 생사 확인.
		
		if (!this.isMiss()) {
			System.out.println(attacker.name + "의 공격이 빗나갔습니다.");
		} else {
			System.out.println(this.name + "은(는)" + damage + " 피해를 입었습니다.");
			this.hp = this.hp - damage;
		}
	}
	
	public boolean isMiss() {
		if (r.nextInt(10) == 1) {	// 10% 확률로 회피.
			return true;
		}
		return false;
	}
	
	String skillTree[] = {"파이어볼","메테오"};
	
	@Override
	public int skill(int select) {
		if (select == 1) {
			System.out.println(this.name + "이(가)" + this.skillTree[0] + "를 사용합니다.");
			this.damage = (1000 + r.nextInt(600)) * (this.saveskill + 1);
			this.saveskill = 0;
		} else if (select == 2 ) {
			System.out.println(this.name + "이(가)" + this.skillTree[1] + "를 사용합니다.");
			this.damage = (100 + r.nextInt(3000)) * (this.saveskill + 1);
			this.saveskill = 0;
		}
		return this.damage;
	}
	
	@Override
	public int attack(int select) {
		if (select == 1 || select == 2) {
			this.skill(select);
		} else {
			this.damage = 100 + r.nextInt(200);
		}
		return this.damage;
	}

	
	

}
