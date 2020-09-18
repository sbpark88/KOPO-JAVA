import java.util.Random;

public class KimMinseok  extends Player{
	private int evade = 60;  // 회피율입니다. 60% 확률로 공격을 회피합니다.
	private int regen = 10;  // 체력재생입니다. 체력이 0이 아니라면 현재체력의 10%를 회복하며 최대체력 100 이상으로는 회복하지 않습니다.
	
	int damage;
	
	KimMinseok(){
		this.name = "김민석";
		this.hp = 100;
	}
	
	@Override
	public void underAttack(Player attacker) {
		super.underAttack(attacker);
		
		damage = 10;
		if (attacker.name.equals("김민석")) {
			damage = ((KimMinseok)attacker).damage;
		}
		
		if(!this.isMiss()) {
			Random r = new Random();
			int damage = r.nextInt(20)+20;
			System.out.print(this.name+"은 "+damage+"의 피해를 입었다. ");
			this.hp -= damage;
		} else {
			System.out.println("!감나빗");
		}
		// 20~40의 피해를 입고, 회피할 경우 피해를 입지 않습니다.
		
		
		if(this.hp>0 && this.hp != 100) {
			System.out.print(this.hp*regen/100+" 체력을 회복했다.");
			this.hp = (int)((double)this.hp*(100+this.regen)/100);
			if(this.hp > 100) this.hp = 100;
		} else if(this.hp<=0) {
			this.hp = 0;
		}
		System.out.println("현재체력 : "+this.hp);
		// 최대체력이거나 체력이 0 이하가 아니면 현재체력의 10% 를 회복합니다.
		// 체력이 100을 넘거나 0 미만이면 100, 0으로 맞춰줍니다.
		
		
		this.checkHp();  // 생존여부를 판단
	}
	
	public boolean isMiss() {
		Random r = new Random();
		if(r.nextInt(100) < this.evade) {
			return true;
		} else {
			return false;
		}
	}
	// 1~100의 랜덤한 수가 회피율보다 낮으면 true를 반환합니다.
	// 회피율이 높아질수록 true가 반환될 확률이 높습니다.

}
