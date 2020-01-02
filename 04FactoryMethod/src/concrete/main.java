package concrete;

import framework.Item;
import framework.ItemCreator;

public class main {
	public static void main(String[] args) {
		ItemCreator creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create();
		
		item.use();

		creator = new MpCreator();
		item = creator.create();
		
		item.use();
		
	}
}
