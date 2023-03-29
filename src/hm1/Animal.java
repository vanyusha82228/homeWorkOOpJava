package hm1;

public class Animal {
    public String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void toGo(){
        System.out.println("go...");
    }

    public void fly(){
        System.out.println("fly");
    }

    public void swim(){
        System.out.println("swim");
    }
}
