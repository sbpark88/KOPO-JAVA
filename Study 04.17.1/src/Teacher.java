
public class Teacher extends People {
	String studyClass;
	
	@Override	// 나는 부모클래스에 있던 메소드를 재정의해서 쓰고 있는거 맞아! 하는것이다.
	public String toString() {	// @Override에 의해 public String toString2()로 이름을 바꾸면 에러가 발생한다. (부모 클래스에 public String toString2()라는 메소드가 없기 때문.)
								// 마찬가지로 public void toString()로 메소드 타입을 바꾸면 에러가 발생한다. (부모 클래스에 public void String toString()라는 메소드가 없기 때문.)
		System.out.println(this.name + "의 나이 " + this.age + " 가르치는 반 : " + this.studyClass);
		super.toString();	// super : 부모한테 가라.
		return "";
	}
	
	// 따라서 부모 클래스가 변경되었거나 내가 실수로 메소드 이름을 잘못 적을 경우 부모 클래스에 일치하는 메소드가 확인되지 않기 때문에,
	// 너 부모 클래스 재정의해서 쓰고 있는거 맞아?? 확인해봐! 하고 <디버깅을 도와준다!>
	// 만약 부모 클래스의 메소드명이 변경되었다면, 부모 클래스에 맞게 고쳐주거나, 부모 클래스와 다르게 새롭게 메소드를 만들려는거면
	// @Override를 지우고 메소드의 이름을 부모 클래스와 다르게 바꿔 상속되지 않는 Teacher 클래스만의 메소드로 새로운 메소드를 만들어 사용한다.
	
}
