package controlador;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.DifuncionDao;
import modelo.entidad.Difuncion;


/**
 *
 * @author JEM
 */
@ManagedBean
@ViewScoped
public class DifuncionControl {

    /**
     * Creates a new instance of DifuncionControl
     */
    private List<Difuncion> listaDifuncions;
    private Difuncion difuncion;

    public DifuncionControl() {
        difuncion = new Difuncion();
    }

    public List<Difuncion> getListaDifuncions() {
        DifuncionDao ad = new DifuncionDao();
        listaDifuncions = ad.listarDifuncions();
        return listaDifuncions;
    }

    public void setListaDifuncions(List<Difuncion> listaDifuncions) {
        this.listaDifuncions = listaDifuncions;
    }

    public Difuncion getDifuncion() {
        return difuncion;
    }

    public void setDifuncion(Difuncion difuncion) {
        this.difuncion = difuncion;
    }

    public void limpiarDifuncion() {
        difuncion = new Difuncion();
    }

    public void agregarDifuncion() {
        DifuncionDao ad = new DifuncionDao();
        ad.agregar(difuncion);
    }

    public void modificarDifuncion() {
        DifuncionDao ad = new DifuncionDao();
        ad.modificar(difuncion);
        limpiarDifuncion();
    }

    public void eliminarDifuncion() {
        DifuncionDao ad = new DifuncionDao();
        ad.eliminar(difuncion);
        limpiarDifuncion();
    }
}

