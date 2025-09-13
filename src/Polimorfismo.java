//Polimorfismo ejercicio//

public class Polimorfismo {
    public static void main(String[] args) {
        // Aunque todos son de tipo instrumento, cada uno es distinto//
        Instrumento i1 = new Guitarra();
        Instrumento i2 = new Piano();
        Instrumento i3 = new Violin();

        // Al llamar tocar, cada instrumento toca a su manera//
        i1.tocar();
        i2.tocar();
        i3.tocar();
    }
}
// Clase padre Instrumento//
class Instrumento {
    // Esto es un metodo que las clases hijas van a redefinir//
    public void tocar() {
        System.out.println("El instrumento esta sonando");
    }
}
// Clase hija Guitarra que redefine tocar()
class Guitarra extends Instrumento {
    public void tocar() {
        System.out.println("La guitarra toca rock");
    }
}
// Clase hija Piano que redefine tocar()
class Piano extends Instrumento {
    public void tocar() {
        System.out.println("El piano toca una melodía clásica");
    }
}
// Clase hija Violin que redefine tocar()
class Violin extends Instrumento {
    public void tocar() {
        System.out.println("El violín toca una nota suave");
    }
}