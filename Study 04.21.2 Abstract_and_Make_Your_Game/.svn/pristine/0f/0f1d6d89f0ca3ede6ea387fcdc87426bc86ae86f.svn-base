import java.util.Random;
import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
		Enemy[] enemy = new Enemy[4];
		enemy[0] = new Enemy();
		enemy[1] = new Enemy("메기", 120);	// Super 클래스로 배열을 만들고 그 안에 Super 클래스로 초기화.
		enemy[2] = new Enemy2("잉어", 200);	// Super 클래스로 배열을 만들고 그 안에 Sub 클래스로 초기화.
		enemy[3] = new Enemy3("송사리", 50);
		
		
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		for (int i = 0; i < 99; i++) {
			System.out.println("턴 진행 (리턴 입력)");
			scanner.nextLine();
			
//			int enemyIndex = r.nextInt(4);
//			enemy[enemyIndex].underAttack();
			enemy[0].underAttack();
			enemy[1].underAttack();
			enemy[2].underAttack();
			enemy[3].underAttack();
			
			if (!enemy[0].isLive && !enemy[1].isLive && !enemy[2].isLive && !enemy[3].isLive) {
				break;
			}
			
			
		}
		
	
	}

}
