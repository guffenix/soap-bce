/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arqui.dao;

import ec.edu.espe.arqui.modelos.TipoTransaccion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author guffenix
 */
@Local
public interface TipoTransaccionFacadeLocal {

    void create(TipoTransaccion tipoTransaccion);

    void edit(TipoTransaccion tipoTransaccion);

    void remove(TipoTransaccion tipoTransaccion);

    TipoTransaccion find(Object id);

    List<TipoTransaccion> findAll();

    List<TipoTransaccion> findRange(int[] range);

    int count();
    
}
