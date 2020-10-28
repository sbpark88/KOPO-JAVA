import java.util.Random;
import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		// Player 생성.
		Units[] player = new Units[2];
		player[0] = new Sorceress();
		player[1] = new Barbarian();
		
		int mobNum = r.nextInt(6);
		Units[] mob = new Units[mobNum];
		
		
		System.out.println(player[0] + "입니다.");
		System.out.println(mob[0] + "입니다.");
		
		
		GameManager gameManager = new GameManager(player, mob);
		gameManager.play();
		
		

	}

}
