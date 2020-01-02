
public class GameCharacter {

	// 접근점
	private Weapon weapon;
	
	// 교환 가능
	public void setWeapon(Weapon weapon) {
		System.out.println(this.weapon);
		this.weapon = weapon;
	}
	
	public void attack() {
		
		if(weapon == null) {
			System.out.println("맨손 공격 | hand attack");
		}else {
			//델리게이트
			weapon.attack();
		}
	}
	
}
