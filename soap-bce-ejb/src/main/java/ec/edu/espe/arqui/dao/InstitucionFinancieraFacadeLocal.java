
package ec.edu.espe.arqui.dao;

import ec.edu.espe.arqui.modelos.InstitucionFinanciera;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author guffenix
 */
@Local
public interface InstitucionFinancieraFacadeLocal {

    void create(InstitucionFinanciera institucionFinanciera);

    void edit(InstitucionFinanciera institucionFinanciera);

    void remove(InstitucionFinanciera institucionFinanciera);

    InstitucionFinanciera find(Object id);

    List<InstitucionFinanciera> findAll();

    List<InstitucionFinanciera> findRange(int[] range);

    int count();
    
}
