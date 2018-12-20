
package ec.edu.espe.arqui.metodos;

import ec.edu.espe.arqui.dao.UsuarioFacade;
import ec.edu.espe.arqui.modelos.Usuario;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author guffenix
 */
@Stateless
public class usuarioService implements usuarioServiceLocal {

    @EJB
    UsuarioFacade euf;
    
    @Override
    public Usuario obtenerUsuario(Integer id) {
        return euf.find(1);
    }
    
}
