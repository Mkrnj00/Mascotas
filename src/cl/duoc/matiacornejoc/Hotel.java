package cl.duoc.matiacornejoc;

import java.util.ArrayList;

public class Hotel {
    private String nombre;
    private ArrayList<Mascota> mascotas;

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.mascotas = new ArrayList<>();
    }

    public boolean ingresarMascota(Mascota mascotaIngresada) {
        for (Mascota m : mascotas) {
            if (m.getCodigo().equals(mascotaIngresada.getCodigo())) {
                System.out.println("La mascota con el código " + mascotaIngresada.getCodigo() + " ya está alojada.");
                return false;
            }
        }
        mascotas.add(mascotaIngresada);
        System.out.println("Mascota agregada exitosamente.");
        return true;
    }

    public void listarMascotas() {
        if (mascotas.isEmpty()) {
            System.out.println("No hay mascotas alojadas en el hotel.");
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
}


