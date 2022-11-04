package inherit1;

import java.awt.*;

public class ParrotDemo {
    public static void main(String[] args) {
        Parrot polly = new Parrot();
        polly.setColor(Color.BLUE);
        polly.setEnergy(3);
        polly.fly();
        polly.fly();

        PetParrot tweety = new PetParrot();
        tweety.setColor(Color.RED);
        tweety.setEnergy(10);
        tweety.fly();
        tweety.fly();
        tweety.setName("Tweety");
        System.out.println(tweety);
        tweety.talk();
        System.out.println(tweety);
    }
}
