package oop2;

public class Cat {
    String name;
    int age;
    double weight;
    int energy;

    void meow() {
        if (age <= 1) {
            System.out.println(name + " says meow!!");
        }
        else {
            System.out.println(name + " says MEOW MEOW MEOW!!!!!");
        }
    }

    public String toString() {
        return "Name: " + name + ", age: " + age;
    }


}
