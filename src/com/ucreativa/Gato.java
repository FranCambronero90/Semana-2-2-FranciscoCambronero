/**
 * 
 */
package com.ucreativa;

/**
 * @author Fran
 *
 */
public class Gato {

	private String nombre;
	
	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Constructor
	 */
	public Gato(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + "]";
	}

}
