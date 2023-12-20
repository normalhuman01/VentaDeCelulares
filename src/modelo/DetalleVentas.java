package modelo;
public class DetalleVentas {
    private String Nombre;
    private int cantidad;
    private Celulares producto;
    private double importeUnitario;
    private double total;
    

    public DetalleVentas() {
    }

    public DetalleVentas(String Nombre, int cantidad, Celulares producto, double importeUnitario, double total) {
        this.Nombre = Nombre;
        this.cantidad = cantidad;
        this.producto = producto;
        this.importeUnitario = importeUnitario;
        this.total = total;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Celulares getProducto() {
        return producto;
    }

    public void setProducto(Celulares producto) {
        this.producto = producto;
    }

    public double getImporteUnitario() {
        return importeUnitario;
    }

    public void setImporteUnitario(double importeUnitario) {
        this.importeUnitario = importeUnitario;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    

    
    
    
}
