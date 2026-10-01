/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.pdddemo.dao.impl;

import java.util.List;
import pe.edu.utp.pdddemo.dao.ProductoDAO;
import pe.edu.utp.pdddemo.model.Producto;

/**
 *
 * @author Christiam Calero
 */
public class ProductoPostgresSQLDAO implements ProductoDAO {

    @Override
    public void registrar(Producto p) {
        System.out.println("---------------------------------------");
        System.out.println("Registro de producto en PostgreSQL");
        System.out.println("---------------------------------------");
    }

    @Override
    public List<Producto> listar() {
        return List.of(new Producto(1, "Product PostgreSQL", 500.00));
    }

}
