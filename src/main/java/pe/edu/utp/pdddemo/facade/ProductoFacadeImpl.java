/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.pdddemo.facade;

import java.util.List;
import pe.edu.utp.pdddemo.dao.ProductoDAO;
import pe.edu.utp.pdddemo.factory.ProductoDAOFactory;
import pe.edu.utp.pdddemo.model.Producto;

/**
 *
 * @author Christiam Calero
 */
public class ProductoFacadeImpl implements ProductoFacade{

    ProductoDAO dao = ProductoDAOFactory.crear("postgres");
    
    @Override
    public void registrar(Producto producto) {
        dao.registrar(producto);
    }

    @Override
    public List<Producto> listar() {
        return dao.listar();
    }
    
}
