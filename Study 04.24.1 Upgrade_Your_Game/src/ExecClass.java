import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
		Player[] group1 = new Player[3];
		Player[] group2 = new Player[3];
		
		group1[0] = new GoGilDong();
		group1[1] = new GoGilDong();
		group1[2] = new GoGilDong();
		group2[0] = new Hong();
		group2[1] = new Hong();
		group2[2] = new Hong();
		
		GameManager gameManager = new GameManager(group1, group2);
		gameManager.play();
	}
}
