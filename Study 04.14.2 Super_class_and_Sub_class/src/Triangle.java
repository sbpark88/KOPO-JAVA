
public class Triangle extends Square {	//상속 : Square를 그대로 오려붙였다. 바꾸고 싶은 것만 덮어쓰기 한다고 생각하자!
	// 즉, 상속은 APFS 포맷에서의 복사와 같다!! (원본은 그대로 두고편집된 값만 따로 저장해서 파일 2개를 실제로 각각 있는 것처럼 사용하는 방식.)
	
	// Step 1. Triangle의 생성자를 설정하는 부분이다. 인풋 파라미터를 그대로 쓸거라는 뜻으로 super()를 넣어준다. 그 외에 것들은 바꾸고 싶은 것만 덮어쓰기 한다.
	public Triangle(double width, double height) {	// 이거는 자동완성 시키자.
		super(width, height);						// 이것도 자동완성 시키자.
		// TODO Auto-generated constructor stub
		this.shape = "삼각형";						// 바꾸고 싶은 것만 덮어쓰기!
	}

	// Step 2. Square 클래스를 상속하기 때문에 오려다 붙였다 생각하자. 그리고 수정할 것만 입력해주자.
	public void calcSize() {
		this.area = this.width * this.height / 2;		
	}
	
//	얘네는 눈에 보이진 않아도 Square를 오려다 붙인거라 있는거다. APFS 포맷에서의 복사 기능을 생각하자.
//	double width;
//	double height;
//	String shape;
//	double area;
//	public void printSize()와 
	
}
