package modelo.e2;
import modelo.e2.Animal;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanando o rabo");
    }
}