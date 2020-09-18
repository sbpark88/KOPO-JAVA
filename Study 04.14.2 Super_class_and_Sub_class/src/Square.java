
public class Square {
	double width;
	double height;
	String shape;
	double area;
	
	public Square(double width, double height) {
		this.width = width;
		this.height= height;
		this.shape = "사각형";
	}
	
	public void calcSize() {
		this.area = this.width * this.height;
	}
	
	public void printSize() {
		this.calcSize();	// this. 안 붙여도 상관 없음.
		System.out.println(this.shape + "(" + this.width + " x " + this.height + ")" + " 면적 " + this.area);
	}

}
