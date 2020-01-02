package com.connection.dp;

public abstract class AbstGameConnectHelper {

	protected abstract String doSecurity(String string);	// ��ȣȭ ����
	protected abstract boolean authentication(String id, String Password);	// ���� ����
	protected abstract int authorization(String userName);	// ���� ����
	protected abstract String connection(String info);		// ���� ����
	
	// Template Method
	public String requestConnection(String encodedInfo) {
		
		// ���� ���� - ��ȣȭ �� ���ڿ��� ��ȣȭ
		String decodedInfo = doSecurity(encodedInfo);
		
		// ��ȣȭ�� �ƴٰ� �����ϰ� ��ȯ�� ���� ������ ���̵�, ��ȣ�� �Ҵ� �Ѵ�.
		String id = "kkk";
		String Password = "123";
		
		if(!authentication(id, Password)) {
			throw new Error("���̵�/�н����� ����ġ");
		}
			
		
		String userName = "";
		int i = authorization(userName);
		
		switch (i) {
		case -1:
			throw new Error("�˴ٿ�");
		case 0:	// ���� �Ŵ��� | GM
			
			break;
		case 1:	// ���� ȸ��
			
			break;
		case 2:	// ���� ȸ��
			
			break;
		case 3:	// ���� ����
			
			break;	// ��Ÿ ��Ȳ

		default:
			break;
		}
		
		return connection(decodedInfo);
		
	}
}
