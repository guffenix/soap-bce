/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arqui.dao;

import ec.edu.espe.arqui.modelos.AsignarIfinUsr;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author guffenix
 */
@Stateless
public class AsignarIfinUsrFacade extends AbstractFacade<AsignarIfinUsr> implements AsignarIfinUsrFacadeLocal {

    @PersistenceContext(unitName = "unit_bce_pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AsignarIfinUsrFacade() {
        super(AsignarIfinUsr.class);
    }
    
}
