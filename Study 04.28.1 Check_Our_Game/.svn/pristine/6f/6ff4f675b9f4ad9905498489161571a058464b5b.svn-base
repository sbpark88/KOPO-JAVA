import java.util.Random;

// Hansol class (sub class)
public class Hansol extends Player {
//	추가 속성
	int damage;
	
//	생성자: 과제 제출시에는 생성자 이걸로 바꿔서 내기.
	Hansol() {
		this.name = "한솔";
		this.hp = 100;
	}
	
//	Hansol이 공격 받는 메소드
	@Override
	public void underAttack(Player attacker) {
		super.underAttack(attacker);
//		즉사 여부를 확인
		
		int damage = 10;
		if (attacker.name.equals("Hansol")) {
			damage = ((Hansol)attacker).damage;
		}
		
		
		this.dieOnTheSpot(attacker);
//		즉사 시 return값 none
		if (!this.isLive) {
			return;
		}
//		상황별 damage를 계산해주는 메소드 소환
		damage = this.calcDamage(attacker);
		this.hp -= damage;
		System.out.println(this.name + "은(는) " + damage + "의 피해를 입었습니다.");
//		heal 메소드를 소환
		this.calcHeal();
//		생사확인 메소드 소환
		this.checkHp();
//		나와 attacker가 둘 다 생존해있으면 반격함
		this.Attack(attacker);
	}
	
//	damage를 계산해주는 메소드
	public int calcDamage(Player attacker) {
//		attacker의 hp가 내 hp의 절반에도 못 미치면 damage = 0
		if (this.hp > attacker.hp*2) {
			return 0;
//		attacker의 hp가 내 hp보다 작으면 damage = 10
		} else if (this.hp > attacker.hp) {
			return 10;
//		attacker의 hp가 내 hp보다 크면 damage = 10 + r.nextInt(10)
		} else {
			Random r = new Random();
			return 10 + r.nextInt(10);
		}
	}
	
//	공격 받았을 때 회복력(heal)을 계산해주는 메소드
	public void calcHeal() {
//		내 hp가 50보다 크고 damage가 10보다 클 때 hp 5를 회복시켜줌
		if (this.hp > 50 && damage > 10) {
			this.hp += 5;
			System.out.println(this.name + "은(는) HP 5를 회복했습니다.");
//		그 외 공격에 대해서는 hp 2를 회복시켜줌
		} else {
			this.hp += 2;
			System.out.println(this.name + "은(는) HP 2를 회복했습니다.");
		}
	}
	
//	내 hp의 2배보다 더 높은 attacker에게 공격당한 경우 즉사하는 메소드
	public void dieOnTheSpot(Player attacker) {
		if (attacker.hp > this.hp*2) {
			this.isLive = false;
			System.out.println(this.name + "이 강적에게 공격당해 즉사했습니다...\n");
		}
	}
//	attacker를 반격하는 메소드
	public void Attack(Player attacker) {
//		나와 attacker가 둘 다 생존해있으면 반격함
		if (this.isLive && attacker.isLive) {
			System.out.print(this.name + "의 반격: ");
			attacker.underAttack(this);
		}
	}
}
