package pe.edu.utp.pdddemo.dao;

import java.util.List;
import pe.edu.utp.pdddemo.model.Producto;

/**
 *
 * @author Christiam Calero
 */
public interface ProductoDAO {

    public void registrar(Producto p);

    public List<Producto> listar();
}
