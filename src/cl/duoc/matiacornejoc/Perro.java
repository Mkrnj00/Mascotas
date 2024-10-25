package cl.duoc.matiacornejoc;

public class Perro extends Mascota {
    private boolean ejercicioDiario;

    // Constructor
    public Perro(String codigo, boolean requiereSupervision, String nombre, boolean ejercicioDiario,int edad,int dias,int peso) {
        super(codigo, requiereSupervision,nombre,edad,dias,peso);
        this.ejercicioDiario = ejercicioDiario;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Perro Código: " + getCodigo() + ", Requiere Supervisión: " + requiereSupervision() + ", Nombre: " + getNombre() + ", Ejercicio Diario: " + ejercicioDiario +",edad(años): "+getEdad()+",peso(kg): "+ getPeso()+ ",dias en el hotel: "+getDias());
    }
}
