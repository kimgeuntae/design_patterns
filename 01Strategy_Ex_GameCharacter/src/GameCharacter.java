
public class GameCharacter {

	// ������
	private Weapon weapon;
	
	// ��ȯ ����
	public void setWeapon(Weapon weapon) {
		System.out.println(this.weapon);
		this.weapon = weapon;
	}
	
	public void attack() {
		
		if(weapon == null) {
			System.out.println("�Ǽ� ���� | hand attack");
		}else {
			//��������Ʈ
			weapon.attack();
		}
	}
	
}