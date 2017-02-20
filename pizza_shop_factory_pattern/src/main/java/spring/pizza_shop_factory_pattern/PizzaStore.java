package spring.pizza_shop_factory_pattern;

public class PizzaStore {

	SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public PizzaStore() {
		super();
	}

	public Pizaa orderPizza(String type) {
		Pizaa pizza;
		
		pizza = SimplePizzaFactory.createPizza(type);
		if(null == pizza)
		{
			System.out.println("?????NO SUCH PIZZA?????");
			System.exit(0);
		}

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
