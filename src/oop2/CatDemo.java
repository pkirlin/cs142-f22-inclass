package oop2;

public class CatDemo {
    public static void main(String[] args) {
        /*Cat myer = new Cat("Myer");
        Cat cora = new Cat("Cora");

        myer.setAge(3);
        myer.setName("Myer the awesome");
        cora.setAge(-2);
        //cora.setName("Cora");
        //System.out.println(myer.name);
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
        myer.meow("Hello");

        System.out.println(myer);
        System.out.println(cora);
        System.out.println(anotherCat);

        myer.playWith(cora);
        */

        Cat[] myCats = new Cat[3];
        //System.out.println(myCats[3]);
        myCats[0] = new Cat("Fluffy");
        myCats[1] = new Cat("Mittens");
        myCats[2] = new Cat("Soup");

        double total = 0;
        for (int i = 0; i < myCats.length; i++) {
            myCats[i].meow("something sophisticated");
            total = total + myCats[i].getWeight();
        }
        System.out.println("The total weight of my cats is " + total);
        System.out.println("The average weight of my cats is " + total/myCats.length);

        myCats[2] = myCats[0];
        System.out.println(myCats[0]);
        System.out.println(myCats[2]);
    }
}
