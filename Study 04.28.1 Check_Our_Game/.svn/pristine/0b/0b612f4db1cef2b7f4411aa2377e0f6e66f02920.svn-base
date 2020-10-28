// * player에 damage 변수가 필요합니다.
// * damage변수를 통해 제 캐릭터가 공격을 받을 시 입력된 값으로 공격을 주고 받는게 가능합니다.
//   캐릭효과
//1. 공격 받을 시 상대 데미지와 HP가 내 케릭보다 높으면 밸런스를 조정. 
//2. 액티브 케릭 HP량에 따라서 회피율이 증가함
//   동작스킬
//1. 기본적으로 스킬에는 1 버프 2 공격 3 턴 종료
//2. 버프에는 1 힐 2 방업 3 공업, 공격에는 1 공격디버프 2 치명타 3 흡혈
//		1 힐 은 hp가 30%미만이 되면 66%확률적으로 전체 체력 회복되고 아닌 경우 랜덤으로 상승
//		2 방업 은 hp량에 따라서 방어가 랜덤 상승, 방어가 있을 시 체력대신 깎임
//		3 공업 은 데미지량에 랜덤으로 상승
		
//		1 공격디버프 상대 데미지량을 랜덤으로 감소
//		2 치명타 상대에게 내 데미지의 2배를 공격
//		3 흡혈 상대에게 피해를 주고 피해량 만큼 회복 (75%확률로 발동)


import java.util.Random;
import java.util.Scanner;

public class HO extends Player{
	Scanner s = new Scanner(System.in);
	Random r = new Random();
	
	int defence;
	int save_hp;
	int count;
	int damage;
	int tmp ;

	HO(){
		this.name = "HORANG";
		this.hp = 100;
		this.damage = 10;
		this.defence = 0;	
		this.save_hp = 100;
			
	}	
	
	public void underAttack(Player attacker) {
		super.underAttack(attacker);
		
		int damage = 10;
		if (attacker.name.equals("HORANG")) {
			damage = ((HO)attacker).damage;
		}
		
		if ((this.save_hp < attacker.hp && this.damage < damage) || damage > save_hp) {
			this.hp = this.hp + attacker.hp;
			this.save_hp = attacker.hp;
			this.damage = (int)((double)attacker.hp / 2); // 상대 데미지를 내 데미지로 만듦
			damage = (int)((double)attacker.hp / 2);
			System.out.println("<상대가 "+ this.name + "의 HP와 데미지 보다 쎄므로 상대의 HP와 데미지를 조정했습니다>");
			System.out.println(this.name+ " HP : "+ this.hp + " 데미지 : " + this.damage );
			System.out.println(attacker.name+ " HP : "+ attacker.hp + " 데미지 : " + damage );
		}
		else if (this.save_hp > attacker.hp ) {
			attacker.hp = this.save_hp;
			System.out.println("밸런스 조정! " + this.name + " HP : "+ this.hp + " "+
								attacker.name + " HP : " + attacker.hp);
		}
		
		System.out.println(this.name+"의 HP : " + this.hp + " 방어력 : " + this.defence);
						
		this.miss(this.save_hp, attacker);
				
		this.count  = this.count +1 ;
//	
		this.skill(attacker);
		
	}
	
	public void skill(Player attacker) {
		if (this.isLive) { 
			for (int i = 0; i < 100; i++) { // 잘못눌렀을떄를 방지
				System.out.println(this.name + "의 차례입니다! 선택해주세요. 1.버프 2.공격 3.턴 종료");
				int inputMenu = s.nextInt();			
				
				if (inputMenu == 1) {
					this.buff(attacker);
					break;					
				}
				else if (inputMenu == 2) {
					this.attack(attacker);
					break;
				}
				else if (inputMenu == 3) {
					break;
				}
				else {
					System.out.println("다시 눌러 주세요");
				}
			}			
		}
		else if (this.hp == 0 && (this.damage < damage) && (attacker.hp > this.save_hp)) {
			this.hp = this.hp + this.save_hp;
			System.out.println("<강제 밸런스> ");
			attacker.hp = this.hp;
		    damage = (int)((double)this.hp / 2);
			this.isLive = true;
			for (int i = 0; i < 100; i++) { // 잘못눌렀을떄를 방지
				System.out.println(this.name + "의 차례입니다! 선택해주세요. 1.버프 2.공격 3.턴 종료");
				int inputMenu = s.nextInt();			
				
				if (inputMenu == 1) {
					this.buff(attacker);
					break;					
				}
				else if (inputMenu == 2) {
					this.attack(attacker);
					break;
				}
				else if (inputMenu == 3) {
					break;
				}
				else {
					System.out.println("다시 눌러 주세요");
				}
			}			
		}
	
	}
	
	public void buff(Player attacker) {
		for (int i = 0; i < 100; i++) { // 잘못누름을 방지
			System.out.println("1.힐 2.방어업 3.공격업 ");
			int inputSelect = s.nextInt();
			if (inputSelect == 1) {
				System.out.println(this.buff_heal(attacker));
				break;
			}
			else if (inputSelect == 2) {
				System.out.println(this.buff_defence(attacker));
				break;
			}
			else if(inputSelect == 3) {
				System.out.println(this.buff_attack(attacker));
				break;				
			}
			else{
				System.out.println("다시 입력해주세요!!");
				break;
			}			
		}
	}
	
	public void attack(Player attacker) {
		for (int i = 0; i < 100; i++) { // 잘못누름을 방지
			System.out.println("1.공격디버프 2.치명타 3.흡혈 ");
			int inputSelect = s.nextInt();
			if (inputSelect == 1) {
				System.out.println(this.attack_debuff(attacker));
				break;
			}
			else if (inputSelect == 2) {
				System.out.println(this.attack_critical(attacker));
				break;
			}
			else if(inputSelect == 3) {
				System.out.println(this.attack_allAttack(attacker));
				break;				
			}
			else{
				System.out.println("다시 입력해주세요!!");
				break;
			}			
		}		
	}
	
	public String buff_heal(Player attacker) {		
		int healRate = r.nextInt(50); // 현재 체력에 ..%를  회복
		int tmp_heal = (int)(this.hp * (healRate + 1) / 100);
		int per20 = (int)(((double)this.hp) / (this.save_hp) * 100) ; 
		int hpUP = this.hp + tmp_heal;
//		System.out.println(tmp_heal+" "+per20);
		if (hpUP > this.save_hp) {
			this.hp = this.save_hp;
			
			return this.name + "의 체력에 "+ (healRate+1) +"% 회복했습니다. 현재 HP : " + this.hp;
		}		
		else {
			if ((per20 < 30)&& (r.nextInt(3) == 1) || r.nextInt(3)== 2)  {
				this.hp = this.save_hp;
				return "체력 30% 미만.. 60% 확률로 전체 회복!" + "HP : " + this.hp;
			}
			this.hp = hpUP;
			
			return this.name + "의 체력에 "+ (healRate+1) +"% 회복했습니다. 현재 HP : " + this.hp;
		}
		
		
		 
	}
	
	public String buff_defence(Player attacker) { // 현재 체력에 0~30%를 방어업
		int defenceRate = r.nextInt(30);		
		this.defence = this.defence + (int)this.hp * (defenceRate + 1) / 100;
		
		return this.name + "의 방어력이 증가했습니다. 방어력 증가" + this.defence;
	}	
	
	public String buff_attack(Player attacker) { // 현재 체력에 0~30%를 방어업
		int attackRate = r.nextInt(90);		
		this.damage = this.damage + (int)this.damage * (attackRate + 1) / 100;
		
		return this.name + "의 공격력이 증가했습니다. 공격력 증가 " + this.damage;
	}
	
	public String attack_debuff(Player attacker) {
		int damage = 10;
		if (attacker.name.equals("HORANG")) {
			damage = ((HO)attacker).damage;
		}
		
		int deBuffRate = r.nextInt(50);
		int tmp_deBuff = (int)damage  * (deBuffRate + 1) / 100;
		if (tmp_deBuff == 0) {
			System.out.println("효과가 발동하지 않았습니다");
		}
		else {
			damage = damage - tmp_deBuff;
			if (damage < 0) {
				damage = 0;
			}
			System.out.println("디버프 발동");
		}		
		return attacker.name + "의 데미지 : "+ damage;
	}
	
	public String attack_critical(Player attacker) {
		int criticalRate = r.nextInt(50);
		if(r.nextInt(4) == 1 || r.nextInt(4) == 2 || r.nextInt(4) == 3) {
			System.out.println("치명타 발동");			
			attacker.hp = attacker.hp - this.damage  * 2;
			
			return this.name + "의 치명타 공격 " + (this.damage *2) + " " +attacker.name +"의 체력 : " + attacker.hp;
		}else {
			System.out.println("치명타 발동 x");
			attacker.hp = attacker.hp - this.damage;
			
			return this.name + "의 데미지 " + this.damage + " " +attacker.name +"의 체력 : " + attacker.hp;
		}		
	}
	public String attack_allAttack(Player attacker) {
		
		if(r.nextInt(4) == 1 || r.nextInt(4) == 2 || r.nextInt(4) == 3) {
			
			System.out.println("흡혈 발동");	
			attacker.hp = attacker.hp - (int)(this.damage * 1.5);
			this.hp = this.hp + (int)(this.damage * 1.5);
			
			return this.name + "의 흡혈 " + " " + 
					attacker.name +"의 체력 : " + attacker.hp +
					" "+this.name + "의 체력 : " + this.hp
					;
		}else {
			System.out.println("흡혈 x");
			attacker.hp = attacker.hp - this.damage;
			
			return this.name + "의 데미지 " + this.damage + " " +attacker.name +"의 체력 : " + attacker.hp;
		}		
	}
	
	public void checkDefence(int tmp,Player attacker) {
		if (tmp > 0) {
					
			this.defence = tmp;		
			System.out.println(this.name + "은(는) " + damage + "의 피해를 입었습니다.");
			System.out.println("방어력 : " + this.defence + " HP : "+ this.hp);
					
		}
		else if (tmp < 0) {
			this.defence = 0;
			this.hp = this.hp + tmp;
			System.out.println(this.name + "은(는) " + damage + "의 피해를 입었습니다.");
			this.checkHp();
			System.out.println("방어력 : " + this.defence + " HP : "+ this.hp);
		}
	}
	public void miss(int tmp_hp, Player attacker) {
		if (this.hp < tmp_hp ) {
			int miss = (int)(((double)this.hp) / (this.save_hp) * 100) ; 
			
			if ((miss >= 80) && r.nextInt(10) == 1) {
				
				System.out.println(attacker.name + "의 공격을 피했습니다.");
			}
			else if ((miss >= 50) && (miss < 80)&& r.nextInt(3) == 1) {
				
				System.out.println(attacker.name + "의 공격을 피했습니다.");
			}
			else if ((miss >= 30) && (miss < 50)&& r.nextInt(2) == 1) {
				
				System.out.println(attacker.name + "의 공격을 피했습니다.");
			}
			else if ((miss > 0)&& (miss < 30) && (r.nextInt(4) == 1 || r.nextInt(4) == 2 || r.nextInt(4) == 3)) {
				
				System.out.println(attacker.name + "의 공격을 피했습니다.");
			}
			else {
				this.tmp = this.defence - damage;
				this.checkDefence(this.tmp, attacker);
			}	
		}
		else {
			this.tmp = this.defence - damage;
			this.checkDefence(this.tmp, attacker);
		}
	}
	
	@Override
	public void checkHp() {
		if(this.hp < 1 ) {
			this.hp = 0;
			this.isLive = false;
		}
	}
	
	
	
	
}
