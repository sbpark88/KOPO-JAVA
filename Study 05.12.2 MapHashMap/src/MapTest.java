import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTest {
	public void doAction() {
		System.out.println("HashMap");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("alpha", 7);
		hm.put("gamma", 14);
		hm.put("delta", 31);
		hm.put("beta", 16);
		hm.put("epsilon", 9);
		
		System.out.println("hm : " + hm + " 무작위로 담는다.");
		System.out.println("hm.equals(14) : " + hm.equals(14) + "   <- equals로는 값의 비교가 되지 않는다.");
		System.out.println("Map에는 .indexOf()가 존재하지 않는다.");
		System.out.println("hm.get(\"alpha\") : " + hm.get("alpha") + " Key로 Value를 조회.");
		System.out.println("hm.size() : " + hm.size());
		hm.put("alpha", 25);
		System.out.println("hm.size() : " + hm.size() + " Key 중복 허용 X {epsilon=9, alpha=7, delta=31, beta=16, gamma=14}이 입력된 상태에서 hm.put(\"alpha\", 25)를 한 번 더 하였으나 추가되지 않음.");
		hm.put("zeta", 14);
		System.out.println("hm.size() : " + hm.size() + " Value 중복 허용 O {epsilon=9, alpha=7, delta=31, beta=16, gamma=14}이 입력된 상태에서 hm.put(\"zeta\", 14)를 한 번 더 하였더니 추가.");
		
		System.out.println("\n LinkedHashMap");
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		lhm.put("alpha", 7);
		lhm.put("gamma", 14);
		lhm.put("delta", 31);
		lhm.put("beta", 16);
		lhm.put("epsilon", 9);
		System.out.println("hm : " + hm + " 입력된 순서대로 담는다.");
		
		System.out.println("\n TreeMap");
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("alpha", 7);
		tm.put("gamma", 14);
		tm.put("delta", 31);
		tm.put("beta", 16);
		tm.put("epsilon", 9);
		System.out.println("tm : " + tm + " Key로 정렬해서 담는다. (ABCD순)");

	}

}
