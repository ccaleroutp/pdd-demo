/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.pdddemo.facade;

import java.util.List;
import pe.edu.utp.pdddemo.model.Producto;

/**
 *
 * @author Christiam Calero
 */
public interface ProductoFacade {

    public void registrar(Producto producto);

    public List<Producto> listar();
}
