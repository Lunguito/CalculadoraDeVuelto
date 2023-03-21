import javax.swing.JOptionPane;

public class master {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
