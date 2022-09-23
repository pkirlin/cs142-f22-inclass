package oop2;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private int energy;

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        }
        else {
            System.out.println("Can't set to a negative age.");
        }
    }

    void meow() {
        if (age <= 1) {
            System.out.println(name + " says meow!!");
        } else {
            System.out.println(name + " says MEOW MEOW MEOW!!!!!");
        }
    }

    public String toString() {
        return "Name: " + name + ", age: " + age;
    }


}
