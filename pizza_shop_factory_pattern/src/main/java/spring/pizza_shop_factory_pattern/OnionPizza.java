package spring.pizza_shop_factory_pattern;

public class OnionPizza extends Pizaa {

	@Override
	public void prepare() {
		System.out.println("Onion pizza prepared");		
	}

	@Override
	public void bake() {
		System.out.println("Onion pizza baked");		
	}

	@Override
	public void cut() {
		System.out.println("Onion pizza cutting");		
	}

	@Override
	public void box() {
		System.out.println("Onion pizza ready to deliver");		
	}

}
