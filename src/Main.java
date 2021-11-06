import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        String apellido;
        String hobbie;
        String editor;
        String so;
        int edad;

        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese su apellido: ");
        apellido = scanner.nextLine();

        System.out.println("Ingrese su editor de código favorito: ");
        editor = scanner.nextLine();

        System.out.println("Ingrese su hobbie: ");
        hobbie = scanner.nextLine();

        System.out.println("Ingrese su sistema operativo: ");
        so = scanner.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = scanner.nextInt();

        System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad +
                "\nHobbie: " + hobbie + "\nEditor de código favorito: " + editor + "\nSistema operativo: " + so);
    }

}
