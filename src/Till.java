import java.util.LinkedList;

public class Till {
	private int total;
	private int quantity;
	LinkedList<Fruit> basket;
	public Till(){
		basket = new LinkedList<Fruit>();
	}
	
	public void buy_banana()
	{
		total+= 1;
		quantity+= 1;
	}
	public void buy_bananas(int n)
	{
		total += n;
		quantity+= n;
	}
	public int get_total()
	{
		return total;
	}
	public void buy_apple()
	{
		total += 2;
		quantity+= 1;
	}
	public void buy_apples(int n)
	{
		total += 2*n;
		quantity+= n;
	}
	
	public int get_quantity()
	{
		return quantity;
	}
	
	// o(n)
	public int get_quantity(Fruit fruit)
	{
		int quantity = 0;
		for(Fruit f : basket)
		{
			if(f.output() == fruit.output())
			{
				quantity++;
			}
		}
		return quantity;
	}
	public void buy(Fruit fruit) {
		total += fruit.get_price();
		quantity += 1;
	}
	public void buys(Fruit fruit, int n)
	{
		total += fruit.get_price() * n;
		quantity += n;
	}
	public void buy_all(Fruit...fruits)
	{
		for (Fruit arg : fruits) {
			total += arg.get_price();
			quantity++;
		}
	}
	public String get_receipt() {
		StringBuilder sb = new StringBuilder();
		sb.append("Receipt\n");
		sb.append("=============");
		for(Fruit item : basket){
			sb.append(item.output()+ " x"+this.get_quantity(item)+"   "+item.get_price()+"\n");
		}
		sb.append(this.get_total());
		return sb.toString();
	}
}
