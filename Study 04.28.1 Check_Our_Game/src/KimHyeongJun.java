//import java.util.Random;
//import java.util.Scanner;
//
//public class KimHyeongJun extends Player{
//	public KimHyeongJun() {
//		this.name = "김형준";
//		this.hp = 70;
//	}
//	
//	//1. 공격할 대상 선택
//	//2. 사용할 스킬 선택 : doAttack, doMagic, doHeal
//	
//	@Override
//	public void underAttack(Player attacker) {
//		super.underAttack(attacker);
//		//일반공격 성공률: 80%
//		if (!this.isMiss(20)) {
//			System.out.println(attacker.name + "의 공격이 빗나갔습니다.");
//		} else {
//			this.hp = this.hp - 20;
//			System.out.println(this.name + "은(는) 10의 피해를 입었습니다. 남은 hp: " + this.hp);
//		}
//		this.checkHp();
//	}
//	
//	public void underMagic(Player attacker) {
//		super.underMagic(attacker);
//		//마법공격 성공률: 70%
//		if (!this.isMiss(30)) {
//			System.out.println(attacker.name + "의 마법이 빗나갔습니다.");
//		} else {
//			//상대 전체에 3의 마법 데미지
//			this.hp = this.hp - 14;
//			System.out.println(this.name + "은(는) 3의 피해를 입었습니다. 남은 hp: " + this.hp);
//		}
//		this.checkHp();
//		
//	}
//	
//	@Override
//	public void underHeal(Player healer) {
//		super.underHeal(healer);
//		//힐 성공률: 50%
//		if (!this.isMiss(50)) {
//			System.out.println(healer.name + "의 치료가 실패했습니다.");
//		} else {
//			//5 치료
//			this.hp = this.hp + 20;
//			System.out.println(this.name + "은 hp 10을 회복했습니다. 남은 hp: " + this.hp);
//		}
//	}
//	
//	
//	//일반 공격 성공률: 80%, 전체 마법공격 성공률: 30%, 전체 힐 성공률: 50% 
//	public boolean isMiss(int accuracy) {
//		Random r = new Random();
//		if (r.nextInt(100) >= accuracy) {
//			return true;
//		}
//		return false;
//	}
//}