
public class Pineapple implements Fruit {
	public int price = 5;
	public Pineapple() {
	}

	@Override
	public int get_price() {
		return price;
	}

	@Override
	public String output() {
		return "Pineapple";
	}

}
