package kata01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Checkout {

	public static void main(String[] args) {
		
		Item apple = ItemImpl.of("Apple", 40, 1);
		Item bread = ItemImpl.of("Bread", 125, 1);
		Item cheese = CounterItemImpl.of("Cheese", 1.99, 100);
		Item drink = ItemImpl.of("Drink", 70, 1);
		
		List<Item> trolley = new ArrayList<>();
		trolley.add(apple);
		trolley.add(bread);
		trolley.add(cheese);
		trolley.add(drink);
		
		double sub = trolley.stream().mapToDouble((x) -> x.getTotal()).sum();
		System.out.println(sub);
	}
}