package kata01;

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
		trolley.getYourStuff().stream()
							  .filter((x) -> x.getName().equals(applyTo));
		return 0;
	}
}
