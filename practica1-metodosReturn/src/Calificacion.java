import java.util.Scanner;
public class Calificacion {
    public String nombre;
    public double nota1, nota2, nota3;

    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        this.nombre = sc.nextLine();

        System.out.print("Ingrese la nota1: ");
        this.nota1 = sc.nextDouble();

        System.out.print("Ingrese la nota2: ");
        this.nota2 = sc.nextDouble();

        System.out.print("Ingrese la nota3: ");
        this.nota3 = sc.nextDouble();
    }

    public double calcularPromedio(){
        return (nota1 + nota2 + nota3)/3;
    }

    public String obtenerEstado(){
        double promedio = calcularPromedio();
        if(promedio >= 7){
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public void mostrarReporte(){
        System.out.println("-------- REPORTE ACADÉMICO --------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio final: " + calcularPromedio());
        System.out.println("Estado: " + obtenerEstado());
        System.out.println("-----------------------------------");
    }

}
