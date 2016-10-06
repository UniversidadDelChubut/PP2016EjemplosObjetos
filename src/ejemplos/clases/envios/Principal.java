package ejemplos.clases.envios;

public class Principal {
	
	public static void main(String[] args) {
		
		String tipoBiciTriciclo = "Triciclo";
		String tipoBiciBicicleta = "Bicicleta";
		
		Bicicleta bici1 = new Bicicleta(1, tipoBiciBicicleta);
		Bicicleta bici2 = new Bicicleta(2, tipoBiciTriciclo);
		
		System.out.println("Se creo la bici " + bici1.getNumero());
		System.out.println("Se creo la bici " + bici2.getNumero());
		
		Repartidor repartidor = new Repartidor("Toto", "f");
		
		System.out.println(repartidor.getNombre() + " " + repartidor.getSexo());
		
		
		Envio e1 = new Envio("San Martin y Cangallo", "San Lorenzo 218", 1, 2);
		Envio e2 = new Envio("Federicci 12", "Rivadavia 28", (float) 1.5, 2);
		
		System.out.println(e1.getNumero() + " " + e1.getOrigen() + " Estado: " + e1.getEstado());
		System.out.println(e2.getNumero() + " " + e2.getOrigen() + " Estado: " + e2.getEstado());
		
		System.out.println("Se asigna el paquete 1 para envio a toto");
		e1.asignarParaEnvio(repartidor, null);
		
		System.out.println(e1.getNumero() + " " + e1.getOrigen() + " Estado: " + e1.getEstado());
		System.out.println(e2.getNumero() + " " + e2.getOrigen() + " Estado: " + e2.getEstado());

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
