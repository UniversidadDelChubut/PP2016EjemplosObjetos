package practica1.barcos;

public class PruebaBarcos {


	public static void main(String[] args) {
	
		Barco barco1 = new Barco(1000, 82000, 1850, "Tritón");
		
		Barco barco2 = new Barco(800, 70000, 2100, "Costilla", 250, 28);
		

		System.out.println("El barco tiene una eslora de " + barco1.getEslora() + " centimetros");
		System.out.println("El barco tiene una eslora de " + barco2.getEslora() + " centimetros");
		
		
	}
}
