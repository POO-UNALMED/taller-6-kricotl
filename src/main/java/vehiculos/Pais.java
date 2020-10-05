package vehiculos;

import java.util.ArrayList;

public class Pais {
	public String nombre;
	static ArrayList <Pais> paises=new ArrayList <Pais>();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
		
	}
	public static Pais paisMasVendedor() {
		int contador=0;
		int mayor=0;
		Pais pais = null;
		for (int a=0; a<paises.size();a++) {
			for (int b=0; b<paises.size();b++) {
				if(paises.get(a)==paises.get(b)) {
					contador++;
				}
			}
			if (contador>mayor) {
				mayor=contador;
				pais=paises.get(a);
			}
			contador=0;
		}
		return pais;
		
	}
	
}