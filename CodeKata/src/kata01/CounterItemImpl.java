package kata01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor(staticName="of")
public class CounterItemImpl implements CounterItem {

	@NonNull private String name;
	private final double price;
	private int weight;
	
	@Override
	public double getTotal() {
		return (int)Math.round(price * weight);
	}

	@Override
	public double getWeight() {
		return weight;
	}

}
