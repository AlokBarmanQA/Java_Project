package concrete.abstrct.interfac;

// 3a. Concrete Class 1: Implements all abstract methods and interface methods
public class Flute extends WindInstrument {

    public Flute(String material) {
        super(material);
    }

    // Implementation of the required interface method
    @Override
    public void play() {
        System.out.println("Flute playing a melodic tune with air!");
    }

    // Implementation of the required abstract method from the abstract class
    @Override
    public void blowInto() {
        System.out.println("Blowing across the embouchure hole of the flute.");
    }
}
