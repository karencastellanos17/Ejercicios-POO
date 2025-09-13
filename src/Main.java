import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("hola," + nombre + ", ¡bienvenida a Java!");
    }
}