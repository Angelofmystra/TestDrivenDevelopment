
public class Banana implements Fruit{
	public int price = 1;
	public Banana() {
	}

	@Override
	public int get_price() {
		return price;
	}

	@Override
	public String output() {
		return "Banana";
	}

}
