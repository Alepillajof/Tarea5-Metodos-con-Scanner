public class Main {
    public static void main(String[] args) {

        Producto p = new Producto("PRD-105", "Disco SSD 1TB", "Almacenamiento", 89.50, 12, 8);

        p.setPrecioUnitario(95.00);
        p.setStockDisponible(5);

        p.setStockDisponible(-3);

        p.mostrarReporte();
    }
}