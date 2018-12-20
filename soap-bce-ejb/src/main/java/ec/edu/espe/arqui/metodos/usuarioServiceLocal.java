
package ec.edu.espe.arqui.metodos;

import ec.edu.espe.arqui.modelos.Usuario;
import javax.ejb.Local;

/**
 *
 * @author guffenix
 */
@Local
public interface usuarioServiceLocal {
    public Usuario obtenerUsuario(Integer id);
}
