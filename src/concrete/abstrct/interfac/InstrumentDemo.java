package concrete.abstrct.interfac;

// Main class to demonstrate usage
public class InstrumentDemo {
    public static void main(String[] args) {
        Flute myFlute = new Flute("Silver");
        Clarinet myClarinet = new Clarinet("Wood");

        System.out.println("--- Flute Actions ---");
        myFlute.displayMaterial();
        myFlute.blowInto();
        myFlute.adjustPitch();
        myFlute.play();

        System.out.println("\n--- Clarinet Actions ---");
        myClarinet.displayMaterial();
        myClarinet.blowInto();
        myClarinet.adjustPitch();
        myClarinet.play();
    }
}
