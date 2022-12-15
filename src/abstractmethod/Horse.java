package abstractmethod;

public class Horse extends animal{
    public Horse(String name){
        this.name=name;
    }
    @Override
    void run() {
        System.out.println("The horse "+ name+", can run");
    }

    @Override
    void canEat() {
        System.out.println("Horse can eat bamboo, i think?");
    }
}
