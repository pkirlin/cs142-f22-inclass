package inherit2;

public class PetParrot extends Parrot {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void talk() {
        System.out.println(name + " is talking!");
        int e = getEnergy();  // energy is private in Parrot, so we can't access it here.
        setEnergy(e - 1);  // but we can get around this by using get/setEnergy().
        // or we could change energy in Parrot to be protected.
    }

    public void fly() {
        // flying takes three units of energy
        if (energy >= 3) {
            energy -= 3;
            System.out.println(getName() + " flies!");
        } else {
            System.out.println(getName() + " is too tired to fly.");
        }
    }
}
