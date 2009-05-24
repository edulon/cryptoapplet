/**
 * LICENCIA LGPL:
 * 
 * Esta librería es Software Libre; Usted puede redistribuirlo y/o modificarlo
 * bajo los términos de la GNU Lesser General Public License (LGPL)
 * tal y como ha sido publicada por la Free Software Foundation; o
 * bien la versión 2.1 de la Licencia, o (a su elección) cualquier versión posterior.
 * 
 * Esta librería se distribuye con la esperanza de que sea útil, pero SIN NINGUNA
 * GARANTÍA; tampoco las implícitas garantías de MERCANTILIDAD o ADECUACIÓN A UN
 * PROPÓSITO PARTICULAR. Consulte la GNU Lesser General Public License (LGPL) para más
 * detalles
 * 
 * Usted debe recibir una copia de la GNU Lesser General Public License (LGPL)
 * junto con esta librería; si no es así, escriba a la Free Software Foundation Inc.
 * 51 Franklin Street, 5º Piso, Boston, MA 02110-1301, USA o consulte
 * <http://www.gnu.org/licenses/>.
 *
 * Copyright 2008 Ministerio de Industria, Turismo y Comercio
 * 
 */
package es.mityc.firmaJava.ts;

/** 
 * Clase encargada de gestionar los errores producidos en TSCliente
 * 
 * @author  Ministerio de Industria, Turismo y Comercio
 * @version 0.9 beta
 */

public class TSClienteError extends Exception {
	
	/** 
	 * Crea una nueva instancia de TSClienteError
	 */
	public TSClienteError() {
		super();
	}

	/**
	 * Crea una nueva instancia de TSClienteError
	 * @param mensaje Valor del mensaje
	 */
	public TSClienteError(String mensaje) {
		  super(mensaje);
	}

	/**
	 * Crea una nueva instancia de TSClienteError
	 * @param causa
	 */
	public TSClienteError(Throwable causa) {
		super(causa);
	}

	/**
	 * Crea una nueva instancia de TSClienteError
	 * @param mensaje Valor del mensaje
	 * @param causa
	 */
	public TSClienteError(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}
	
	public String toString(){
		return super.toString();
	}
	

}
