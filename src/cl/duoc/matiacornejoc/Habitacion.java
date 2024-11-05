package cl.duoc.matiacornejoc;

import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private int numero;
    private int capacidad;
    private List<Mascota> mascotas;

    public Habitacion(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.mascotas = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public boolean agregarMascota(Mascota mascota) {
        if (mascotas.size() < capacidad) {
            mascotas.add(mascota);
            System.out.println("Mascota " + mascota.getNombre() + " agregada a la habitacion " + numero);
            return true;
        } else {
            System.out.println("No hay disponibilidad en la habitación " + numero);
            return false;
        }
    }

    public void retirarMascota(Mascota mascota) {
        if (mascotas.remove(mascota)) {
            System.out.println("Mascota " + mascota.getNombre() + " retorada de la habitación " + numero);
        } else {
            System.out.println("Mascota no encontrada en la habitación " + numero);
        }
    }

    public boolean tieneDisponibilidad() {
        return mascotas.size() < capacidad;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }
}
