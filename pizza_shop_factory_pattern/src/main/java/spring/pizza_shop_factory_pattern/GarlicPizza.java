package spring.pizza_shop_factory_pattern;

public class GarlicPizza extends Pizaa {

	@Override
	public void prepare() {
		System.out.println("Garlic pizza prepared");		
	}

	@Override
	public void bake() {
		System.out.println("Garlic pizza baked");		
	}

	@Override
	public void cut() {
		System.out.println("Garlic pizza cutting");		
	}

	@Override
	public void box() {
		System.out.println("Garlic pizza ready to deliver");		
	}

}
