import java.util.Scanner;
public class Estudiante {
    public String nombre;
    public String carrera;
    public int edad;

    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        this.nombre = sc.nextLine();

        System.out.print("Ingrese su carrera: ");
        this.carrera = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        this.edad = sc.nextInt();
    }

    public void mostrarDatos(){
        System.out.println("-----DATOS DEL ESTUDIANTE-----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Edad: " + edad);
    }
}