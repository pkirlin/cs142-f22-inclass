package lab11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BlackjackRunner {
    public static void main(String[] args)
    {
        runInteractively();

        //runSimulations(100, 1000);
    }

    public static void runInteractively()
    {
        Blackjack game = new Blackjack(new InteractiveStrategy());  // change strategy here
        int finalMoney = game.playHands(5);
        System.out.println("Final player money: " + finalMoney);
    }

    public static void runSimulations(int numSimulations, int numHands) {
        List<Integer> finalAmounts = new ArrayList<Integer>();
        for (int i = 0; i < numSimulations; i++) {
            Blackjack game = new Blackjack(new InteractiveStrategy());  // change strategy here
            int finalMoney = game.playHands(numHands);
            finalAmounts.add(finalMoney);
        }

        // print distribution of final amounts of money
        List<Integer> distribution = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            distribution.add(0);
        }
        for (int finalMoney : finalAmounts) {
            int indexToChange = -1;
            if (finalMoney < 7000)
                indexToChange = 0;
            else if (finalMoney < 7500)
                indexToChange = 1;
            else if (finalMoney < 8000)
                indexToChange = 2;
            else if (finalMoney < 8500)
                indexToChange = 3;
            else if (finalMoney < 9000)
                indexToChange = 4;
            else if (finalMoney < 9500)
                indexToChange = 5;
            else if (finalMoney < 10000)
                indexToChange = 6;
            else if (finalMoney < 10500)
                indexToChange = 7;
            else if (finalMoney < 11000)
                indexToChange = 8;
            else
                indexToChange = 9;

            distribution.set(indexToChange, distribution.get(indexToChange) + 1);
        }
        Collections.sort(finalAmounts);
        System.out.println("Final amounts: " + finalAmounts);
        System.out.println("Final distribution: " + distribution);
        List<String> breakpoints =
                List.of(" <7000", " <7500", " <8000", " <8500", " <9000", " <9500", "<10000", "<10500", "<11000", ">11000");
        for (int i = 0; i < breakpoints.size(); i++)
        {
            System.out.print(breakpoints.get(i) + " ");
            for (int j = 0; j < distribution.get(i); j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
