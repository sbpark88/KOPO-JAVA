
public class ExecClass {
	public static void main(String[] args) {
		try {
			Test1 test1 = new Test1();
			test1.doAction();
		} catch (Exception e) {
			if (e.getMessage().equals("input 1")) {
				System.out.println("사용자가 1을 입력했습니다.");
			}
		}
	}

}
