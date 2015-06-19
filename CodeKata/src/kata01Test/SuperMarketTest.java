package kata01Test;

import static org.junit.Assert.*;
import junit.framework.Assert;
import kata01.CounterItemImpl;
import kata01.Item;
import kata01.ItemImpl;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SuperMarketTest {

	Item apple = ItemImpl.of("Apple", 40, 5);
	Item bread = ItemImpl.of("Bread", 125, 1);
	Item cheese = CounterItemImpl.of("Cheese", 1.99, 100);
	Item drink = ItemImpl.of("Drink", 70, 3);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testItems() {
		assertNotNull(apple);
		assertNotNull(bread);
		assertNotNull(cheese);
		assertNotNull(drink);
		
	}

	@Test
	
	@After
	public void tearDown() throws Exception {
		
	}
}
