package vehicle3;

public class Metodes {
	public static boolean contarNumeros(String matricula) {		//pasamos el valor entrado por el usuario de la matricula para calcular si tiene el formato solicitado
//		int contarLetras = 0;
		int contarNumeros = 0;
		boolean matNumCorrecta;

		for (int hh=0; hh<matricula.length(); hh++) {
			if (Character.isDigit(matricula.charAt(hh)) == true) {
//				contarLetras ++;
//			}else {
				contarNumeros ++;
			}
		}
//		if ((contarNumeros == 4) && (contarLetras == 2 || contarLetras ==3)) { // es la amtricula de 4 numeros i 2 o 3 lletres?
		if (contarNumeros == 4)  {			//contiene la matricula y controla si tiene los 4 numeros que tienen que tener
			matNumCorrecta = true;
		}else {
//			System.out.println("MATRICULA INCORRECTA numero de lletres " + contarLetras +" numero de numeros " +contarNumeros);
			matNumCorrecta = false;
		}
		return matNumCorrecta;
	}
		
		public static boolean contarLletres(String matricula) {		//pasamos el valor entrado por el usuario de la matricula para calcular si tiene el formato solicitado
			int contarLetras = 0;
			boolean matLleCorrecta;

			for (int hh=0; hh<matricula.length(); hh++) {
				if (Character.isDigit(matricula.charAt(hh)) == false) {
					contarLetras ++;
				}
			}
			if ((contarLetras == 2 || contarLetras ==3)) { // es la amtricula de  2 o 3 lletres?
				matLleCorrecta = true;
			}else {
				matLleCorrecta = false;
			}
			return matLleCorrecta;	
		
	}

}
