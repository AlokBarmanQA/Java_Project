package concrete.abstrct.interfac;

//2. Abstract Class: Provides a common base with shared logic and abstract methods
public abstract class WindInstrument implements Playable {
    private String material;

    // Constructor for the abstract class
    public WindInstrument(String material) {
        this.material = material;
    }

    // A concrete method shared by all wind instruments
    public void displayMaterial() {
        System.out.println("This wind instrument is made of: " + material);
    }

    // Implementing one interface method with shared logic, leaving others abstract
    @Override
    public void adjustPitch() {
        System.out.println("Adjusting the pitch of the wind instrument via an embouchure change.");
    }

    // Abstract method that *must* be implemented by concrete subclasses
    public abstract void blowInto();
}
