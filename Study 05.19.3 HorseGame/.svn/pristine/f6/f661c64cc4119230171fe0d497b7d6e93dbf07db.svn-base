import java.util.Random;

public class Horse {
	String name;
	int distance;
	boolean isEnd = false;
	static int rank = 0;
	
	Horse(String name) {
		this.name = name;
	}
	public void runHorse() {
		if (!this.isEnd) {
			this.distance = this.distance + (int)Math.floor(Math.random() * 100);	// 매 턴마다 0~100 사이의 정수의를 달린 거리로 랜덤 누적.
			System.out.println(this.name + " : " + this.distance);
			this.checkEnd();	// 달린 누적 거리가 1000 이상이면 해당 객체의 isEnd를 True로 바꿔주는 메소드를 매번 체크 (게임에서 isLive 체크와 동일)
		}
	}
	public void checkEnd() {
		if (distance >= 1000) {
			isEnd = true;
			Horse.rank++;
			System.out.println(this.name + " is goal" + " rank" + Horse.rank);
		}
	}
	
	public void run() {
		Random r = new Random();
		for (int i = 0; i < 99999; i++) {
			this.runHorse();
			if (this.isEnd) {
				break;
			}
			int sleepTime = r.nextInt(10) * 1000 + 300;
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {}
		}
	}
}
