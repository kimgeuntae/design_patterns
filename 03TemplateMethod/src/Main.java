import com.connection.dp.AbstGameConnectHelper;
import com.connection.dp.DefaultGameConnectHelper;

public class Main {
	
	public static void main(String[] args) {
		
		AbstGameConnectHelper helper = new DefaultGameConnectHelper();
		
		helper.requestConnection("���̵� ��ȣ �� ���� ����");
	}
}
