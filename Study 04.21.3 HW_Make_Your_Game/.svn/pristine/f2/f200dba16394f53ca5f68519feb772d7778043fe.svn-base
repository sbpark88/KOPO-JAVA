
public abstract class Player {
	String playerName;
	int hp;
	int recovery;
	int blending;
	boolean isLive = true;
	int damage;
	int saveskill;
	
	// abstract 클래스를 만든다고 
	public String toString() {
		System.out.print(" HP: " + this.hp);
		return "";
	}
	
	public abstract int attack();
	
	public abstract void checkHP();
	
	public abstract void recoveryHP();
	
	// abstract 메소드를 사용할 경우 반드시 그 클래스 역시 abstract 클래스로 만들어줘야한다.
	public abstract int skill();
	
	// abstract클래스라고 일반 메소드를 아예 못 쓰는게 아니다.
//	public int skill() {
//		return 0;		
//	}

}
