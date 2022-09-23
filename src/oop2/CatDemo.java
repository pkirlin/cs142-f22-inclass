package oop2;

public class CatDemo {
    public static void main(String[] args) {
        Cat myer = new Cat();
        Cat cora = new Cat();

        myer.setAge(3);
        myer.name = "Myer";
        cora.setAge(-2);
        cora.name = "Cora";
        System.out.println("Myer's age is " + myer.getAge());
        System.out.println("Cora's age is " + cora.getAge());

        Cat anotherCat = cora;

        //anotherCat.age++;
        int temp = anotherCat.getAge();
        anotherCat.setAge(temp+1);

        anotherCat.setAge(anotherCat.getAge() + 1);

        System.out.println("Myer's age is " + myer.getAge());
        System.out.println("Cora's age is " + cora.getAge());

        anotherCat = myer;

        cora.meow();
        myer.meow();
        anotherCat.meow();

        System.out.println(myer);
        System.out.println(cora);
        System.out.println(anotherCat);


    }
}
