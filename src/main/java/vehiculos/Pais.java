package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private int ventas;
	public static ArrayList<Pais> paises = new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getVentas() {
		return ventas;
	}
	
	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
	
	public void agregarVenta() {
		this.setVentas(this.getVentas() + 1);
	}
	
	public static Pais paisMasVendedor() {
		int mayorVentas = 0;
		Pais p = null;
		for(Pais pais: paises) {
			if (pais.getVentas()> mayorVentas) {
				mayorVentas = pais.getVentas();
				p = pais;
			}
		}
		return p;
	}
}
