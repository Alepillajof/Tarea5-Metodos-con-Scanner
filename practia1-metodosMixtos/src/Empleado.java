import java.util.Scanner;

public class Empleado {
    public String nombre;
    public int horasTrabajadas;
    public double pagoHora;

    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese las horas trabajadas: ");
        horasTrabajadas = sc.nextInt();

        System.out.print("Ingrese el pago por hora: ");
        pagoHora = sc.nextDouble();
    }

    public double calcularSueldoBase(){
        return horasTrabajadas * pagoHora;
    }

    public double calcularBono(){
        double sueldoBase = calcularSueldoBase();

        if(sueldoBase >= 400){
            return 20;
        } else {
            return 0;
        }
    }

    public double calcularSueldoFinal(){
        return calcularSueldoBase() + calcularBono();
    }

    public void mostrarReporte(){
        System.out.println("----------- REPORTE DE EMPLEADO -----------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo base: " + calcularSueldoBase());
        System.out.println("Bono: " + calcularBono());
        System.out.println("Sueldo final: " + calcularSueldoFinal());
        System.out.println("-------------------------------------------");
    }
}
