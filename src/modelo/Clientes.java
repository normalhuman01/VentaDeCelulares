package modelo;

 
/**
 *
 * @author victo
 */
public class Clientes {
        private String Nombre;
        private String ID;
        private String Domicilio;
        private String RFC;
        private String telefono;
        private String CorreoElectronico;
        

    public Clientes() {
    }

    public Clientes(String Nombre, String ID, String Domicilio, String RFC, String telefono, String CorreoElectronico) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Domicilio = Domicilio;
        this.RFC = RFC;
        this.telefono = telefono;
        this.CorreoElectronico = CorreoElectronico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }
    

    
        
        
}
