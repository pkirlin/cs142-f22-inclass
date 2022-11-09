package inherit2;

import java.awt.*;

public class ParrotDemo {
    public static void main(String[] args) {
        Parrot polly = new Parrot();
        polly.setColor(Color.BLUE);
        polly.setEnergy(3);
        polly.fly();
        polly.fly();

        PetParrot tweety = new PetParrot();
        tweety.setName("Tweety");
        tweety.setEnergy(5);
        tweety.fly();
        tweety.sleep();
        tweety.talk();

        System.out.println(polly);
        System.out.println(tweety);
    }
}