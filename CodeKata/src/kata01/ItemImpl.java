package kata01;

import lombok.Data;
import lombok.NonNull;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor(staticName="of")
public class ItemImpl implements Item {

	@NonNull private String name;
	private final double price;
	private int quantity;
	
	@Override
	public double getTotal() {
		return price * quantity;
	}

}
