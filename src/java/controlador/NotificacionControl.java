package controlador;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.NotificacionDao;
import modelo.entidad.Notificacion;


/**
 *
 * @author JEM
 */
@ManagedBean
@ViewScoped
public class NotificacionControl {

    /**
     * Creates a new instance of NotificacionControl
     */
    private List<Notificacion> listaNotificacions;
    private Notificacion notificacion;

    public NotificacionControl() {
        notificacion = new Notificacion();
    }

    public List<Notificacion> getListaNotificacions() {
        NotificacionDao ad = new NotificacionDao();
        listaNotificacions = ad.listarNotificacions();
        return listaNotificacions;
    }

    public void setListaNotificacions(List<Notificacion> listaNotificacions) {
        this.listaNotificacions = listaNotificacions;
    }

    public Notificacion getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public void limpiarNotificacion() {
        notificacion = new Notificacion();
    }

    public void agregarNotificacion() {
        NotificacionDao ad = new NotificacionDao();
        ad.agregar(notificacion);
    }

    public void modificarNotificacion() {
        NotificacionDao ad = new NotificacionDao();
        ad.modificar(notificacion);
        limpiarNotificacion();
    }

    public void eliminarNotificacion() {
        NotificacionDao ad = new NotificacionDao();
        ad.eliminar(notificacion);
        limpiarNotificacion();
    }
}

