package oop2;

public class CatDemo {
    public static void main(String[] args) {
        Cat pumpkin = new Cat();
        Cat tank = new Cat();
        pumpkin.age = 9;
        tank.age = 14;
        pumpkin.name = "Pumpkin";
        tank.name = "Tank the Wise";
        System.out.println(tank.name + " is " + tank.age + " years old");
        System.out.println(pumpkin.name + " is " + pumpkin.age + " years old");

        Cat anotherCat = pumpkin;
        System.out.println(anotherCat.name + " is " + anotherCat.age + " years old");
        anotherCat.age++;
        System.out.println(pumpkin.name + " is " + pumpkin.age + " years old");
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
