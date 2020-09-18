import java.util.ArrayList;
import java.util.Comparator;

public class ExecClass {
	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(new Student("홍길동",100));
		arr.add(new Student("둘리",10));
		arr.add(new Student("또치",80));
		arr.add(new Student("희동이",50));
		
		// 정렬 이전의 값을 확인하기 위한 출력 부분.
		for (int i = 0; i < arr.size(); i++) {		// 배열과 비슷하나 length가 아닌 size로 접근.
			System.out.println(arr.get(i).name + " : " + arr.get(i).score);		// get(i)로 접근.
		}
		
		System.out.println("--------------------------------------------");
		
		
		// 1. 여기서 바로 구현하자.
//		arr.sort(new Comparator<Student>() {	// generic으로 데이터 타입을 Student로 잡아준다.
//
//			@Override
//			public int compare(Student o1, Student o2) {	// 비교할 대상을 넣는다. Student 클래스 데이터 타입의 객체1(o1), 객체2(o2).
//				// TODO Auto-generated method stub
//				// return에다 내가 정렬하고 싶은 데이터 기준과 오름차순, 내림차순을 구현한다.
//				return o1.score - o2.score;				// score를 기준으로 오름차순 정렬. (10 -> 50 -> 80 -> 100)
//				return o2.score - o1.score;				// score를 기준으로 내림차순 정렬. (100 -> 80 -> 50 -> 10)
//				return o1.name.compareTo(o2.name);		// name을 기준으로 오름차순 정렬. (둘리 -> 또치 -> 홍길동 -> 희동이)
//				return o2.name.compareTo(o1.name);		// name을 기준으로 오름차순 정렬. (희동이 -> 홍길동 -> 또치 -> 둘리)
//				
//				if (o1.name.equals("또치")) {	 // 또치가 나오면 젤 앞으로 보내. (나머지는 그대로)
//					return -1;		// 내림차순.
//				}
//				return 0;
//		
//				if (o1.name.equals("또치")) {	 // 또치가 나오면 젤 아래로 보내. (나머지는 그대로)
//					return 1;		// 오름차순.
//				}
//				return 0;
//		
//	
//
//			}
//			
//		});
		
		// 2. StudentCompare를 만들어 따로 분리하자.
		StudentCompare sc = new StudentCompare();
		arr.sort(sc);
		
		
		
		
		// 정렬을 확인하기 위한 출력 부분.
		System.out.println("정렬된 결과는");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i).name + " : " + arr.get(i).score);
		}

				
	}

}
