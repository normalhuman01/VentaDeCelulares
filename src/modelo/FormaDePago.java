package modelo;

 

public class FormaDePago {
    private int cantidadPagos = 0;
    private double pagos;

    public FormaDePago() {
    }

    public FormaDePago(double pagos) {
        this.pagos = pagos;
    }
    
    

    public int getCantidadPagos() {
        return cantidadPagos;
    }

    public void setCantidadPagos(int cantidadPagos) {
        this.cantidadPagos = cantidadPagos;
    }

    public double getPagos() {
        return pagos;
    }

    public void setPagos(double pagos) {
        this.pagos = pagos;
    }
    
}
