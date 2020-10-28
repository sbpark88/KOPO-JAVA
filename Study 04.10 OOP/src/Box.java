
public class Box {
	private int amount = 0;
	
	// 생성자. new를 통해 처음 들어올 때 초기값을 넣어줄 때 사용. 클래스명을 그대로 만들면 된다. 메모리 주소 할당하며 해당 데이터를 넣고 시작하겠단 의미.
	// 생성자도 아래 메소드의 다형성처럼 인풋 파라미터에 따라 다형성을 가질 수 있다.
	
	// 생성자 1. RunClass에서 new Box()로 초기화 한 경우 여기 걸린다.
	Box() {
		this.amount = 10000;	
	}
	
	
	// 생성자 2. RunClass에서 new Box(숫자)로 초기화 한 경우 여기 걸린다.
	Box(int amount) {
		this.amount = amount;
	}
	
	// 생성자 3. RunClass에서 new Box(숫자, "문자")로 초기화 한 경우 여기 걸린다.
	Box(int amount, String name) {
		this.amount = amount * 100;
	}
	
	// 왜 이렇게 되냐??? RunClass에서 호출할 때 클래스.메소드(값) 으로 호출하는데 이 때 '값'을 클래스로 우선 받고, 클래스가 메소드에 던져준다. (클래스로 바로 들어가는게 아님.)
	
	
	
	// 로직 메소드 1.
	public void deposit(int amount) {
//		// 1. 일반적인 각각의 작동 메소드 2개 만들기.
//		this.amount = this.amount + amount;
//		System.out.println("딸그랑");
//		System.out.println("현재 잔액은 " + this.amount + " 입니다.");
		
		// 2. 메소드에서 다른 메소드를 호출해서 메소드를 넘기기. <<메소지의 다형성, 오버라이드 : 입력 받는거에 따라서 같은 이름의 메소드가 각각 다른 기능을 할 수 있다.>>
		this.deposit(amount, "딸그랑");	// 금액만 입력 받은 경우 어차피 금액과 딸그랑을 출력할거니까 입력된 금액에 "딸그랑"이라는 메시지를 붙여 아래 메소드로 보낸다.
	}
	
	// 로직 메소드 2.
	// 메소드 이름이 같아도 서로 다른 인풋 파라미터로 각각 다르게 작동하게 할 수 있다.
	public void deposit(int amount, String message) {
		this.amount = this.amount + amount;
		System.out.println("message");
		System.out.println("현재 잔액은 " + this.amount + " 입니다.");
	}
	
	
	
	
	
	
	
	
//	// setter
//	public void setAmount(int amount) {
//		this.amount = amount;
//	}
//	// getter
//	public int getAmount() {
//		return this.amount;
//	}

}
