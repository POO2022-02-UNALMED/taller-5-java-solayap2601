package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Animal {
	private static int totalAnimales = 0;
	private String nombre;
	private int edad;
	private String habitad;
	private String genero;
	private Zona zona;
	
	public Animal(String nombre, int edad, String habitad, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitad = habitad;
		this.genero = genero;
		totalAnimales++;
		
	}
	
	public Animal() {
		totalAnimales++;
	}
	
	public String movimiento () {
		return "desplazarse";
	}

	public String totalPorTipo() {
		return ("Mamiferos: " + Mamifero.cantidadMamiferos() + "\n"
				+ "Aves: " + Ave.cantidadAves() + "\n"
				+ "Reptiles: " + Reptil.cantidadReptiles() + "\n"
				+ "Peces: " + Pez.cantidadPeces() + "\n"
				+ "Anfibios: " + Anfibio.cantidadAnfibios());
	}

	public  String  toString() {
		String a="Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitad + " y mi genero es " + genero; 
		if(zona!=null) { a +=", la zona en la que me ubico es " + zona.getNombre() + ", en el " + zona.getZoo().getNombre();}
		return a;
	}

	public void setTotalAnimales(int tot) {
		totalAnimales = tot;
	}
	
	public int getTotalAnimales() {
		return totalAnimales;
	}
	
	public void setNombre(String name) {
		nombre = name;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEdad(int age) {
		edad = age;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setHabitad(String plc) {
		habitad = plc ;
	}
	
	public String getHabitad() {
		return habitad;
	}
	
	public void setGenero(String gen) {
		genero = gen;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setZona(Zona loc) {
		zona = loc;
	}
	
	public Zona getZona() {
		return zona;
	}
}
