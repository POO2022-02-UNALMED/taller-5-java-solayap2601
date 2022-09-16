package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado= new ArrayList<Anfibio>();
	public static int  ranas = 0;
	public static int salamandras = 0;
	private String colorPiel;
	private Boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, Boolean venenoso) {
		Animal( nombre, edad, habitat, genero);
		this.nombre = nombre;
		this.edad = edad;
		this.habitad = habitad;
		this.genero = genero;
		this.colorPiel = colorPiel;	
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public Anfibio() {
		Animal();
		listado.add(this);
	}
	
	public static int cantidadAnfibios () {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas++;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true );
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras++;
		return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
	}

	public static void setListado(ArrayList<Anfibio> niu) {
		listado = niu;
	}
	
	public static ArrayList<Anfibio> getListado(){
		return listado;
	}
	
	public void setColorPiel(String p) {
		colorPiel = p;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public void setVenenoso(Boolean p) {
		venenoso = p;
	}
	
	public Boolean isVenenoso() {
		return venenoso;
	}

}
