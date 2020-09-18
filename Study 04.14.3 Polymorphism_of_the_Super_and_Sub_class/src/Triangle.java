
public class Triangle extends CalcArea {	// 'Triangle'클래스는 'CalcArea'클래스의 Sub class다.
	// 방법 1.
	double width;
	double height;
		
	public Triangle(double width, double height) {		// Triangle 클래스의 생성자.
		this.shape = "삼각형";
		this.width = width;
		this.height = height;
		this.area = this.width * this.height / 2;
	}
	
	public void calcSize() {
		this.area = this.width * this.height / 2;
	}
	
	// (방법 1. 해설) 여기는 부모클래스에서 가져온 이녀석들이 있는거다. 이렇게 주석으로 오려다 붙여 넣고 보면 Sub 클래스를 이해하는데 도움이 된다.
//	String shape;
//	double area;
//	
//	public void printArea() { 
//		this.calcSize();	// t1.printArea()를 명령했는데 이 부분이 없으면 this.area는 calcSize()의 계산식을 수행하지 않는다.
//		System.out.println(this.shape);
//		System.out.println("면적 : " + this.area);
//	}
	
	// 방법 2. 만약 calcSize() 메소드를 없애고, printArea() 메소드에 this.calcSize()를 없애고 싶다면 이렇게 하면 된다. 
//	double width;
//	double height;
//	
//	public Triangle(double width, double height) {		// Triangle 클래스의 생성자.
//		this.shape = "삼각형";
//		this.width = width;
//		this.height = height;
//		this.area = this.width * this.height / 2;
//	}
}
