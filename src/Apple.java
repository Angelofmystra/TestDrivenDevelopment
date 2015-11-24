
public class Apple implements Fruit {
	public int price = 2;
	@Override
	public int get_price() {
		return price;
	}
	@Override
	public String output() {
		return "Apple";
	}

}
