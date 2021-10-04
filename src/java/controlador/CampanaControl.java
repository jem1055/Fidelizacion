package controlador;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.CampanaDao;
import modelo.entidad.Campana;


/**
 *
 * @author JEM
 */
@ManagedBean
@ViewScoped
public class CampanaControl {

    /**
     * Creates a new instance of CampanaControl
     */
    private List<Campana> listaCampanas;
    private Campana campana;

    public CampanaControl() {
        campana = new Campana();
    }

    public List<Campana> getListaCampanas() {
        CampanaDao ad = new CampanaDao();
        listaCampanas = ad.listarCampanas();
        return listaCampanas;
    }

    public void setListaCampanas(List<Campana> listaCampanas) {
        this.listaCampanas = listaCampanas;
    }

    public Campana getCampana() {
        return campana;
    }

    public void setCampana(Campana campana) {
        this.campana = campana;
    }

    public void limpiarCampana() {
        campana = new Campana();
    }

    public void agregarCampana() {
        CampanaDao ad = new CampanaDao();
        ad.agregar(campana);
    }

    public void modificarCampana() {
        CampanaDao ad = new CampanaDao();
        ad.modificar(campana);
        limpiarCampana();
    }

    public void eliminarCampana() {
        CampanaDao ad = new CampanaDao();
        ad.eliminar(campana);
        limpiarCampana();
    }
}

