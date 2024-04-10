import modelo.e2.Animal;
import modelo.e2.Cachorro;
import modelo.e2.Gato;



public static void main(String[] args) {

    Cachorro cachorro = new Cachorro();
    cachorro.emitirSom();
    cachorro.abanarRabo();

    Gato gato = new Gato();
    gato.emitirSom();
    gato.arranharMoveis();
}
