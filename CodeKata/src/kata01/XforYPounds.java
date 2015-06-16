package kata01;

import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class XforYPounds implements Discount {

	private String applyTo;
	private int x;
	private int y;
	
	@Override
	public double discount(Trolley trolley) {
		int quantity = trolley.getYourStuff().stream()
											 .filter((x) -> x.getName()
											 .equals(applyTo))
											 .limit(1)
											 .collect(Collectors.toList())
											 .get(0)
											 .getQuantity();
		
		double price = trolley.getYourStuff().stream()
							  .filter((x) -> x.getName().equals(applyTo))
							  .mapToDouble((x) -> x.getTotal())
							  .sum();
		return function(quantity, price);
	}
	
	private double function (int quantity, double price) {
		return price - (quantity / x);
	}
}
