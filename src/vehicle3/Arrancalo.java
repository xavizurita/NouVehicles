package vehicle3;

import java.util.Scanner;
import java.util.ArrayList;

public class Arrancalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectura = new Scanner(System.in);		//permitira la entrada de datos por consola del usuario
		Scanner lectura2 = new Scanner(System.in);
		Scanner lectura3 = new Scanner(System.in);
		Car ObjCar[] = new Car[10];							
		Bike ObjBike[] = new Bike[10];
		String plate = "", brand = "", color = "", brandWheel = "";			
		int resposta=0;
		Double diameterDavantDreta, diameterDavantEsquerra, diameterDarreraDreta, diameterDarreraEsquerra;
		Double diameterDavant, diameterDarrera;
		
		while (resposta !=1 && resposta !=2 && resposta !=3) {			//bucle principal, no permite salir de la aplicacion sin pasar por aqui
			System.out.println("-- Pulsa el número de la opción elegida  -- \n1.- Car     \n2.- Bike      \n3.- End");
			resposta = Integer.parseInt(lectura2.nextLine());			// obtiene la elecion del usuario
			switch(resposta) {											// bucle correspondiente unicamente al apartado de CAR
			
				case 1: System.out.println("(" + resposta + ") - - - - A R E A    C A R - - - -"+ "(" + resposta + ")");
					int contador = 0;	
					int bucleEntrada1=1;
					while (bucleEntrada1 == 1) {
						boolean matCorrecta = true;
						
						while (matCorrecta) {							//se mantendra en est bucle mientras el usuario no ponga una matricula correcta
							System.out.println("dime la MATRICULA formato: AAA9999 o AA9999");
							plate = lectura.nextLine();
							if (Metodes.contarNumeros(plate)) {			//se llama a los metodos para ver si los numeros i letras son las que deben ser
								if (Metodes.contarLletres(plate)) {
					  				matCorrecta = false;
								}else {
									System.out.println("matrícula INCORRECTA, recuerda, debe tener 2 o 3 letras");
									matCorrecta = true;
								}
							}else {
								System.out.println("matrícula INCORRECTA, recuerda, debe tener 4 nuúmeros i/o 2 o 3 letras ");
							}
						}
						
						System.out.println("dime la MARCA: ");
						brand = lectura.nextLine();
						System.out.println("dime el COLOR: ");
						color = lectura.nextLine();
						ObjCar[contador]= new Car(plate, brand, color);
						contador ++;
	
						ArrayList<Wheel> rodes = new ArrayList<Wheel>();		//creem l'aarylist on guardarem totes els dades a tractar
						System.out.println("Marca de la Roda: ");
						brandWheel = lectura.nextLine();
						
						do {
							System.out.println("Diametre de la Roda DAVANT DRETA");					// cada uno de los DO siguientes controla que los datos de diametro de las rueds sean los correctos
							diameterDavantDreta = Double.parseDouble(lectura.nextLine());
							if (diameterDavantDreta < 0.4 || diameterDavantDreta > 4) {
								System.out.println("Error en el Diametro pon un nuevo valor: ");
							}
						} while (diameterDavantDreta < 0.4 || diameterDavantDreta > 4);
						do {
							System.out.println("Diametre de la Roda DAVANT ESQUERRA");
							diameterDavantEsquerra = Double.parseDouble(lectura.nextLine());
							if (diameterDavantEsquerra < 0.4 || diameterDavantEsquerra > 4) {
								System.out.println("Error en el Diametro pon un nuevo valor: ");
							}
						} while (diameterDavantEsquerra < 0.4 || diameterDavantEsquerra > 4);
						do {
							System.out.println("Diametre de la Roda DARRERA DRETA");
							diameterDarreraDreta = Double.parseDouble(lectura.nextLine());
							if (diameterDarreraDreta < 0.4 || diameterDarreraDreta > 4) {
								System.out.println("Error en el Diametro pon un nuevo valor: ");
							}
						} while (diameterDarreraDreta < 0.4 || diameterDarreraDreta > 4);
						do {
							System.out.println("Diametre de la Roda DARRERA ESQUERRA");
							diameterDarreraEsquerra = Double.parseDouble(lectura.nextLine());
							if (diameterDarreraEsquerra < 0.4 || diameterDarreraEsquerra > 4) {
								System.out.println("Error en el Diametro pon un nuevo valor: ");
							}
						} while (diameterDarreraEsquerra < 0.4 || diameterDarreraEsquerra > 4);
						Wheel totalRodes = new Wheel(brandWheel, diameterDavantDreta, diameterDavantEsquerra, diameterDarreraDreta, diameterDarreraEsquerra );
						rodes.add(totalRodes);	
						System.out.println("Matrícula ==> " + plate + " " + totalRodes);
						System.out.println("1.- Pulsa 1 per entrar mes Vehicles \n2.- Pulsa 2 per finalitzar entrades");
						bucleEntrada1 = Integer.parseInt(lectura2.nextLine());
					}	
					for (int hh=0; hh<contador; hh++) {		//una vez terminado de introducir todos los valores, mostramos todos los valores introducidos en este bucle
						System.out.println("Matricula ==> " + ObjCar[hh].getPlate() + " - - Marca ==> " + ObjCar[hh].getBrand() 
								+ "  - - Color ==> " + ObjCar[hh].getColor());
					}
					break;
					
				case 2:  System.out.println("(" + resposta + ") - - - - A R E A    B I K E - - - -"+ "(" + resposta + ")");
				int contador1 = 0;	
				int bucleEntrada2=1;
				while (bucleEntrada2 == 1) {					// bucle correspondiente unicamente al apartado de BIKE
					boolean matCorrecta = true;
					while (matCorrecta) {
						System.out.println("dime la MATRICULA: AAA9999 o AA9999");
						plate = lectura.nextLine();
						if (Metodes.contarNumeros(plate)) {
							if (Metodes.contarLletres(plate)) {
				  				matCorrecta = false;
							}else {
								System.out.println("matrícula INCORRECTA, recuerda, debe tener 2 o 3 letras");
								matCorrecta = true;
							}
						}else {
							System.out.println("matrícula INCORRECTA, recuerda, debe tener 4 nuúmeros i/o 2 o 3 letras ");
						}
					}
					System.out.println("dime la MARCA: ");
					brand = lectura.nextLine();
					System.out.println("dime el COLOR: ");
					color = lectura.nextLine();
					ObjBike[contador1] = new Bike(plate, brand, color);		//almacenamos los datos de marca y color de la BIKE
					contador1 ++;											// contamos el numero de unidades introducidas
					ArrayList<Wheel> rodes = new ArrayList<Wheel>();
					System.out.println("Marca de la Roda: ");				
					brandWheel = lectura.nextLine();
					do {
						System.out.println("Diametre de la Roda DAVANT");
						diameterDavant = Double.parseDouble(lectura.nextLine());
						if (diameterDavant < 0.4 || diameterDavant > 4) {
							System.out.println("Error en el Diametro pon un nuevo valor: ");
						}
					} while (diameterDavant < 0.4 || diameterDavant > 4);
					do {
						System.out.println("Diametre de la Roda DARRERA");
						diameterDarrera = Double.parseDouble(lectura.nextLine());
						if (diameterDarrera < 0.4 || diameterDarrera > 4) {
							System.out.println("Error en el Diametro pon un nuevo valor: ");
						}
					} while (diameterDarrera < 0.4 || diameterDarrera > 4);
					Wheel totalRodes = new Wheel(brandWheel, diameterDavant, diameterDarrera);	//almacenamos los datos recogidos de la marca diametro delantero i trasero de Rueda
					rodes.add(totalRodes);	
					System.out.println("MatriculaXXXX2 ==> " + plate + " " + totalRodes.toStringBike());
					System.out.println("1.- Pulsa 1 per entrar mes Bikes \n2.- Pulsa 2 per finalitzar entrades");
					bucleEntrada2 = Integer.parseInt(lectura3.nextLine());
				}	
				for (int hh=0; hh<contador1; hh++) {			//una vez terminado de introducir todos los valores, mostramos todos los valores introducidos en este bucle
					System.out.println("Matricula ==> " + ObjBike[hh].getPlate() + " - - Marca ==> " + ObjBike[hh].getBrand() 
							+ "  - - Color ==> " + ObjBike[hh].getColor());
				}
					break;
					
				case 3:
					System.exit(0);		// opcion 3 que es la de salir del programa
					break;
					
				default:
					System.out.println("la Opcion elegida no existe ");
					break;
				}  // cierre del switch
		} // cierre de While principal
	}
}


/* a diferencia de la version anterior, esta tiene varias modificaciones al hilo de tu fedback que espero que cumpla
 * con lo que me pedias.
 * he tratado de comentar las partes más importantes y que , creo también, facilitarán el entendimiento del código
 * he tratado también de ajustarme lo más posible a las Best practices, o eso espero.
 * la verdad, elemetos redundantes tampoco es que haya visto muchos, pero.... si hay alguno más me puedes indicar donde esta?
 * he compactado i reducido el código a lo imprescindible, creo que ahora esta mucho mejor.
 * 
 * en cuanto a la sobreescritura del metodo que me sugerias ummm, espero haver hecho lo que me sugerias , además 
 * he creado una nueva clase en la que he añadido un par de metodos, que además ayudarán a reducir el código del Main
 * Espero que la modificaciones esten a la altura, ya me dirás.
 * 
 *  
 *  En El ejercicio de dominio de videos, vaya desastre, vamos a ver que puedo hacer con el, tengo varias preguntas al respecto.
 *  en tu feedback, dices literalmente "Cuando me doy de alta como usuario y doy de alta ..." y no entiendo a que te refieres...
 *  el apartado M7.2 "NO implementa de forma correcta el domini de classes.. " entiendo con eso que lo que quieres es qeu la mayor 
 *  parte posible del main lo incluya en una clase o unas class, bien organizado i agrupado por supuesto, es eso?,
 *  entiendo que el ultimo apartado donde dice que no cumple con las funcionalidades mínimas, tiene relación con todo lo anterior
 *  o hablamos de alguna cosa más? 
 * */
