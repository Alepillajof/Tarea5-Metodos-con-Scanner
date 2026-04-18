import java.util.Scanner;
public class Producto {
    public String nombre;
    public  double precio;
    public int cantidad;

    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        this.nombre = sc.nextLine();

        System.out.print("Ingrese el precio: ");
        this.precio = sc.nextDouble();

        System.out.print("Ingrese la cantidad: ");
        this.cantidad = sc.nextInt();
    }

    public void mostrarFactura(){
        double total = cantidad * precio;
        if (total>1000){
           total = total - (total*0.10);
        }
        System.out.println("-------FACTURA-------");
        System.out.println("Producto: " + nombre);
        System.out.println("Precio unitario: " + precio);
        System.out.println("Cantidad: " + cantidad + "\n");
        System.out.println("Total a pagar: " + total);
        System.out.println("---------------------");
    }

}
