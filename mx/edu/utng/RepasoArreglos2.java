package mx.edu.utng;
public class RepasoArreglos2{

	public static void main(String[] args){
		String[] nombres[] = new String[7][3];
		nombres[0][0] = "Jonathan Venancio";
		nombres[0][1] = "Aguilar Hernandez";
		nombres[0][2] = "18";

		nombres[1][0] = "José Emmanuel";
		nombres[1][1] = "Arredondo Escalante";
		nombres[1][2] = "22";

		nombres[2][0] = "Yaneli";
		nombres[2][1] = "Sanches Cardenas";
		nombres[2][2] = "19";

		System.out.println("--- Nombres ---");
		for(int i = 0; i < 3; i++){
			System.out.println(nombres[i][0]);
		}

		System.out.println("--- Apellidos ---");
		for(int i = 0; i < 3; i++){
			System.out.println(nombres[i][1]);
		}

		System.out.println("--- Edades ---");
		for(int i = 0; i < 3; i++){
			System.out.println(nombres[i][2]);
		}

	}
}