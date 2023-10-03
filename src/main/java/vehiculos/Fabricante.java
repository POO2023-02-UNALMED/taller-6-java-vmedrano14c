package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int ventas = 0;
	public static ArrayList <Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public int getVentas() {
		return ventas;
	}
	
	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
	
	public void agregarVenta() {
		this.setVentas(this.getVentas()+ 1);
		this.pais.agregarVenta();
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante f = null;
		int mayorVentas = 0;
		for (Fabricante fabricante: fabricantes) {
			if(fabricante.getVentas()>mayorVentas) {
				f = fabricante;
				
			}
		}
		return f;
	}
}
