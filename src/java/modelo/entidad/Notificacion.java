package modelo.entidad;
// Generated 3/10/2021 11:42:36 PM by Hibernate Tools 4.3.1



/**
 * Notificacion generated by hbm2java
 */
public class Notificacion  implements java.io.Serializable {


     private Integer idTipo;
     private String descripcion;

    public Notificacion() {
    }

    public Notificacion(String descripcion) {
       this.descripcion = descripcion;
    }
   
    public Integer getIdTipo() {
        return this.idTipo;
    }
    
    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}


