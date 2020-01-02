package com.connection.dp;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String string) {
//		System.out.println("디코드 | decode");
		System.out.println("강화된 디코드 | hard decode");	// 유지보수로 변경 된 모습
		return string;
	}

	@Override
	protected boolean authentication(String id, String Password) {
		System.out.println("아이디/비밀번호 확인 | Check ID/PWD");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("권한 확인 | check Auth");
		// 서버에서 유저 나이 조회하는 권한 확인 알고리즘을 추가 할 수 있다.
		// 나이를 확인 하여 10시 이후 게임 불가하게 변경 가능.
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("마지막 접속 단계 | doConnection");
		return info;
	}

}
