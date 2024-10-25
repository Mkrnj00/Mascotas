package cl.duoc.matiacornejoc;

public abstract class Mascota {
    private String codigo;
    private boolean requiereSupervision;
    private String nombre;
    private int edad;
    private int dias;
    private int peso;

    public abstract void mostrarInformacion();

    public Mascota(String codigo, boolean requiereSupervision,String nombre,int edad,int dias,int peso) {
        this.codigo = codigo;
        this.requiereSupervision = requiereSupervision;
        this.nombre = nombre;
        this.edad = edad;
        this.dias = dias;
        this.peso = peso;
    }

    public String getCodigo() {
        return codigo;
    }
    public boolean requiereSupervision() {
        return requiereSupervision;
    }
    public String getNombre(){
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDias() {
        return dias;
    }

    public int getPeso() {
        return peso;
    }
    
    
}
