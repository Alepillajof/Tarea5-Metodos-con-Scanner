public class Producto {

    private String codigo;
    private String nombre;
    private String categoria;
    private double precioUnitario;
    private int stockDisponible;
    private int stockMinimo;

    public Producto(String codigo, String nombre, String categoria,
                    double precioUnitario, int stockDisponible, int stockMinimo) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;

        setPrecioUnitario(precioUnitario);
        setStockDisponible(stockDisponible);

        if(stockMinimo >= 0){
            this.stockMinimo = stockMinimo;
        } else {
            System.out.println("Error: stock mínimo inválido");
        }
    }

    public void setPrecioUnitario(double precioUnitario) {
        if(precioUnitario > 0){
            this.precioUnitario = precioUnitario;
            System.out.println("Precio actualizado correctamente");
        } else {
            System.out.println("Error: precio inválido");
        }
    }

    public void setStockDisponible(int stockDisponible) {
        if(stockDisponible >= 0){
            this.stockDisponible = stockDisponible;
            System.out.println("Stock actualizado correctamente");
        } else {
            System.out.println("Error: stock no puede ser negativo");
        }
    }

    public String getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCategoria(){
        return categoria;
    }
    public double getPrecioUnitario(){
        return precioUnitario;
    }
    public int getStockDisponible(){
        return stockDisponible;
    }
    public int getStockMinimo(){
        return stockMinimo;
    }

    public double calcularValorInventario(){
        return precioUnitario * stockDisponible;
    }

    public String evaluarEstado(){
        if(stockDisponible == 0){
            return "Producto agotado";
        } else if(stockDisponible < stockMinimo){
            return "Requiere reposición";
        } else {
            return "Stock suficiente";
        }
    }

    public void mostrarReporte(){
        System.out.println("----------- REPORTE DE PRODUCTO -----------");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio: " + precioUnitario);
        System.out.println("Stock: " + stockDisponible);
        System.out.println("Stock mínimo: " + stockMinimo);
        System.out.println("Valor inventario: " + calcularValorInventario());
        System.out.println("Estado: " + evaluarEstado());
        System.out.println("------------------------------------------");
    }
}