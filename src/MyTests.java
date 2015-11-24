import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyTests {

  @Test
  public void Till_BuyBananas() {

    // MyClass is tested
    Till tester = new Till();
    tester.buy_banana();
    tester.buy_bananas(5);
    // assert statements
    assertEquals("Six bananas must cost £6", 6, tester.get_total());
  }
  @Test
  public void Till_BuyBananasAndApplies() {
	  Till tester = new Till();
	  tester.buy_banana();
	  tester.buy_bananas(5);
	  tester.buy_apple();
	  tester.buy_apples(3);
	  assertEquals("Six bananas and Three applies must cost £14", 14, tester.get_total());
  }
  @Test
  public void Till_GetQuantity()
  {
	  Till tester = new Till();
	  tester.buy_banana();
	  tester.buy_bananas(5);
	  tester.buy_apple();
	  tester.buy_apples(3);
	  assertEquals("Total items should be 10", 10, tester.get_quantity());	  
  }
  @Test
  public void Till_Polymorphic()
  {
	  Till tester = new Till();
	  Pineapple pineapple = new Pineapple();
	  Banana banana = new Banana();
	  Apple apple = new Apple();
	  tester.buy(pineapple);
	  tester.buy(apple);
	  tester.buy(banana);
	  
	  assertEquals("Total must cost £5+£2+£1 = £8", 8, tester.get_total());
  }
  @Test
  public void Till_BuysPolymorphic()
  {
	  Till tester = new Till();
	  Pineapple p = new Pineapple();
	  Banana b = new Banana();
	  tester.buys(b, 5);
	  tester.buys(p, 3);
	  assertEquals("Total must equal £20", 20, tester.get_total());
  }
  @Test
  public void Till_BuyAll()
  {
	  Till tester = new Till();
	  Pineapple p = new Pineapple();
	  Apple a = new Apple();
	  tester.buy_all(a,p);
	  assertEquals("Total must be £7", 7, tester.get_total());
  }
  @Test
  public void Till_None()
  {
	  Till tester = new Till();
	  assertEquals("Total must be £0", 0, tester.get_total());
  }
  @Test
  public void Till_GetReceipt()
  {
	  Till tester = new Till();
	  assertEquals("Receipt must be:",
			    "Receipt\n"
			  + "Item    #     Sub-total\n"
			  + "=======================\n"
			  + "Banana x4            £4\n"
			  + "Apple x 2            £4\n"
			  + "Pineapple x3        £15\n"
			  + "=======================\n"
			  + "Quantity: 7            \n"
			  + "Total:              £23\n"
			  , tester.get_receipt());
  }
}
