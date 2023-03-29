package hm1;

public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color);
    }

    public Dog(String name) {
        super(name);
    }

//    @Override
//    public void toGo() {
//        System.out.println("dog to go");
//    }


    @Override
    public void swim() {
    }

    @Override
    public void fly() {
    }
}
