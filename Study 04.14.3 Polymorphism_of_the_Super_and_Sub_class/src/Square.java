
public class Square extends CalcArea {	// 'Square'클래스는 'CalcArea'클래스의 Sub class다.
	// 방법 1.
	double width;
	double height;
	
	public Square(double width, double height) {		// Square 클래스의 생성자.
		 this.shape = "사각형";
		 this.width = width;
		 this.height = height;
	}
	
	public void calcSize() {
		this.area = this.width * this.height;
	}
	
	// 방법 2. 만약 calcSize() 메소드를 없애고, printArea() 메소드에 this.calcSize()를 없애고 싶다면 이렇게 하면 된다. 
//	double width;
//	double height;
//	
//	public Square(double width, double height) {		// Square 클래스의 생성자.
//		 this.shape = "사각형";
//		 this.width = width;
//		 this.height = height;
//		 this.area = this.width * this.height;
//	}
	
}
