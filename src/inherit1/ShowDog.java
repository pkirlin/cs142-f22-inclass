package inherit1;

public class ShowDog extends Dog {
    private String breed;
    private int purdiness;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getPurdiness() {
        return purdiness;
    }

    public void setPurdiness(int purdiness) {
        this.purdiness = purdiness;
    }

    public void watchTheKids() {
        System.out.println(getName() + " is watching the kids.");
    }
}
