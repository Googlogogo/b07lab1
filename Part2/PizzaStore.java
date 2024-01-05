package lab5.Lab5Part2;

public class PizzaStore extends FoodStore{
	Pizza pizza;
	@Override
	Food createFood() {
		pizza = new Pizza();
		return pizza;
	}
}
