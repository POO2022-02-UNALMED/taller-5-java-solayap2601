package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado= new ArrayList<Pez>();
	public static int  salmones = 0;
	public static int bacalaos = 0;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		Animal( nombre, edad, habitat, genero);
		this.nombre = nombre;
		this.edad = edad;
		this.habitad = habitad;
		this.genero = genero;
		this.colorEscamas = colorEscamas;	
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	public Pez() {
		Animal();
		listado.add(this);
	}
	
	public static int cantidadPeces () {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "nadar";
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones++;
		return new Pez(nombre, edad, "oceano", genero, "rojo", 6 );
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos++;
		return new Pez(nombre, edad, "jungla", genero, "gris", 6);
	}

	public static void setListado(ArrayList<Pez> niu) {
		listado = niu;
	}
	
	public static ArrayList<Pez> getListado(){
		return listado;
	}
	
	public void setColorEscamas(String p) {
		colorEscamas = p;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setCantidadAletas(int p) {
		cantidadAletas = p;
	}
	
	public int getCantidadAletas() {
		return cantidadAletas;
	}
}
