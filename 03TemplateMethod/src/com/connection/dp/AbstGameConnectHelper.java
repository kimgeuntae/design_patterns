package com.connection.dp;

public abstract class AbstGameConnectHelper {

	protected abstract String doSecurity(String string);	// 복호화 과정
	protected abstract boolean authentication(String id, String Password);	// 인증 과정
	protected abstract int authorization(String userName);	// 권한 과정
	protected abstract String connection(String info);		// 접속 과정
	
	// Template Method
	public String requestConnection(String encodedInfo) {
		
		// 보안 과정 - 암호화 된 문자열을 복호화
		String decodedInfo = doSecurity(encodedInfo);
		
		// 복호화가 됐다고 가정하고 반환된 것을 가지고 아이디, 암호를 할당 한다.
		String id = "kkk";
		String Password = "123";
		
		if(!authentication(id, Password)) {
			throw new Error("아이디/패스워드 불일치");
		}
			
		
		String userName = "";
		int i = authorization(userName);
		
		switch (i) {
		case -1:
			throw new Error("셧다운");
		case 0:	// 게임 매니저 | GM
			
			break;
		case 1:	// 유료 회원
			
			break;
		case 2:	// 무료 회원
			
			break;
		case 3:	// 권한 없음
			
			break;	// 기타 상황

		default:
			break;
		}
		
		return connection(decodedInfo);
		
	}
}
