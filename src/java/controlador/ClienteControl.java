package controlador;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;
import modelo.dao.ClienteDao;
import modelo.entidad.Cliente;


/**
 *
 * @author JEM
 */
@ManagedBean
@ViewScoped
 
public class ClienteControl {

    /**
     * Creates a new instance of ClienteControl
     */
    private List<Cliente> listaClientes;
    private Cliente cliente;
    private List<Cliente> buscarClientes;

    public ClienteControl() {
        cliente = new Cliente();
    }

     public List<Cliente> getListaClientes() {
        ClienteDao ad = new ClienteDao();
        listaClientes = ad.listarClientes();
        return listaClientes;
    }
    
   
    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void limpiarCliente() {
        cliente = new Cliente();
    }

    public void agregarCliente() {
        ClienteDao ad = new ClienteDao();
        ad.agregar(cliente);
    }

    public void modificarCliente() {
        ClienteDao ad = new ClienteDao();
        ad.modificar(cliente);
        limpiarCliente();
    }

    public void eliminarCliente() {
        ClienteDao ad = new ClienteDao();
        ad.eliminar(cliente);
        limpiarCliente();
    }

    public List<Cliente> getBuscarClientes() {
        return buscarClientes;
    }

    public void setBuscarClientes(List<Cliente> buscarClientes) {
        this.buscarClientes = buscarClientes;
    }

   
    
    
}

