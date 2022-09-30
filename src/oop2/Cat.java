package oop2;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private int energy;

    public Cat() {  // default constructor
        age = 1;
        weight = 2;
        energy = 5;
        name = "Whiskers";
        System.out.println("Constructing a new cat");
    }

    public Cat(String newName, int newAge) {
        age = newAge;
        weight = 2;
        energy = 5;
        name = newName;
        System.out.println("Constructing a new cat");
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    void meow() {
        System.out.println(name + " says meow!!");
    }

    public String toString() {
        return "name: " + name + ", age: " + age + ", energy: " + energy;
    }

    public void playWith(Cat otherCat) {
        System.out.println(name + " plays with " + otherCat.name);
    }

}
