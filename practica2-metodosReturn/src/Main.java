public class Main {
    public static void main(String[] args){
        Cliente c1 = new Cliente("Alessandro", 540, 0.20);
        c1.subtotal();
        c1.iva();
        c1.total();
        c1.mostrarDatos();
    }
}