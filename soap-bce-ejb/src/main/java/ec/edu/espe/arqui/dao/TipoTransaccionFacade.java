/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arqui.dao;

import ec.edu.espe.arqui.modelos.TipoTransaccion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author guffenix
 */
@Stateless
public class TipoTransaccionFacade extends AbstractFacade<TipoTransaccion> implements TipoTransaccionFacadeLocal {

    @PersistenceContext(unitName = "unit_bce_pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoTransaccionFacade() {
        super(TipoTransaccion.class);
    }
    
}
