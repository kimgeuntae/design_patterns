
public class Main {
	
	public static void main(String[] args) {
		GameCharacter character = new GameCharacter();
		
		character.attack();	// ���� �Ҵ� ��
		
		character.setWeapon(new Knife());
		character.attack();	// Knife �Ҵ�
		
		character.setWeapon(new Sword());
		character.attack();	// Sword �Ҵ�
		
		character.setWeapon(new Ax());
		character.attack();	// Ax �Ҵ�
		
	}
}
