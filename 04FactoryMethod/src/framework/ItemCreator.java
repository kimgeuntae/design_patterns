package framework;

public abstract class ItemCreator {
	
	// Factory Method Pattern -> Template Method
	public Item create() {
		
		Item item;
		
		// step 1
		requestItemsInfo();
		// step 2
		item = createItem();
		// step 3
		createItemLog();
		// step 1, 2, 3 �� ������ ����� TemplateMethod pattern �� ����.
		
		return item;
	}
	
	// �������� �����ϱ� ���� ������ ���̽����� ������ ������ ��û�մϴ�.
	abstract protected void requestItemsInfo();
	
	// �������� ���� �� ������ ���� ���� �ҹ��� �����ϱ� ���� ������ ���̽��� ������ ���� ������ ����ϴ�.
	abstract protected void createItemLog();
	
	// �������� �����ϴ� �˰���
	abstract protected Item createItem();
	
	
}
