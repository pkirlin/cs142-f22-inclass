package inherit2;

public class DogDemo {
    public static void main(String[] args) {
        Dog fido = new Dog();
        fido.setName("Fido");
        fido.setAge(2);

        Dog toto = new Dog();
        toto.setName("Toto");
        toto.setAge(3);

        System.out.println(fido);
        System.out.println(toto);

        ShowDog rufusTheWonderDog = new ShowDog();
        rufusTheWonderDog.setAge(4);
        rufusTheWonderDog.setName("Rufus");
        System.out.println(rufusTheWonderDog);
        rufusTheWonderDog.chase(toto);
        rufusTheWonderDog.dance();
        rufusTheWonderDog.setNumTrophies(10);
        System.out.println("Rufus has won " + rufusTheWonderDog.getNumTrophies());
    }
}