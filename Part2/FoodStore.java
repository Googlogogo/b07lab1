package lab5.Lab5Part2;

public abstract class FoodStore {
    Process p;
    abstract Food createFood();
    
    Food order() {
        p = new Process();
        Food food = createFood();
        p.process(food);
        return food;
    }
}
