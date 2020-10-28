
public class CalcArea {	// 'CalcArea'클래스는 'Triangle', 'Square', 'Round'클래스의 Super class다.
	// 방법 1.
	String shape;
	double area;
	
	public void calcSize() {	// 이 부분을 지우고 위에 double area = 0;으로 포맷해도 될 것 같지만, 왜 필요한지는 Sub 클래스인 Triangle 클래스를 보자.
		this.area = 0;
	}
	
	public void printArea() {
		this.calcSize();		// 0을 가져오라 해서 이상한 것 같지만, 왜 필요한지는 Sub 클래스인 Triangle 클래스를 보자.
		System.out.println(this.shape);		// 이걸 각각의 Triangle, Square, Round에 넣어도 되지만 이렇게 분리하면 얘 하나만 수정하면 3개가 동일하게 수정되기 때문에 유지보수가 쉽다는 장점을 가진다.
		System.out.println("면적 : " + this.area);	// calcSize()메소드는 물론 this.calcSize()가 없다면 this.area는 계산되지 않은 null 값을 가져오게된다.
	}
	
	// 방법 2. 만약 calcSize() 메소드를 없애고, printArea() 메소드에 this.calcSize()를 없애고 싶다면 이렇게 하면 된다.
//	String shape;
//	double area;
//	
//	public void printArea() {
//		System.out.println(this.shape);
//		System.out.println("면적 : " + this.area);
//	}
	
}
