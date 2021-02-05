package com.ucreativa;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Televisor Televisor1 = new Televisor("Samsung", "42'","Yes");
		
		System.out.println("Instancia1");
		System.out.println(Televisor1.toString());
		
		Telefono Telefono1 = new Telefono("Huawei", "P40","ICE");
		
		System.out.println("Instancia1");
		System.out.println(Telefono1.toString());
		
		Computadora Computadora1 = new Computadora("Sony", "Laptop","Negro");
		
		System.out.println("Instancia1");
		System.out.println(Computadora1.toString());
		
	}
	
	

}

