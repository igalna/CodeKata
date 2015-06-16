package kata01;

public class Checkout {

	public static void main(String[] args) {
		
		Item apple = ItemImpl.of("Apple", 40, 5);
		Item bread = ItemImpl.of("Bread", 125, 1);
		Item cheese = CounterItemImpl.of("Cheese", 1.99, 100);
		Item drink = ItemImpl.of("Drink", 70, 3);
		
		Discount threeForOnePound = XforYPounds.of("Apple", 3, 1);
		
		Trolley trolley = Trolley.of();
		trolley.add(apple);
		trolley.add(bread);
		trolley.add(cheese);
		trolley.add(drink);
		
		System.out.println(trolley.getTotal());
		
		System.out.println(threeForOnePound.discount(trolley));
	}
}