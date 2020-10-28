import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class QueueTest {
	public void doAction() {
		
		// Queue (선입 선출)			데이터 넣기->(Stack)			(Stack)->데이터 꺼내기
		Queue<Integer> qq = new Queue<Integer>() {	// Queue는 Abstract 메소드라 미구현 메소드를 모두
			
			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Iterator<Integer> iterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean addAll(Collection<? extends Integer> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Integer remove() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Integer poll() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Integer peek() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean offer(Integer e) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Integer element() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean add(Integer e) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		

		qq.add(10);
		qq.add(20);
		qq.add(30);
		qq.add(40);
		System.out.println(qq);
		System.out.println(qq.peek());		// 가장 앞의 10을 조회만 한다. Queue에는 (40, 30, 20, 10)->(넣는 방향) 이 들어있음.
		System.out.println(qq.poll());		// 가장 앞의 10을 꺼낸다. Queue에는 (40, 30, 20)->(넣는 방향) 이 들어있음.
		System.out.println(qq.poll());		// 그 다음으로 들어간 20을 꺼낸다. Queue에는 (40, 30)->(넣는 방향) 이 들어있음.
		
	}

}
