import java.util.Scanner;

public class CalculadoraVueltoBilletesIA {
	public static void main(String[] args) {

		// Crear objeto Scanner para leer la entrada del usuario
		Scanner entrada = new Scanner(System.in);

		// Pedir al usuario el monto de la compra
		System.out.print("Ingrese el monto de la compra: ");
		int montoCompra = entrada.nextInt();

		// Pedir al usuario el monto entregado al vendedor
		System.out.print("Ingrese el monto entregado al vendedor: ");
		int montoEntregado = entrada.nextInt();

		// Calcular el vuelto
		int vuelto = montoEntregado - montoCompra;

		// Calcular la cantidad de billetes necesarios para cada denominación
		int billetes1000 = vuelto / 1000;
		vuelto = vuelto % 1000;
		int billetes500 = vuelto / 500;
		vuelto = vuelto % 500;
		int billetes200 = vuelto / 200;
		vuelto = vuelto % 200;
		int billetes100 = vuelto / 100;
		vuelto = vuelto % 100;
		int billetes50 = vuelto / 50;
		vuelto = vuelto % 50;
		int billetes20 = vuelto / 20;
		vuelto = vuelto % 20;
		int billetes10 = vuelto / 10;

		// Mostrar el resultado al usuario
		System.out.println("El vuelto es: ");
		if(billetes1000 > 0) {
			System.out.println(billetes1000 + " billetes de 1000");
		}			
		if(billetes500 > 0)
			System.out.println(billetes500 + " billetes de 500");
		if(billetes200 > 0)
			System.out.println(billetes200 + " billetes de 200");
		if(billetes100 > 0)
			System.out.println(billetes100 + " billetes de 100");
		if(billetes50 > 0)
			System.out.println(billetes50 + " billetes de 50");
		if(billetes20 > 0)
			System.out.println(billetes20 + " billetes de 20");
		if(billetes10 > 0)
			System.out.println(billetes10 + " billetes de 10");
		
		entrada.close();
	}
}
