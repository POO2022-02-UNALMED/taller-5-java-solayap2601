package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado= new ArrayList<Reptil>();
	public static int  iguanas = 0;
	public static int serpientes = 0;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		totalAnimales++;
		this.colorEscamas = colorEscamas;	
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public Reptil() {
		totalAnimales++;
		listado.add(this);
	}
	
	public static int cantidadReptiles () {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas++;
		return new Reptil(nombre, edad, "humedal", genero, "verde", 3 );
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes++;
		return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	}

	public static void setListado(ArrayList<Reptil> niu) {
		listado = niu;
	}
	
	public static ArrayList<Reptil> getListado(){
		return listado;
	}
	
	public void setColorEscamas(String p) {
		colorEscamas = p;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setLargoCola(int p) {
		largoCola = p;
	}
	
	public int getLargoCola() {
		return largoCola;
	}
}
