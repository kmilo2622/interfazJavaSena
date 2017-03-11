package app;

public class CuentaBancaria {
	
	private String nombre;
	private double numero;
	private double saldo;
	
	public CuentaBancaria() {
		
	}
	
	public CuentaBancaria(String nombre, double numero, double saldo) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [nombre=" + nombre + ", numero=" + numero + ", saldo=" + saldo + "]";
	}

}
