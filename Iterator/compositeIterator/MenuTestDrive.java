package iterator.compositeIterator;

public class MenuTestDrive
{
	public static void main(String args[])
	{
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");

		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
		allMenus.add(pancakeHouseMenu);  allMenus.add(dinerMenu);  allMenus.add(cafeMenu);

		pancakeHouseMenu.add(new MenuItem("Pancake", "Eggs and toast", 2.99));

		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}
}