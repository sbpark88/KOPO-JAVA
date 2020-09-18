
public class Round extends CalcArea {	// 'Round'클래스는 'CalcArea'클래스의 Sub class다.
	// 방법 1.
	double radius;
	double pi = Math.PI;
	
	public Round(double radius) {		// Round 클래스의 생성자.
		this.shape = "원";
		this.radius = radius;
	}
	
	public void calcSize() {
		this.area = this.radius * this.radius * this.pi;
	}
	
	// 방법 2. 만약 calcSize() 메소드를 없애고, printArea() 메소드에 this.calcSize()를 없애고 싶다면 이렇게 하면 된다. 
//	double radius;
//	double pi = Math.PI;
//	
//	public Round(double radius) {		// Round 클래스의 생성자.
//		this.shape = "원";
//		this.radius = radius;
//		this.area = this.radius * this.radius * this.pi;
//	}
	
}
