package abstractmethod;

public class MainAbstractMethod {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        cat.run();
        cat.canEat();

        Cat cat1 = new Cat("Blacky");
        cat1.run();
        cat1.canEat();

        Cat cat2 = new Cat("Snowy");
        cat2.run();
        cat2.canEat();

        Horse horse1 = new Horse("Baidu");
        horse1.run();
        horse1.canEat();

    }
}
