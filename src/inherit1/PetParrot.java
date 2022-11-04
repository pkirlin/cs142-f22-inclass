package inherit1;

public class PetParrot extends Parrot {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void talk() {
        System.out.println(name + " is talking.");
        //energy--;  This won't work b/c energy is private.
        //setEnergy(getEnergy() - 1);  // This works

        int e = getEnergy();  // These 3 lines work as well.
        e--;
        setEnergy(e);
    }
}
