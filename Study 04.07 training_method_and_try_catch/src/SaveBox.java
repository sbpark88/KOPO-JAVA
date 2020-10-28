
public class SaveBox {
	int coinAmount = 0;
//	private int coinAmount = 0;
	
	
	
	// 일반적인 사용 방법. 해당 클래스 내부의 변수와 인풋 파라미터의 이름을 구분지어 사용한다.
//	public void deposit(int inputCoins) {
//		coinAmount = coinAmount + inputCoins;
//		// coinAmount -> SaveBox 내의 변수
//		// inputCoins -> 인풋 파라미터
//	}
	
	// 해당 클래스 내부의 변수와 인풋 파라미터의 이름이 같으면 문제가 생긴다. 이럴 때는 this.를 통해 나는 내 클래스 안에 변수를 참조할거야! 해주면 된다.
	public void deposit(int coinAmount) {	// 클래스의 전역 변수명과 같은 지역 변수명을 인풋 파라미터로 사용하면 경우 문제가 된다.
		this.coinAmount = this.coinAmount + coinAmount;	// this.를 붙이면 괄호 밖 자기 자신의 클래스에 있는 변수로 접근한다.
		// this.coinAmount 와 메소드 바깥의 coinAmount -> SaveBox 내의 변수
		// 메소드 내의 coinAmount -> 인풋 파라미터
	}
	
	
	
	
	
	public void withdraw() {
		System.out.println("모든 금액의 합계는 " + coinAmount + "입니다.");
		
	}
	
	// setter라 부름. 인풋.
	public void setCoinAmount(int newAmount) {
		coinAmount = newAmount;
	}
	
	// getter라 부름. 아웃풋.
	public int getCoinAmount() {
		return coinAmount;
	}
	
	// 왜 사용할까? setter getter라는 개념은 객체 내부의 데이터를 외부에서 접근 못하게 한다는 개념으로 인해 생겨났다.
	// 데이터에 직접 접근하지 말고 메소드를 통해 접근하라는 뜻.
	// 데이터가 2개면 setter getter도 2개씩(총 4개), 데이터가 3개면 setter getter도 3개씩(총 6개)
	// 즉, coinAmount 하나니까 setter getter가 각 하나씩 2개지만, 다른 데이터가 하나 더 있다면 4개가 된다.
	
	

}
