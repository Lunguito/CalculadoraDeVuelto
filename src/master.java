import javax.swing.JOptionPane;

public class master {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// billetes de 10, 20, 50, 100, 200, 500, 1000
		int montoRecibido, montoCompra, vuelto;

		String in = JOptionPane.showInputDialog("Ingrese el monto de la compra");
		montoCompra = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Ingrese el monto recibido");
		montoRecibido = Integer.parseInt(in);

		vuelto = montoRecibido - montoCompra;

		// Calculo la cantidad de billetes necesarios para cada denominación
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

		// informo
		System.out.println("El vuelto es: ");
		if (billetes1000 > 0)
			System.out.println(billetes1000 + " billetes de 1000");
		if (billetes500 > 0)
			System.out.println(billetes500 + " billetes de 500");
		if (billetes200 > 0)
			System.out.println(billetes200 + " billetes de 200");
		if (billetes100 > 0)
			System.out.println(billetes100 + " billetes de 100");
		if (billetes50 > 0)
			System.out.println(billetes50 + " billetes de 50");
		if (billetes20 > 0)
			System.out.println(billetes20 + " billetes de 20");
		if (billetes10 > 0)
			System.out.println(billetes10 + " billetes de 10");
	}

	void Metodo1() {
		int montoRecibido;
		int montoTotal;

		int[] billetes = new int[7];
		billetes[0] = 10;
		billetes[1] = 20;
		billetes[2] = 50;
		billetes[3] = 100;
		billetes[4] = 200;
		billetes[5] = 500;
		billetes[6] = 1000;

		String str = "";
		do {
			str = JOptionPane.showInputDialog("Ingrese el monto de la compra");
			montoTotal = Integer.parseInt(str);

			str = JOptionPane.showInputDialog("Ingrese el monto recibido");
			montoRecibido = Integer.parseInt(str);

			int resta, aDevolver;
			System.out.println("Su vuelto es: ");
			if (montoTotal <= montoRecibido) {
				do {
					aDevolver = montoRecibido - montoTotal;

					if (aDevolver >= 1000) {
						System.out.println("$ " + billetes[6]);
					} else if (aDevolver > 500 && aDevolver <= 1000) {
						System.out.println("$ " + billetes[5]);
					} else if (aDevolver > 200 && aDevolver <= 500) {
						System.out.println("$ " + billetes[4]);
					} else if (aDevolver > 100 && aDevolver <= 200) {
						System.out.println("$ " + billetes[3]);
					} else if (aDevolver > 50 && aDevolver <= 100) {
						System.out.println("$ " + billetes[2]);
					} else if (aDevolver > 20 && aDevolver <= 50) {
						System.out.println("$ " + billetes[1]);
					} else if (aDevolver > 10 && aDevolver <= 20) {
						System.out.println("$ " + billetes[0]);
					} else {
						System.out.println("$ " + billetes[0]);
					}
					// montoRecibido -= resta;
				} while (aDevolver > 0);
			} else {
				System.out.println("El monto recibido no cubre la compra");
			}

		} while (str.toLowerCase().equals("fin"));
	}
}
