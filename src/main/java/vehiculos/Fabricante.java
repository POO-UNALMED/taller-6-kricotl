package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	public String nombre;
	public Pais pais;
	static ArrayList <Fabricante> fabricantes=new ArrayList <Fabricante>();
	
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
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.add(this);
		
	}
	public static Fabricante fabricaMayorVentas() {
		int contador=0;
		int mayor=0;
		Fabricante fabricante=null;
		for (int a=0; a<fabricantes.size();a++) {
			for (int b=0; b<fabricantes.size();b++) {
				if(fabricantes.get(a)==fabricantes.get(b)) {
					contador++;
				}
			}
			if (contador>mayor) {
				mayor=contador;
				fabricante=fabricantes.get(a);
			}
			contador=0;
		}
		return fabricante;
		
	}
}