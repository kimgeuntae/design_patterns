
public class SystemSpeaker {
	
	static private SystemSpeaker instantce;
	private int volume;
	
	private SystemSpeaker() {
		volume = 5;
	}
	
	public static SystemSpeaker getInstantce() {
		
		if(instantce == null) {
			
			// 시스템 스피커 접속 작업
			instantce = new SystemSpeaker();
			System.out.println("새로 생성 | new Create ");
		}else {
			System.out.println("이미 생성 | already Created ");
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
