package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Animal {
	private static int totalAnimales = 0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
		
	}
	
	public Animal() {
		totalAnimales++;
	}
	
	public String movimiento () {
		return "desplazarse";
	}

	public static String totalPorTipo() {
		return ("Mamiferos: " + Mamifero.cantidadMamiferos() + "\n"
				+ "Aves: " + Ave.cantidadAves() + "\n"
				+ "Reptiles: " + Reptil.cantidadReptiles() + "\n"
				+ "Peces: " + Pez.cantidadPeces() + "\n"
				+ "Anfibios: " + Anfibio.cantidadAnfibios());
	}

	public String toString() {
		String retorno = "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es "
				+ genero;
		
		if(zona != null) {
			retorno += ", la zona en la que me ubico es " + zona +", en el " + zona.getZoo();
		}
		
		return retorno;
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
	
	public void setHabitat(String plc) {
		habitat = plc ;
	}
	
	public String getHabitat() {
		return habitat;
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
