package kata01;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(staticName="of")
public class Trolley {

	private List<Item> yourStuff = new ArrayList<>();
	
	public void add(Item item) {
		yourStuff.add(item);
	}
	
	public double getTotal() {
		return yourStuff.stream().mapToDouble((x) -> x.getTotal()).sum();
	}
}
