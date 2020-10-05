package vehiculos;

public class Automovil extends Vehiculo {
	public int puestos;
	public static int cantidadAutomoviles=0;

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		cantidadAutomoviles++;
	}
	public int getcantidadAutomoviles() {
		return cantidadAutomoviles;
	}
	

}
