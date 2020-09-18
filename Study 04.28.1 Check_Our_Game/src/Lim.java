import java.util.Random;

public class Lim extends Player {
	int damage;
	
	Lim() {
		this.name = "임지원";
		this.hp = 200;
	}
	
	@Override
	public void underAttack(Player attacker) {
		super.underAttack(attacker); // player의 underAttack부분 hp확인해서 죽었는지 살았는지 체크해주는
		
		damage = 10;
		if (attacker.name.equals("임지원")) {
			damage = ((Lim)attacker).damage;
		}

		Random r = new Random();
		int damage = 10 + r.nextInt(10);
		System.out.println(this.name + "은(는) " + damage + "의 피해를 입었습니다.");
		int randomPercentage = r.nextInt(2);
		if (randomPercentage == 0) {
			System.out.println("☆조력자가 나타났습니다☆");
			int help = 0;
			if (damage >= 15) {
				help = r.nextInt(5) + 5;
			} else {
				help = r.nextInt(3) + 1;
			}
			this.hp = this.hp - damage + help;
			System.out.println("조력자의 도움으로 " + help + "만큼 회복했습니다.");
		} else {
			this.hp = this.hp - damage;
		}
		this.checkHp();
	}

}
