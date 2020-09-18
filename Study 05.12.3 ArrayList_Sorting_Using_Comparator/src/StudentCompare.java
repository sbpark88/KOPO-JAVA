import java.util.Comparator;

public class StudentCompare implements Comparator {	// generic을 사용하지 않아 어떤 형태인지 모를 경우 Object 형태로만 사용이 가능하다. 그래서 형변환.

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		
//		return s1.score - s2.score;				// score를 기준으로 오름차순 정렬. (10 -> 50 -> 80 -> 100)
//		return s2.score - s1.score;				// score를 기준으로 내림차순 정렬. (100 -> 80 -> 50 -> 10)
//		return s1.name.compareTo(s2.name);		// name을 기준으로 오름차순 정렬. (둘리 -> 또치 -> 홍길동 -> 희동이)
//		return s2.name.compareTo(s1.name);		// name을 기준으로 오름차순 정렬. (희동이 -> 홍길동 -> 또치 -> 둘리)
		
//		if (s1.name.equals("또치")) {	 // 또치가 나오면 젤 앞으로 보내. (나머지는 그대로)
//			return -1;		// 내림차순.
//		}
//		return 0;
		
		if (s2.name.equals("또치")) {	 // 또치가 나오면 젤 아래로 보내. (나머지는 그대로)
			return -1;		// 오름차순.
		}
		return 0;
	
	}
}
