package concrete.abstrct.interfac;

// 3b. Concrete Class 2: Another concrete implementation
public class Clarinet extends WindInstrument {

    public Clarinet(String material) {
        super(material);
    }

    // Implementation of the required interface method
    @Override
    public void play() {
        System.out.println("Clarinet playing a rich, reedy sound!");
    }

    // Implementation of the required abstract method from the abstract class
    @Override
    public void blowInto() {
        System.out.println("Blowing through the reed of the clarinet.");
    }
}
