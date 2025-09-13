//Abastracción ejemplo//

public class Abstraccion {
    public static void main(String[] args) {
        Electrodomestico lavadora = new Lavadora();
        Electrodomestico nevera = new Nevera();

        lavadora.encender();
        nevera.encender();
    }
}
//"abstract" significa que esta clase no se puede usar directamente//
abstract class Electrodomestico {
    //Aqui no tiene ni cuerpo ni codigo//
    abstract void encender();
}
// Aquí ya sí se escribe lo que hace la lavadora cuando se "enciende"//
class Lavadora extends Electrodomestico {
    public void encender() {
        System.out.println("La lavadora está lavando");
    }
}
// Y acá lo mismo pero con la nevera, que tiene su propia acción al "encender"//
class Nevera extends Electrodomestico {
    public void encender() {
        System.out.println("La nevera está congelando");
    }
}