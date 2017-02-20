package spring.pizza_shop_factory_pattern;

public class NewAddedPizza extends Pizaa {
	
	@Override
	public void prepare() {

		System.out.println("NewAddedPizza pizza prepared");
	}

	@Override
	public void bake() {
		System.out.println("NewAddedPizza pizza baked");		
	}

	@Override
	public void cut() {
		System.out.println("NewAddedPizza pizza cutting");		
	}

	@Override
	public void box() {
		System.out.println("NewAddedPizza pizza ready to delivery");		
	}


}
