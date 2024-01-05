package lab5.Lab5Part2;

public class BurgerStore extends FoodStore{
	Burger burger;
	@Override
	Food createFood() {
		burger = new Burger();
		return burger;
	}
}