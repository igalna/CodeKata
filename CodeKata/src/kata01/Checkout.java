package kata01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Checkout {

	public static void main(String[] args) {
		
		Item apple = ItemImpl.of("Apple", 40, 3);
		Item bread = ItemImpl.of("Bread", 125, 1);
		Item cheese = CounterItemImpl.of("Cheese", 1.99, 100);
		Item drink = ItemImpl.of("Drink", 70, 3);
		
		Trolley trolley = Trolley.of();
		trolley.add(apple);
		trolley.add(bread);
		trolley.add(cheese);
		
		System.out.println(trolley.getTotal());
		
		trolley.add(drink);
		System.out.println(trolley.getTotal());
	}
}