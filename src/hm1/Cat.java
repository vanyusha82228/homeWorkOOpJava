package hm1;

public class Cat extends Animal{
    public Cat(String name, String color) {
        super(name, color);
    }

    public Cat(String name) {
        super(name);
    }

//    @Override
//    public void toGo() {
//        System.out.println("cat to go");
//    }
    @Override
    public void swim() {
    }

    @Override
    public void fly() {
    }
}
