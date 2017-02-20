package spring.pizza_shop_factory_pattern;

import java.util.Scanner;

public class TestPizza {
	
	public static void main(String[] args) {
		PizzaStore p1 = new PizzaStore();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter pizza type : ");
		
		String ptype = sc.next();
		p1.orderPizza(ptype);
	}
}
