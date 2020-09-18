import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest {
	public void doAction() {
		System.out.println("Array 배열");
//		int[] arr = new int[5];
//		arr[0] = 7;
		int[] arr = {7,9,14,16,31};
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr[2] : " + arr[2]);
		
		System.out.println("\n ArrayList 리스트");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(7);
		al.add(9);
		al.add(14);
		al.add(16);
		al.add(31);
		
		System.out.println("al : " + al);
		System.out.println("al.equals(14) : " + al.equals(14) + "   <- equals로는 값의 비교가 되지 않는다.");
		System.out.println("al.indexOf(2) : " + al.indexOf(2));		// 2가 없기 때문에 -1(false)를 반환.
		System.out.println("al.indexOf(14) : " + al.indexOf(14));	// 14가 있기 때문에 14의 인덱스 2를 반환.
		System.out.println("al.size()) : " + al.size());
		al.add(14);
		System.out.println("al.size()) : " + al.size() + " 중복 허용 O [7, 16, 14, 31, 9] 이 입력된 상태에서 al.add(16)을 한 번 더 하였더니 추가.");
		
		System.out.println("\n LinkedList 리스트");
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(7);
		ll.add(9);
		ll.add(14);
		ll.add(16);
		ll.add(31);
		
		System.out.println("ll : " + ll);
	}

}
