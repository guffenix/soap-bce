/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arqui.servicios;

import ec.edu.espe.arqui.dao.UsuarioFacadeLocal;
import ec.edu.espe.arqui.modelos.Usuario;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author guffenix
 */
@WebService(serviceName = "WSUsuario")
public class WSUsuario {

    @EJB
    private UsuarioFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "usuario") Usuario usuario) {
        ejbRef.create(usuario);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "usuario") Usuario usuario) {
        ejbRef.edit(usuario);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "usuario") Usuario usuario) {
        ejbRef.remove(usuario);
    }

    @WebMethod(operationName = "find")
    public Usuario find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Usuario> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Usuario> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }
    
}
