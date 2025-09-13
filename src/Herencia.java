//Herencia ejemplo//
public class Herencia {
    public static void main(String[] args) {
        Perro romeo = new Perro("Romeo");
        Gato zeus = new Gato("Zeus");

        romeo.comer();    // Heredado de Animal //
        romeo.jugar();

        zeus.comer();     // Heredado de Animal //
        zeus.dormir();
    }
}
// Esta es la clase padre //
class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo croquetas");
    }
}

// Clase hija Perro
class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    public void jugar() {
        System.out.println(nombre + " está jugando con la pelota");
    }
}

// Clase hija Gato
class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo en el sofa");
    }
}
