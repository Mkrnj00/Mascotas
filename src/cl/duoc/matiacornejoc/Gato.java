
package cl.duoc.matiacornejoc;
public class Gato extends Mascota {
    private String pedigree;

    public Gato(String codigo, boolean requiereSupervision, String nombre, String pedigree,int edad,int dias,int peso) {
        super(codigo, requiereSupervision, nombre,edad,dias,peso);
        this.pedigree = pedigree;
    }

    public String getPedigree() {
        return pedigree;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Gato - Codigo: " + getCodigo() + ", Nombre: " + getNombre() + 
                           ", Pedigree: " + pedigree + ", Requiere Supervision: " + requiereSupervision()+",edad(años): "+getEdad()+",peso(kg): "+ getPeso()+ ",dias en el hotel: "+getDias());
    }
}
