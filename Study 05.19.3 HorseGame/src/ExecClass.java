
public class ExecClass {
	public static void main(String[] args) {
		// 1.
		class GameManager{		// 다른 곳에서는 사용 못 하고 오직 이 메소드 내에서만 사용할 수 있는 클래스. 클래스 파일을 하나 더 만들고 빼도 된다.
			public boolean doGame(Horse[] horse) {
				boolean isEnd = true;	// Horse의 isEnd와 다른 isEnd다. 이 위치에 선언하고 각 말의 객체의 isEnd와 비교해야 모든 말이 완주할 수 있고 return을 돌려보낼 수 있다.
				for (int i = 0; i < horse.length; i++) {	// Horse 객체를 0번부터 n번까지 달리게 만드는 반복문
					horse[i].runHorse();
					isEnd = isEnd && horse[i].isEnd; // doGame에서 true로 놓은 게임
				}
				return isEnd;
			}
		}
		// Horse 객체 생성
		Horse[] horse = {new Horse("흑마"), new Horse("적토마")};
		
		// GameManager 메모리에 할당
		GameManager gameManager = new GameManager();
		
		// 턴을 증가시키는 반복문
		for (int i = 0; i < 99999; i++) {
			boolean isEnd = gameManager.doGame(horse);
			System.out.println("---------------------------------");
			if (isEnd) {
				break;
			}
		}
		
		
	}
}
