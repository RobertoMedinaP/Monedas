import java.io.IOException;
import java.util.Scanner;

public class Menu {

    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() throws IOException, InterruptedException {
        int opcion;

        do {
            System.out.println("*************************************");
            System.out.println("Bienvenido al conversor de monedas:");
            System.out.println("Ingrese su opción:");
            System.out.println("1. Conversión de Euro a Dólar");
            System.out.println("2. Conversión de Dólar a Euro");
            System.out.println("3. Conversión de Peso Chileno a Euro");
            System.out.println("4. Conversión de Euro a Peso Chileno");
            System.out.println("5. Conversión de Peso Chileno a Peso Argentino");
            System.out.println("6. Conversión de Peso Argentino a Peso Chileno");
            System.out.println("7. Salir");


            opcion = scanner.nextInt();
            scanner.nextLine(); // salto de linea

            String moneda1, moneda2;
            double monto, tasaDeCambio, montoConvertido;

            switch (opcion) {
                case 1:
                    moneda1="EUR";
                    moneda2="USD";
                    System.out.println("Ingrese el monto");
                    monto = Double.parseDouble(scanner.nextLine());
                    tasaDeCambio = Apiconexion.obtenerTasaDeCambio(moneda1, moneda2, monto);
                    montoConvertido = monto * tasaDeCambio;
                    System.out.println(monto +" "+ moneda1 +" " + " son " + montoConvertido+ " " + moneda2);
                    break;
                case 2:
                    moneda1="USD";
                    moneda2="EUR";
                    System.out.println("Ingrese el monto");
                    monto = Double.parseDouble(scanner.nextLine());
                    tasaDeCambio = Apiconexion.obtenerTasaDeCambio(moneda1, moneda2, monto);
                    montoConvertido = monto * tasaDeCambio;
                    System.out.println(monto +" "+ moneda1 +" " + " son " + montoConvertido+ " " + moneda2);
                    break;
                case 3:
                    moneda1="CLP";
                    moneda2="EUR";
                    System.out.println("Ingrese el monto");
                    monto = Double.parseDouble(scanner.nextLine());
                    tasaDeCambio = Apiconexion.obtenerTasaDeCambio(moneda1, moneda2, monto);
                    montoConvertido = monto * tasaDeCambio;
                    System.out.println(monto +" "+ moneda1 +" " + " son " + montoConvertido+ " " + moneda2);
                    break;
                case 4:
                    moneda1="EUR";
                    moneda2="CLP";
                    System.out.println("Ingrese el monto");
                    monto = Double.parseDouble(scanner.nextLine());
                    tasaDeCambio = Apiconexion.obtenerTasaDeCambio(moneda1, moneda2, monto);
                    montoConvertido = monto * tasaDeCambio;
                    System.out.println(monto +" "+ moneda1 +" " + " son " + montoConvertido+ " " + moneda2);
                    break;
                case 5:
                    moneda1="CLP";
                    moneda2="ARS";
                    System.out.println("Ingrese el monto");
                    monto = Double.parseDouble(scanner.nextLine());
                    tasaDeCambio = Apiconexion.obtenerTasaDeCambio(moneda1, moneda2, monto);
                    montoConvertido = monto * tasaDeCambio;
                    System.out.println(monto +" "+ moneda1 +" " + " son " + montoConvertido+ " " + moneda2);
                    break;
                case 6:
                    moneda1="ARS";
                    moneda2="CLP";
                    System.out.println("Ingrese el monto");
                    monto = Double.parseDouble(scanner.nextLine());
                    tasaDeCambio = Apiconexion.obtenerTasaDeCambio(moneda1, moneda2, monto);
                    montoConvertido = monto * tasaDeCambio;
                    System.out.println(monto +" "+ moneda1 +" " + " son " + montoConvertido+ " " + moneda2);
                    break;
                case 7:
                    System.out.println("¡Adios! Gracias por usar el conversor de monedas");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 7);
    }
}

