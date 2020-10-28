import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {
	public void doAction( ) {
		System.out.println("HashSet");
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(7);
		hs.add(16);
		hs.add(14);
		hs.add(31);
		hs.add(9);
		
		System.out.println("hs : " + hs + " 무작위로 담는다.");
		System.out.println("hs.equals(14) : " + hs.equals(14) + "   <- equals로는 값의 비교가 되지 않는다.");		
		System.out.println("Set에는 .indexOf()가 존재하지 않는다.");
		hs.add(16);
		System.out.println("hs.size() : " + hs.size() + " 중복 허용 X [7, 16, 14, 31, 9] 이 입력된 상태에서 hs.add(16)을 한 번 더 하였으나 추가되지 않음.");
		
		System.out.println("\n LinkedHashSet");
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(7);
		lhs.add(16);
		lhs.add(14);
		lhs.add(31);
		lhs.add(9);
		
		System.out.println("lhs : " + lhs + " 입력된 순서대로 담는다.");
		
		System.out.println("\n TreeSet");
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(7);
		ts.add(16);
		ts.add(14);
		ts.add(31);
		ts.add(9);
		
		System.out.println("ts : " + ts + " 값을 정렬해서 담는다.");
	
		
		// Set to Array
		System.out.println("\n Set to Array");
		Object[] o1 = hs.toArray();
		System.out.println(Arrays.toString(o1));
		
	}

}