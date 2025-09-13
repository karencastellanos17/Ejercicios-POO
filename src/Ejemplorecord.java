// Ejemplo usando clase normal
//------------------------------------------------------------------------------------//
class PersonaClase {
    private String nombre;
    private int edad;

    // Constructor
    public PersonaClase(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // toString para imprimir bonito
    @Override
    public String toString() {
        return "PersonaClase{nombre='" + nombre + "', edad=" + edad + "}";
    }
}
//-----------------------------------------------------------------------------------//
// Ejemplo usando record//
record PersonaRecord(String nombre, int edad) {
    // No necesito escribir constructor, getters ni toString, porque el record lo genera automáticamente//
}
public class Ejemplorecord {
    public static void main(String[] args) {
        // Usando clase
        PersonaClase persona1 = new PersonaClase("Karen", 18);
        System.out.println(persona1.getNombre() + " tiene " + persona1.getEdad() + " años.");
        System.out.println(persona1); // usa toString sobrescrito

        // Usando record
        PersonaRecord persona2 = new PersonaRecord("Laura", 20);
        System.out.println(persona2.nombre() + " tiene " + persona2.edad() + " años.");
        System.out.println(persona2); // toString automático
    }
}