public class Encapsulamiento {
    public static void main(String[] args) {
        // Aquí cree un objeto de la clase Persona que se llama "p"
        Persona p = new Persona();

        // Uso el metodo setNombre para darle un valor al nombre//
        p.setNombre("Karen");

        // Uso el metodo sedEdad para darle el valor a ls edad//
        p.setEdad(18);

        // Ahora, para mostrar los valores, no accedo directo, sino que uso los métodos get//
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: " + p.getEdad());
    }
}
class Persona {
    // Los atributos son privados, asi que desde fuera no se puede acceder directamente//
    private String nombre;
    private int edad;

    // Aca estoy seteando el nombre, o sea dandole el valor "karen"
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Aca estoy obteniendo el valor del nombre"

    public String getNombre() {
        return nombre;
    }

    // Aca estoy seteando la edad, o sea dandole el valor "18"
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Aca estoy obteniendo el valor de la edad"
    public int getEdad() {
        return edad;
    }
}