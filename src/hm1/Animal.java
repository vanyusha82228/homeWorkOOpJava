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
        System.out.println(String.format("%s %s walked!", this.getType(),this.name));
    }

    public void fly(){
        System.out.println((String.format("%s %s fly!", this.getType(),this.name)));
    }

    public void swim(){
        System.out.println((String.format("%s %s swim!", this.getType(),this.name)));
    }

    @Override
    public String toString() {
        return String.format(":Животное %s, Имя: %s, Цвет: %s", this.getType(), this.name, this.color);
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
}
