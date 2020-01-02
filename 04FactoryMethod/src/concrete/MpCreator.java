package concrete;

import java.util.Date;

import framework.Item;
import framework.ItemCreator;

public class MpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("������ ���̽����� ���� ȸ�� ������ ������ �����ɴϴ�. | get MP Info from DB");
	}

	@Override
	protected void createItemLog() {
		System.out.println("���� ȸ�� ������ ���� ���� �߽��ϴ�. | new MP potion" + new Date());
	}

	@Override
	protected Item createItem() {
		// �۾�
		return new MpPotion();
	}

}
