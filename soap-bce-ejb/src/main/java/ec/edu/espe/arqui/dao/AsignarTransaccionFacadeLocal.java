/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arqui.dao;

import ec.edu.espe.arqui.modelos.AsignarTransaccion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author guffenix
 */
@Local
public interface AsignarTransaccionFacadeLocal {

    void create(AsignarTransaccion asignarTransaccion);

    void edit(AsignarTransaccion asignarTransaccion);

    void remove(AsignarTransaccion asignarTransaccion);

    AsignarTransaccion find(Object id);

    List<AsignarTransaccion> findAll();

    List<AsignarTransaccion> findRange(int[] range);

    int count();
    
}
