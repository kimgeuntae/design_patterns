package com.connection.dp;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String string) {
//		System.out.println("���ڵ� | decode");
		System.out.println("��ȭ�� ���ڵ� | hard decode");	// ���������� ���� �� ���
		return string;
	}

	@Override
	protected boolean authentication(String id, String Password) {
		System.out.println("���̵�/��й�ȣ Ȯ�� | Check ID/PWD");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("���� Ȯ�� | check Auth");
		// �������� ���� ���� ��ȸ�ϴ� ���� Ȯ�� �˰����� �߰� �� �� �ִ�.
		// ���̸� Ȯ�� �Ͽ� 10�� ���� ���� �Ұ��ϰ� ���� ����.
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("������ ���� �ܰ� | doConnection");
		return info;
	}

}
