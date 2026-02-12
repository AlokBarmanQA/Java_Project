package concrete.abstrct.interfac;

// 1. Interface: Defines a contract for all musical instruments
public interface Playable {
    void play(); // Method must be implemented by all concrete classes
    void adjustPitch(); // Another required method
}
