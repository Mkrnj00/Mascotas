package cl.duoc.matiacornejoc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Instanciar un hotel
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel("AirbnbPet");

        // Agregar 3 perros al hotel
        hotel.ingresarMascota(new Perro("P631", true, "Rex", true, 45, 16, 7));
        hotel.ingresarMascota(new Perro("P870", false, "Guardian", true, 33, 2, 25));
        hotel.ingresarMascota(new Perro("P663", true, "Simon", true, 10, 9, 11));

        // Agregar 2 gatos al hotel
        hotel.ingresarMascota(new Gato("G999", true, "Michi", "Siames", 4, 5, 11));
        hotel.ingresarMascota(new Gato("G123", false, "Gatofloo", "Persa", 5, 8, 10));

        // Agregar 2 conejos al hotel
        hotel.ingresarMascota(new Conejo("C888", true, "Vegeta", "Zanahorias", 1, 1, 3));
        hotel.ingresarMascota(new Conejo("C007", false, "Goku", "Semillas", 1, 2, 5));

        boolean salir = false;
        while (!salir) {
            System.out.println("\n****BIENVENIDO****:");
            System.out.println("1. Datos del Hotel");
            System.out.println("2. Agregar Habitacion");
            System.out.println("3. Habitaciones con Disponibilidad");
            System.out.println("4. Registrar Huesped (debes agregar habitacion primero) ");
            System.out.println("5. Retirar Huesped");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    hotel.mostrarDatosHotel();
                    hotel.listarMascotas();
                    hotel.cantidadMascotas();
                    break;

                case 2:
                    System.out.print("Ingrese el numero de la habitacion: ");
                    int numeroHabitacion = scanner.nextInt();
                    System.out.print("Ingrese la capacidad de la habitacion: ");
                    int capacidad = scanner.nextInt();
                    hotel.agregarHabitacion(new Habitacion(numeroHabitacion, capacidad));
                    break;

                case 3:
                    hotel.listarHabitacionesDisponibles();
                    break;

                case 4:
                    System.out.print("Ingrese el tipo de mascota (Perro/Gato/Conejo): ");
                    String tipoMascota = scanner.nextLine().toLowerCase();
                    System.out.print("Ingrese el código de la mascota: ");
                    String codigoMascota = scanner.nextLine();
                    System.out.print("Ingrese el nombre de la mascota: ");
                    String nombreMascota = scanner.nextLine();
                    System.out.print("Ingrese si requiere supervision (true/false): ");
                    boolean requiereSupervision = scanner.nextBoolean();
                    scanner.nextLine(); 
                    System.out.print("Ingrese el peso de la mascota: ");
                    int peso = scanner.nextInt();
                    System.out.print("Ingrese la edad de la mascota: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese los días de alojamiento: ");
                    int diasAlojamiento = scanner.nextInt();
                    scanner.nextLine(); 

                    Mascota mascota = null;
                    switch (tipoMascota) {
                        case "perro":
                            System.out.print("¿Ha paseado? (true/false): ");
                            boolean activo = scanner.nextBoolean();
                            mascota = new Perro(codigoMascota, requiereSupervision, nombreMascota, activo, peso, edad, diasAlojamiento);
                            break;

                        case "gato":
                            System.out.print("Ingrese el pedigri del gato: ");
                            String pedigree = scanner.nextLine();
                            mascota = new Gato(codigoMascota, requiereSupervision, nombreMascota, pedigree, peso, edad, diasAlojamiento);
                            break;

                        case "conejo":
                            System.out.print("Ingrese la dieta del conejo: ");
                            String dieta = scanner.nextLine();
                            mascota = new Conejo(codigoMascota, requiereSupervision, nombreMascota, dieta, peso, edad, diasAlojamiento);
                            break;

                        default:
                            System.out.println("Tipo de mascota no valido.");
                            break;
                    }

                    if (mascota != null) {
                        System.out.print("Ingrese el numero de la habitación para registrar a la mascota: ");
                        int numHabitacion = scanner.nextInt();
                        hotel.registrarHuesped(mascota, numHabitacion);
                    }
                    break;

                case 5:
                    System.out.print("Ingrese el codigo de la mascota a retirar: ");
                    String codigoRetiro = scanner.nextLine();
                    System.out.print("Ingrese el numero de la habitacion: ");
                    int numeroHabitacionRetiro = scanner.nextInt();
                    Mascota mascotaRetiro = null;
                    for (Mascota m : hotel.mascotas) {
                        if (m.getCodigo().equals(codigoRetiro)) {
                            mascotaRetiro = m;
                            break;
                        }
                    }

                    if (mascotaRetiro != null) {
                        hotel.retirarHuesped(mascotaRetiro, numeroHabitacionRetiro);
                    } else {
                        System.out.println("Mascota no encontrada.");
                    }
                    break;

                case 6:
                    salir = true;
                    System.out.println("Adiós...");
                    break;

                default:
                    System.out.println("no valido.");
                    break;
            }
        }

        scanner.close(); 
    }
}

