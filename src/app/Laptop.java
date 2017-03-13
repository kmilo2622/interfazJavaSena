package app;

public class Laptop {
	
	public static int cuenta = 0;
	
	private String marca;
	private String modelo;
	private int memoria;
	private double precio;
	
	public Laptop() {
	}
	
	public Laptop(String marca, String modelo, int memoria, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.memoria = memoria;
		this.precio = precio;
	}

	public Laptop(String marca, String modelo, int memoria, int precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.memoria = memoria;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getMemoria() {
		return memoria;
	}
	
	//Se hace lo necesario para que memoria pueda ser ejecutado como integer y double
	
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = (int) Math.floor(memoria);
	}

	public double getPrecio() {
		return precio;
	}
	
	//Ahora precio debe recibír tanto parámetros de int como double

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = (double) precio;
	}

	public static int getCuenta(int cuenta) {
		return cuenta + 1;
	}

	public static double getCuenta(double cuenta) {
		return cuenta + 1.0;
	}
	
		

}
