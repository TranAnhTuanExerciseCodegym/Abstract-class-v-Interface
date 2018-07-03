package animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: gaogao";
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
