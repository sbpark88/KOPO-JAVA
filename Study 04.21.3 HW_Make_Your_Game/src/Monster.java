
public abstract class Monster {
	String mobName[] = {"루나틱","픽키","콘도르","카라멜","코코","쵸코","프릴도라","키메라","크램프","프리저"};
	int hp;
	int recovery;
	int blending;
	boolean isLive = true;
	int damage;
	
	public String toString() {
		System.out.print(" HP: " + this.hp + " / ");
		return "";
	}
	
	public abstract int attack();
	
	public abstract void checkHP();
	
	// 아래 public int skill()과 비교해보자.
	public abstract void recoveryHP();
	
	// public abstract skill()로 바꿀 경우 CommobMob 클래스에서 skill 메소드를 사용하지 않더라도 구현해줘야한다. 
	public int skill() {
		return 0;
	}
	

}
