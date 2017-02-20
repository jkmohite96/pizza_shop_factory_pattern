package spring.pizza_shop_factory_pattern;

public class CheesePizza extends Pizaa {

	@Override
	public void prepare() {

		System.out.println("Cheese pizza prepared");
	}

	@Override
	public void bake() {
		System.out.println("Cheese pizza baked");		
	}

	@Override
	public void cut() {
		System.out.println("Cheese pizza cutting");		
	}

	@Override
	public void box() {
		System.out.println("Cheese pizza ready to delivery");		
	}
	
	

}
