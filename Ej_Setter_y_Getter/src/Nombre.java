
// Objeto llamado Nombre
public class Nombre {
	String nombre;

	// Constructor
	public Nombre(String ViejoNombre) {
		this.nombre = ViejoNombre;
	}

	// Devuelve el nombre Almacenado
	public String getNombre() {
		return nombre;
	}
	
	// Modifica el nombre(NuevoNombre) y lo guardamos en nombre
	public void setNombre(String NuevoNombre) {
		this.nombre = NuevoNombre;
	}
}
