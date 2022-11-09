package inherit1;

public class ShowDog extends Dog {
    private String breed;
    private int numBallsCanJuggle;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getNumBallsCanJuggle() {
        return numBallsCanJuggle;
    }

    public void setNumBallsCanJuggle(int numBallsCanJuggle) {
        this.numBallsCanJuggle = numBallsCanJuggle;
    }

    public void launderMoney() {
        System.out.println(getName() + " is laundering money");
    }
}
