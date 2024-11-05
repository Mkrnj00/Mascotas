
package cl.duoc.matiacornejoc;

public class Conejo extends Mascota {
    private String dieta;

    public Conejo(String codigo, boolean requiereSupervision, String nombre, String dieta,int edad,int dias,int peso) {
        super(codigo, requiereSupervision, nombre,edad,dias,peso);
        this.dieta = dieta;
    }

    public String getDieta() {
        return dieta;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Conejo - Codigo: " + getCodigo() + ", Nombre: " + getNombre() +
                           ", Dieta: " + dieta + ", Requiere Supervision: " + requiereSupervision()+",edad(años): "+getEdad()+",peso(kg): "+ getPeso()+ ",dias en el hotel: "+getDias());
    }
}
