
public class Main {
	
	public static void main(String[] args) {
		GameCharacter character = new GameCharacter();
		
		character.attack();	// 무기 할당 전
		
		character.setWeapon(new Knife());
		character.attack();	// Knife 할당
		
		character.setWeapon(new Sword());
		character.attack();	// Sword 할당
		
		character.setWeapon(new Ax());
		character.attack();	// Ax 할당
		
	}
}
