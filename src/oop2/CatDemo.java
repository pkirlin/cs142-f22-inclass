package oop2;

public class CatDemo {
    public static void main(String[] args) {
        Cat pumpkin = new Cat();
        Cat tank = new Cat();
        pumpkin.age = 9;
        tank.age = 14;
        pumpkin.setName("Pumpkin");
        tank.setName("Tank the Wise");
        System.out.println(tank.getName() + " is " + tank.getAge() + " years old");
        System.out.println(pumpkin.getName() + " is " + pumpkin.getAge() + " years old");

        Cat anotherCat = pumpkin;
        System.out.println(anotherCat.getName() + " is " + anotherCat.getAge() + " years old");
        anotherCat.age++;
        System.out.println(pumpkin.getName() + " is " + pumpkin.getAge() + " years old");
        anotherCat = tank;
        anotherCat.age++;
        System.out.println(tank.name + " is " + tank.age + " years old");

        //anotherCat = pumpkin;
        //pumpkin = tank;

        System.out.println(pumpkin.name);
        pumpkin.meow();
        tank.meow();
        anotherCat.meow();

    }
}
