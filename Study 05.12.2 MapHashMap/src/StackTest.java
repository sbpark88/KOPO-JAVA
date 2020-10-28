import java.util.Stack;

public class StackTest {
	public void doAction() {

//		// Stack (선입 후출)			데이터 넣기->(Stack)			데이터 꺼내기<-(Stack)
		Stack<Integer> st = new Stack();
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		System.out.println(st);
		System.out.println("st.peek() : " + st.peek());		// 가장 뒤의 40을 조회만 한다. Stack에는 (40, 30, 20, 10)->(넣는 방향) 이 들어있음.
		System.out.println(st + "   <- st.peek()");
		System.out.println("st.pop() : " + st.pop());		// 가장 뒤의 40을 꺼낸다. Stack에는 (30, 20, 10)->(넣는 방향) 이 들어있음.
		System.out.println(st + "   <- st.pop()");
		System.out.println("st.pop() : " + st.pop());		// 그 다음 가장 앞의 30을 꺼낸다.  Stack에는 (20, 10)->(넣는 방향) 이 들어있음.
		System.out.println(st + "   <- st.pop()");
	}

}
