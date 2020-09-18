
public class ExecClass {
	public static void main(String[] args) {
////		Object 형변환에 대한 설명
//		People p1 = new People();
//		People p3 = new People("둘리", 30);
//		
//		Object o1 = (Object)p1;
//		System.out.println(p1.name);
//		System.out.println(o1);
//		System.out.println(p3.toString());
//		
//		o1.toString();
////		o1.namer 사용 불가능. Object로 형변환 된 o1에는 name이란 변수가 없다. 값만 가지고 있다.
//		((People)o1).name = "123";	// 다시 People로 형변환 하면 가능. People에는 name이란 변수가 있으니까.
		
		Student[] student = new Student[3];
		
		student[0] = new Student("고길동", 50, 20, 30, 30);
		student[1] = new Student("둘리", 10000, 10, 40, 10);
		student[2] = new Student("또치", 10, 100, 50, 80);
		
		Teacher t1 = new Teacher("희동이", 5, "호이", student);
		t1.printStudent();
		
	}

}
