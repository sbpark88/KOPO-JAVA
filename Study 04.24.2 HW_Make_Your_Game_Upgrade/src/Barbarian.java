import java.util.Random;
import java.util.Scanner;

public class Barbarian extends Units {
	Random r = new Random();
	Scanner s = new Scanner(System.in);
	
	public Barbarian() {
		this.name = this.heroName[1];
		this.hp = 9500;
		this.recovery = 150;
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
		
		if (!this.avange()) {
			System.out.println(this.name + "은(는)" + damage + " 피해를 입었습니다.");
			this.hp = this.hp - damage;
			System.out.println(this.name + "은(는)" + (int)((double)damage / 10) + " 피해를 돌려줍니다.");
		} else {
			System.out.println(this.name + "은(는)" + damage + "피해를 입었습니다.");
			this.hp = this.hp - damage;
		}
	}
	
	public boolean avange() {
		if (r.nextInt(5) == 1) {	// 20% 확률로 복수.
			return true;
		}
		return false;
	}
	
	String skillTree[] = {"휠윈드","방어력 증"};
	
	@Override
	public int skill(int select) {
		if (select == 1) {
			System.out.println(this.name + "이(가)" + this.skillTree[0] + "를 사용합니다.");
			this.damage = (2000 + r.nextInt(500)) * (this.saveskill + 1);
			this.saveskill = 0;
		} else if (select == 2 ) {
			System.out.println(this.name + "이(가)" + this.skillTree[1] + "를 사용합니다.");
			this.damage = (300 + r.nextInt(1600)) * (this.saveskill + 1);
			this.saveskill = this.saveskill - 1;
		}
		return this.damage;
	}
	
	@Override
	public int attack(int select) {
		if (select == 1 || select == 2) {
			this.skill(select);
		} else {
			this.damage = 300 + r.nextInt(100);
		}
		return this.damage;
	}
	
	

}
