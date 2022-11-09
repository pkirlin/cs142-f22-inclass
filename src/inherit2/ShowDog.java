package inherit2;

public class ShowDog extends Dog {
    private int numTrophies;

    public int getNumTrophies() {
        return numTrophies;
    }

    public void setNumTrophies(int numTrophies) {
        this.numTrophies = numTrophies;
    }

    public void dance() {
        System.out.println(name + " is dancing!");  // name is protected in Dog, so we can use it here.
        // if name were private in Dog, we couldn't access it here.

        // alternate way to do this:
        // System.out.println(getName() + " is dancing!");  // getName() is public, so anyone can use it.
    }
}
