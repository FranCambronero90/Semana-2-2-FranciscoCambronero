/**
 * 
 */
package com.ucreativa;

/**
 * @author Fran
 *
 */
public class Televisor {

	private String Brand;
	private String Inches;
	private String Smart;
	
	// Getter & Setter
	public String getBrand() {
		return Brand;
	}

	public void setBrand(String Brand) {
		this.Brand = Brand;
	}
	
	public String getInches() {
		return Inches;
	}

	public void setInches(String Inches) {
		this.Inches = Inches;
	}

	public String getSmart() {
		return Smart;
	}

	public void setSmart(String smart) {
		this.Smart = smart;
	}
	
	/**
	 * Constructor
	 */
	public Televisor(String Brand, String Inches, String Smart) {
		this.Brand = Brand;
		this.Inches = Inches;
		this.Smart = Smart;
	}
	
	@Override
	public String toString() {
		return "Televisor: Marca = " + Brand + ", Pulgadas = " + Inches + ", Smart? = " + Smart;

	}

}
