package mx.edu.utng;
public class RepasoArreglos{

	public static void main(String[] args){
		System.out.println("Manejando Arreglos");

		String[] nombre = new String[10];
		int edades[]= {20,21,22,23};

		System.out.println("Tamaño "+nombre.length);
		System.out.println("Edades "+edades.length);

		//Indices 
		nombre[0] = "Juan Alberto";
		nombre[11] = "Juan Felipe";
	}
}