package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado= new ArrayList<Ave>();
	public static int  halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		Animal( nombre, edad, habitat, genero);
		this.nombre = nombre;
		this.edad = edad;
		this.habitad = habitad;
		this.genero = genero;
		this.colorPlumas = colorPlumas;	
		listado.add(this);
	}
	
	public Ave() {
		Animal();
		listado.add(this);
	}
	
	public static int cantidadAves () {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		halcones++;
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas++;
		return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
	}

	public static void setListado(ArrayList<Ave> niu) {
		listado = niu;
	}
	
	public static ArrayList<Ave> getListado(){
		return listado;
	}
	
	public void setcolorPlumas(String p) {
		colorPlumas = p;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	
	
}
