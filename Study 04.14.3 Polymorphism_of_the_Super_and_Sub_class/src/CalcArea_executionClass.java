
public class CalcArea_executionClass {
	public static void main(String[] args) {
//		CalcArea a1 = new CalcArea();
//		a1.printArea();
		
//		Triangle t1 = new Triangle(23, 12);		// t1을 만들고 그 방에는 width=23, height=12를 생성자로 넣었다.
//		t1.printArea();							// t1 방에서 printArea()를 실행하라고 명령했다. main 메소드에서는 calcSize()는 명령하지 않았다. 이 부분에 주목해야한다.
//		System.out.println("");
//		
//		Square s1 = new Square(23, 11);
//		s1.printArea();
//		System.out.println("");
//		
//		Round r1 = new Round(13);
//		r1.printArea();		
//		System.out.println("");
		
		
		// Sub 클래스는 Super 클래스로 변수 생성이 가능하다!!
//		CalcArea t1 = new Triangle(23,12);
//		t1.printArea();
//		System.out.println("");
//		
//		CalcArea s1 = new Square(23, 11);
//		s1.printArea();
//		System.out.println("");
//		
//		CalcArea r1 = new Round(13);
//		r1.printArea();		
//		System.out.println("");
		
		
		// 따라서 Super 클래스의 이름으로 변수를 생성하면 이것들을 배열로 묶을 수 있다!! 다형성!!! 이렇게 배열로 묶으면 for문을 돌릴 수 있다.
		CalcArea[] ca = new CalcArea[3];
		
		ca[0] = new Triangle(23,12);
		ca[0].printArea();
		System.out.println("");
		
		ca[1] = new Square(23, 11);
		ca[1].printArea();
		System.out.println("");
		
		ca[2] = new Round(13);
		ca[2].printArea();		
		System.out.println("");
		
	}
	
}
