package spring.pizza_shop_factory_pattern;

public class SimplePizzaFactory {

	public static Pizaa createPizza(String type) {
		
		Pizaa pizza = null;
		//System.out.println(type);
		
		if(type.equals("cheese"))
		{
			pizza = new CheesePizza();
		}
		else if (type.equals("onion")) 
		{
			pizza = new OnionPizza();
		}
		else if (type.equals("garlic"))
		{
			pizza = new GarlicPizza();
			
		}
		else if (type.equals("newaddedpizza")) {
			pizza = new NewAddedPizza();
		}
		return pizza;
	}

}
