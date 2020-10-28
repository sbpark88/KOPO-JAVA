import java.util.Random;

public class Kim extends Player {
	int strong;		// 수정 1.1 : 생성자 때문에 Kim 클래스 내에 strong 변수 생성.
	
	Kim() {
		this.name = "김보현";
		this.hp = 100;
		this.strong = 5;
	}
	
	@Override
	public void underAttack(Player attacker) {
		super.underAttack(attacker);
				
		int strong = 0;		// 수정 2.1 다른 학생의 클래스에는 없는 변수 때문에 int strong 변수를 선언해준다.
		// 수정 2.2 : if ~ else를 삽입해 내가 만든 클래스의 기능을 사용할건지, 공통 부분만 사용해 범용성으로 갈건지를 결정한다.
		// (공격자가 내가 만든 클래스에 있는 "홍길동"이라면 내가 만든 Kim 클래스로 형변환시키고 아니면 아래 else 문으로 일반화 한다.)
		if (attacker.name.equals("김보현")) {		
			Kim tmp = (Kim)attacker;	// 수정 2.3 : 내가 만든 클래스를 사용하도록 인풋 파라미터로 들어온 attacker를 내가 만든 Kim 클래스로 형변환 시킨다.
			strong = tmp.strong;
			// 위 과정을 하나로 합치면 strong = ((Kim)attacker).strong; 으로 줄일 수 있다.
		} else {
			strong = 10;
		}
		
		// 위에는 이렇게 바꿀 수도 있다. 이게 더 깔끔해보인다.
//		int strong = 10;	// 수정 2.1 다른 학생의 클래스에는 없는 변수 때문에 int strong 변수를 선언해준다.
//		// 수정 2.2 : if ~ else를 삽입해 내가 만든 클래스의 기능을 사용할건지, 공통 부분만 사용해 범용성으로 갈건지를 결정한다.
//		// (공격자가 내가 만든 클래스에 있는 "홍길동"이라면 내가 만든 Kim 클래스로 형변환시키고 아니면 아래 else 문으로 일반화 한다.)
//		if (attacker.name.equals("김보현")) {		
//			Kim tmp = (Kim)attacker;	// 수정 2.3 : 내가 만든 클래스를 사용하도록 인풋 파라미터로 들어온 attacker를 내가 만든 Kim 클래스로 형변환 시킨다.
//			strong = tmp.strong;
//			// 위 과정을 하나로 합치면 strong = ((Kim)attacker).strong; 으로 줄일 수 있다.
//		}		
		
		
		if (this.isPowerUp()==true) {	// 수정 2.4 attacker.strong을 전부 strong으로 바꿔준다. (Super Class인 Player 클래스나 다른 학생의 객체에는 strong이 없으니까)
			System.out.println(this.name + "은(는)" + attacker.name + "(으)로부터" + strong +  "의 피해를 입었습니다.");
			this.hp = this.hp - strong;
			System.out.println("분노! "+ this.name + "의 공격력이 10올랐습니다.");
			this.strong = this.strong + 10;
		} else {
			System.out.println(this.name + "은(는)" + attacker.name + "(으)로부터" + strong +  "의 피해를 입었습니다.");
			this.hp = this.hp - strong;
		}
		
		this.checkHp();
	}
	
	public boolean isPowerUp() {
		Random r = new Random();
		if (r.nextInt(2) == 1) {
			return true;
		}
		return false;
	}

}
