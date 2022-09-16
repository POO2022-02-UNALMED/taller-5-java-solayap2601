package gestion;

import java.util.ArrayList;

import zooAnimales.*;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales= new ArrayList<Animal>();
	
	public Zona( String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public Zona() {
		
	}
	
	
	public void setNombre(String name) {
		nombre = name;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setZoo(Zoologico z) {
		zoo = z;
	}
	
	public Zoologico getZoo() {
		return zoo;
	}
	
	public void setAnimales(ArrayList<Animal> an) {
		animales = an;
	}
	
	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	
	public void agregarAnimales(Animal an) {
		animales.add(an);	
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
}
	


