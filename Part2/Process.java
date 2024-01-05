package lab5.Lab5Part2;

public class Process {
    Food food;
    void process(Food food) {
        food.customize();
        food.prepare();
        food.box();
    }
}
