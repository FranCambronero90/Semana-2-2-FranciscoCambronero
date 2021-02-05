/**
 * 
 */
package com.ucreativa;

/**
 * @author Fran
 *
 */
public class Computadora {

	private String Brand;
	private String Type;
	private String Color;
	
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
		return Color;
	}


	public void setProvider(String color) {
		Color = color;
	}


	/**
	 * Constructor 
	 */
	public Computadora(String Brand, String Type, String Color) {
		this.Brand = Brand;
		this.Type = Type;
		this.Color = Color;
	}

	@Override
	public String toString() {
		return "Computadora: Marca = " + Brand + ", Tipo = " + Type + ", Color = " + Color;

	}
}
