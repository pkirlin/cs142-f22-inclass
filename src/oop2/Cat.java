package oop2;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private int energy;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (name.equals("")) {
            System.out.println("You bozo, you can't set the cat's name to nothing");
        }
        else {
            name = newName;
        }
    }

    public int getAge() {
        return age;
    }

    void meow() {
        System.out.println(name + " says meow!!");
    }

}
