
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Llamamos al Objeto, iniciamos el valor
		Nombre miNombre = new Nombre("Juan");
		
//		Devolvemos el nombre Guardado (getter)
		System.out.println(miNombre.getNombre());
		
//		Modificamos el nombre (setter)
		miNombre.setNombre("Pedro");
		
//		Devolvemos el nombre Guardado (getter)
		System.out.println(miNombre.getNombre());
	}
}
