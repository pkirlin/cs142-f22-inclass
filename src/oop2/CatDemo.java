package oop2;

public class CatDemo {
    public static void main(String[] args) {
        Cat myer = new Cat();
        Cat cora = new Cat();

        myer.age = 3;
        myer.name = "Myer";
        cora.age = 2;
        cora.name = "Cora";
        System.out.println("Myer's age is " + myer.age);
        System.out.println("Cora's age is " + cora.age);

        Cat anotherCat = cora;

        anotherCat.age++;

        System.out.println("Myer's age is " + myer.age);
        System.out.println("Cora's age is " + cora.age);

        anotherCat = myer;

        cora.meow();
        myer.meow();
        anotherCat.meow();

        System.out.println(myer);
        System.out.println(cora);
        System.out.println(anotherCat);


    }
}
