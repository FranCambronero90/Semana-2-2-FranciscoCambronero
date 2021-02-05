/**
 * 
 */
package com.ucreativa;

/**
 * @author Fran
 *
 */
public class Telefono {

	private String Brand;
	private String Type;
	private String Provider;
	
	//Getter & Setter
	
	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public String getProvider() {
		return Provider;
	}


	public void setProvider(String provider) {
		Provider = provider;
	}


	/**
	 * Constructor 
	 */
	public Telefono(String Brand, String Type, String Provider) {
		this.Brand = Brand;
		this.Type = Type;
		this.Provider = Provider;
	}

	@Override
	public String toString() {
		return "Telefono: Marca = " + Brand + ", Tipo = " + Type + ", Provedor = " + Provider;

	}
}
