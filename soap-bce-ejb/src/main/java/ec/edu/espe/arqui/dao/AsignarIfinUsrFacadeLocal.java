/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arqui.dao;

import ec.edu.espe.arqui.modelos.AsignarIfinUsr;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author guffenix
 */
@Local
public interface AsignarIfinUsrFacadeLocal {

    void create(AsignarIfinUsr asignarIfinUsr);

    void edit(AsignarIfinUsr asignarIfinUsr);

    void remove(AsignarIfinUsr asignarIfinUsr);

    AsignarIfinUsr find(Object id);

    List<AsignarIfinUsr> findAll();

    List<AsignarIfinUsr> findRange(int[] range);

    int count();
    
}
