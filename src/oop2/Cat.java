package oop2;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private int energy;

    // default constructor
    public Cat() {
        age = 1;
        weight = 2;
        energy = 5;
        name = "cat";
        System.out.println("Constructing a cat.");
    }

    public Cat(String newName) {
        age = 1;
        weight = 2;
        energy = 5;
        name = newName;
        System.out.println("Constructing a cat with a name.");
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



    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        }
        else {
            System.out.println("Can't set to a negative age.");
        }
    }

    public void setName(String newName) {
        name = newName;
    }

    void meow() {
        if (age <= 1) {
            System.out.println(name + " says meow!!");
        } else {
            System.out.println(name + " says MEOW MEOW MEOW!!!!!");
        }
    }

    public String toString() {
        return "Name: " + name + ", age: " + age + ", energy: " + energy;
    }

    public void play() {
        System.out.println(name + " is playing");
        energy--;
    }

    public void playWith(Cat otherCat) {
        System.out.println(name + " is playing with " + otherCat.name);
    }


}
