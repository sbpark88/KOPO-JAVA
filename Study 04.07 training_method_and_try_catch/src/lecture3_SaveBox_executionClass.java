
public class lecture3_SaveBox_executionClass {
	public static void main(String[] args) {
		SaveBox pig1 = new SaveBox();
		SaveBox pig2 = new SaveBox();
		// int a와 int b가 같은 int지만 서로 다른 a와 b인 것처럼, 같은 Svaebox 클래스지만 pig1과 pig2는 다르다. Savebox 클래스의 객체변수 pig1, pig2.
		// 즉, pig1도 deposit 메소드를 하고, pig2도 deposit 메소드를 하지만 둘은 서로 다른 세계다.
		// OOP : (Svabox = 우주, pig = 내 통장, depoist = 로또 당첨. 나와 다른 평행우주에 살고 있는 또 다른 내가 로또에 당첨되는 것은 서로 별개다.)
		// 객체지향 기법이라 이름을 붙인 만큼 현실 세계에 반영시켜 이해를 해보면 쉽다.
		
		
		pig1.deposit(100);	// 100	// pig1 클래스에서 deposit 메소드를 실행해. (deposit 메소드는 int를 인풋 파라미터로 받음.)
		pig1.deposit(500);	// 600
		pig1.deposit(200);	// 800
		pig1.deposit(300);	// 1100
		pig1.deposit(500);	// 1600
		
		pig2.deposit(20000);
		
		pig1.withdraw();	// 1600
		pig2.withdraw();	// 2000
		

		
		pig1.coinAmount = 200;
		// 메소드를 불러오지 않고 pig1 클래스의 coinAmount라는 변수에 직접 데이터를 넣는다. 실제로 작동한다.
		// OOP : (내 우주(SaveBox) 밖의 전지적인 능력자가 내 통장(pig2) 잔고를 강제로 200원으로 바꾼다.)
		// OOP : (그래서 나는 이걸 막기 위해 private라는 키워드로 보호막을 쳐서 보호한다. - 정보은닉)
//		1. 일반적으로 객체 내부의 데이터는 외부에서 접근 못하게 한다. - 자바는 이쪽을 따르는게 업계의 룰. / 파이썬에서는 그냥 직접 접근하는 것이 업계의 룰.
//		2. 단, 현대 프로그래밍 기법에서는 필요에 의해서 접근을 허용한다. setter, getter 개념을 따른다. (자바쪽 업계의 룰)
		
		// 이것 막기 위해 클래스 상에 private int coinAmount로 선언한다. 이렇게 하면 메소드로만 접근이 가능하다.		
		pig1.withdraw();
		// 위에 pig1.coinAmount = 200에 의해 강제로 200원으로 값이 바뀌어 200이 출력될거다. SaveBox 클래스에 가서 private을 붙여보고 어떻게 되는지 다시 출력해보자.
		
		
	}

}
