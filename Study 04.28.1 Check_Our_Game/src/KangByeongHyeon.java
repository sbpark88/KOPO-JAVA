
import java.util.*;

public class KangByeongHyeon extends Player { // 상속부분
	int damage;

	private boolean switchOn = false; // 아이언맨수트를 착용유무를 나타냄
	private int stack = 0; // 아이언맨수트를 착용하고 스택이 쌓임.(스택이 3번쌓이면 일격필살 발동 구현)

	KangByeongHyeon() { // 이름과 체력을 정의
		this.name = "강병현";
		this.hp = 100;
	}

	@Override
	public void underAttack(Player attacker) { // 공격받을때 정의(공격한자)

		super.underAttack(attacker); // 종속된 underAttack 메소드를 불러옴
		
		damage = 10;
		if (attacker.name.equals("강병현")) {
			damage = ((KangByeongHyeon)attacker).damage;
		}

		if (this.isMiss()) { // 공격회피 함수가 true일때 구현
			System.out.println("10%의 확률로 " + attacker.name + "의 공격이 빗나갔습니다.");
			if (this.switchOn) { // 아이언맨수트가 한번이라도 구현되었을때 작동
				System.out.println("[남은 스택:" + (3 - this.stack) + "]"); 
				this.stack = this.stack + 1; // 아이언맨수트를 입었을때 스택이쌓이는것을 구현
			}

		} else if (this.inevitableSkill()) { // 아이언맨 필살기 구현
				
			System.out.println("\n아이언맨 수트를 착용한 강병현은(는)" + attacker.name + "의 공격을 흡수합니다.");
			System.out.println("아이언맨의 필살기를 사용합니다.");
			System.out.println("[일격 필살] 프로톤 캐논!!!");
			System.out.println("프로톤 캐논을 맞은 " + attacker.name + "은(는) 즉사하였습니다.\n");
			attacker.hp = 0; // 공격한자의 체력을 강제로 0으로 만듬
			attacker.isLive = false; // 공격한자의 생명을 false로 바꿈
			this.stack = 0; // 스택은 0으로 초기화됨.
			
		} else {
			Random r = new Random(); // 랜덤변수를 정의
			int damage = 10 + r.nextInt(10); // 데미지를 10~19까지로 정의
			this.hp = this.hp - damage; // 체력에서 데미지만큼 감소 정의
			System.out.println(this.name + "은(는) " + damage + "의 피해를 입었습니다.");

			if (this.switchOn) {
				System.out.println("[남은 스택:" + (3 - this.stack) + "]");
				this.stack = this.stack + 1; // 아이언맨수트를 입었을때 스택이쌓이는것을 구현
			}
		}

		if (this.callGoogleGod()) { // 구글신을 소환하였을때 출력됨

			System.out.println("\n위기에 처한 강병현 은(는) 주문을 외워 인공지능 구글신을 소환합니다!\n");
			System.out.println("\n인공지능구글신이 강림하여 아이언맨 수트를 만듭니다! [체력증가 + 10% 확률로 공격회피 + 일격필살(3스텍시)]\n");
		}

		if (this.ironManSuit()) { // 아이언맨수트를 입었을때 체력을 재정의함
			if (this.hp < 0) {
				this.hp = (-1 * this.hp) * 100;
				System.out.println(this.name + "은(는) 아이언맨 수트로 HP가 비약적으로 증가합니다 " + "HP:" + this.hp + "\n");
			} else if (this.hp == 0) {
				this.hp = this.hp + 500;
				System.out.println(this.name + "은(는) 아이언맨 수트로 HP가 비약적으로 증가합니다 " + "HP:" + this.hp + "\n");
			} else {
				this.hp = (this.hp * 100);
				System.out.println(this.name + "은(는) 아이언맨 수트로 HP가 비약적으로 증가합니다 " + "HP:" + this.hp + "\n");
			}
		}
		this.checkHp(); // 체력체크부분
	}

	public boolean callGoogleGod() { // 구글신 소환메소드
		if (this.hp < 20) { // 체력이 20 미만일시에 발동
			return true;
		}
		return false;
	}

	public boolean ironManSuit() { //아이언맨수트 메소드
		if (callGoogleGod()) { // 구글신 소환시 발동
			this.switchOn = true; // 스위치 on (아이언맨수트 착용시 스택을 이용하여 필살기를 구현하기위해  정의됨)
			return true; // 메소드가 true
		}
		return false;
	}

	public boolean isMiss() { // 공격회피 메소드

		Random r2 = new Random(); // 두번째 랜덤변수 정의

		if (switchOn && (r2.nextInt(9) == 1)) { // 아이언맨수트를 입었고 10%확률시 구현
			return true;
		}
		return false;
	}

	public boolean inevitableSkill() { // 필살기 메소드
		if ((this.stack == 3) && (this.switchOn)) { // 아이언맨수트를 입었고 스택이 3번 쌓였을때 구현
			return true;
		} else {
			if (this.stack > 3) { // 스택이 3번 넘어가면 초기화시킴
				this.stack = 0;
			}
			return false;
		}
	}
}
