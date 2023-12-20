package modelo;

 
public class Celulares {
    private String ID;
    private String NombreProducto;
    private double precio;
    private int stock;
    private String clasificacion;

    
    public Celulares() {
    }

    public Celulares(String ID, String NombreProducto, double precio, int stock, String clasificacion) {
        this.ID = ID;
        this.NombreProducto = NombreProducto;
        this.precio = precio;
        this.stock = stock;
        this.clasificacion = clasificacion;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    

  
    
    
    
}
