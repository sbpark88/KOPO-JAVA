import java.util.Random;

public class SangHun extends Player {
	int damage;
	
	SangHun(){
		this.name = "전상훈";
		this.hp = 200;
	}

	@Override
	public void underAttack(Player attacker) {
		super.underAttack(attacker);
		
		damage = 10;
		if (attacker.name.equals("전상훈")) {
			damage = ((SangHun)attacker).damage;
		}
		
		
		Random r = new Random();
		Random r2 = new Random();
		int damage = r.nextInt(10);
		this.hp = this.hp - damage;
		int headshot = r2.nextInt(100);
		if(headshot == 13) {
			System.out.println("헤드샷을 맞았습니다.");
			this.isLive = false;
		}
			
		
		
		
	}

}
