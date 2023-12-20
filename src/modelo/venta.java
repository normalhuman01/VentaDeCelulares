package modelo;
import java.util.List;
public class venta {
    private Celulares _producto = new Celulares();
    private Clientes _cliente;
    private List<DetalleVentas> listaProducto;
    private FormaDePago _formaPago = new FormaDePago();
    private int folio;
    private String fecha;
    private double subtotal;
    private double iva;
    private double total;

    public venta() {
    }

    public venta(Clientes _cliente, List<DetalleVentas> listaProducto, int folio, String fecha, double subtotal, double iva, double total) {
        this._cliente = _cliente;
        this.listaProducto = listaProducto;
        this.folio = folio;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
    }

    public Celulares getProducto() {
        return _producto;
    }

    public void setProducto(Celulares _producto) {
        this._producto = _producto;
    }

    public Clientes getCliente() {
        return _cliente;
    }

    public void setCliente(Clientes _cliente) {
        this._cliente = _cliente;
    }

    public List<DetalleVentas> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(List<DetalleVentas> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public FormaDePago getFormaPago() {
        return _formaPago;
    }

    public void setFormaPago(FormaDePago _formaPago) {
        this._formaPago = _formaPago;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    
    
}
