package cl.duoc.matiacornejoc;

import java.util.ArrayList;

public class Hotel {
    private String nombre;
    ArrayList<Mascota> mascotas; 
    private ArrayList<Habitacion> habitaciones; 

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.mascotas = new ArrayList<>();
        this.habitaciones = new ArrayList<>(); 
    }

    public boolean ingresarMascota(Mascota mascotaIngresada) {
        for (Mascota m : mascotas) {
            if (m.getCodigo().equals(mascotaIngresada.getCodigo())) {
                System.out.println("La mascota con el codigo " + mascotaIngresada.getCodigo() + " ya está en el hotel.");
                return false;
            }
        }
        mascotas.add(mascotaIngresada);
        System.out.println("Mascota agregada correctamente.");
        return true;
    }

    public void listarMascotas() {
        if (mascotas.isEmpty()) {
            System.out.println("No hay mascotas alojadas");
        } else {
            System.out.println("Listado de mascotas en el hotel " + nombre + ":");
            for (Mascota m : mascotas) {
                m.mostrarInformacion();
            }
        }
    }

    public int cantidadMascotas() {
        return mascotas.size();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion); 
        System.out.println("Habitacion " + habitacion.getNumero() + " agregada al hotel.");
    }

    public void mostrarDatosHotel() {
        System.out.println("Datos del Hotel: " + nombre);
        System.out.println("Habitaciones Registradas: " + habitaciones.size());
    }

    public void listarHabitacionesDisponibles() {
        System.out.println("Habitaciones disponibles en el hotel " + nombre + ":");
        boolean hayDisponibles = false;
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.tieneDisponibilidad()) {
                System.out.println("Habitacion " + habitacion.getNumero() + " esta disponible.");
                hayDisponibles = true;
            }
        }
        if (!hayDisponibles) {
            System.out.println("No hay habitaciones disponibles.");
        }
    }

    public boolean registrarHuesped(Mascota mascota, int numeroHabitacion) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numeroHabitacion) {
                return habitacion.agregarMascota(mascota);
            }
        }
        System.out.println("Habitacion no disponible o incorrecta.");
        return false; 
    }

    public void retirarHuesped(Mascota mascota, int numeroHabitacion) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numeroHabitacion) {
                habitacion.retirarMascota(mascota);
                return;
            }
        }
        System.out.println("Habitacion no encontrada o la mascota no esta en esa habitacion.");
    }
}


