import java.util.Arrays;

public class Cashier extends People { // 예쁘게 보려면 학생 클래스 역시 방법 1 로 되어있어야 함.
	int salesBook[] = new int[10];	// 0~9번 학생의 누적 구매 금액을 적을 장부 생성.
	int salesBookLen = this.salesBook.length;
	People[] stuNum;	// Student[0] ~ Student[9] 클래스를 배열로 모두 불러와야 학생 데이터를 사용할 수 있다.
	
	// Step 3.1.
	public Cashier(String name, int age, People[] stuNum) {
		super(name, age);
		// TODO Auto-generated constructor stub
		for(int i = 0; i < salesBookLen; i++) {
			this.salesBook[i] = 0;	// 생성될 때 0~9번 학생의 누적 구매 장부를 초기화.
		}
		this.stuNum = stuNum;			
	}
	
	// Step 3.2. 학생이 구매할 때마다 각각의 학생별 장부에 금액을 누적하는 로직.
	public void sale (int buyerNum, int goodsPrice) {
		this.salesBook[buyerNum] = this.salesBook[buyerNum] + goodsPrice;
	}
	
	// Step 3.2. 구매자(학생)별 매출을 계산하는 로직.
	public void salesByBuyer (int buyerNum) {
		System.out.println(this.salesBook[buyerNum]);
	}
	
	// Step 3.2. 전체 매출을 계산하는 로직.
	public int totalSales () {
		return Arrays.stream(salesBook).sum();
	}
	
	// Step 3.2. 메인 로직.
	public String toString() {
		System.out.println("매점 직원 : " + super.toString() + " 전체 매출 : " + this.totalSales() + "원");
		System.out.println("학생별 매출");
		for (int i = 0; i < salesBookLen; i++) {
			System.out.println(stuNum[i] + "가 사용한 금액은 : " + this.salesBook[i] + "원");
		}
	
		return "";
	}
	
}
