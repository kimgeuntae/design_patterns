
public class SystemSpeaker {
	
	static private SystemSpeaker instantce;
	private int volume;
	
	private SystemSpeaker() {
		volume = 5;
	}
	
	public static SystemSpeaker getInstantce() {
		
		if(instantce == null) {
			
			// �ý��� ����Ŀ ���� �۾�
			instantce = new SystemSpeaker();
			System.out.println("���� ���� | new Create ");
		}else {
			System.out.println("�̹� ���� | already Created ");
		}
		
		return instantce;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}
