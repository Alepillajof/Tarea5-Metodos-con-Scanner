public class Cliente {
    public String nombre;
    public double consumo;
    public double costo;

    public Cliente(String nombre, double consumo, double costo){
        this.nombre = nombre;
        this.consumo = consumo;
        this.costo = costo;
    }

    public double subtotal(){
        return consumo * costo;
    }

    public double iva(){
        double iva = subtotal();
        return iva *0.15;
    }
    public double total(){
        double total = subtotal() * iva();
        return total;
    }

    public void mostrarDatos(){
        System.out.println("---------PLANILLA DE LUZ----------");
        System.out.println("Cliente: " + nombre);
        System.out.println("Subtotal: " + subtotal());
        System.out.println("IVA: " + iva());
        System.out.println("Total a pagar: " + total());
        System.out.println("-----------------------------------");
    }
}
