package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public Zoologico() {	
	}
	
	public void setNombre(String name) {
		nombre = name;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setUbicacion(String ubi) {
		ubicacion = ubi;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void setZonas(ArrayList<Zona> loc) {
		zonas = loc;
	}
	public ArrayList<Zona> getZona(){
		return zonas;
	}
	
	public void agregarZonas(Zona loc) {
		zonas.add(loc);
	}
	
	public int cantidadTotalAnimales() {
		int a = 0;
		for (Zona i:zonas) {
			a += i.cantidadAnimales();
		}
		return a;			
	}
}
	


