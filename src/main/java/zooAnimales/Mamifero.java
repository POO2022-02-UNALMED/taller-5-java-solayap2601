package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado= new ArrayList<Mamifero>();
	public static int  caballos = 0;
	public static int leones = 0;
	private Boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, Boolean pelaje, int patas) {
		new Animal( nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;	
		listado.add(this);
	}
	
	public Mamifero() {
		new Animal();
		listado.add(this);
	}
	
	public static int cantidadMamiferos () {
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos++;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		leones++;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
	}

	public static void setListado(ArrayList<Mamifero> niu) {
		listado = niu;
	}
	
	public static ArrayList<Mamifero> getListado(){
		return listado;
	}
	
	public void setPelaje(Boolean p) {
		pelaje = p;
	}
	
	public Boolean isPelaje() {
		return pelaje;
	}
	
	public void setPatas(int p) {
		patas = p;
	}
	
	public int getPatas() {
		return patas;
	}
}
