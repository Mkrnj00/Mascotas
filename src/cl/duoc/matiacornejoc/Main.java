package cl.duoc.matiacornejoc;

public class Main {

    public static void main(String[] args) {

        // Instanciar un hotel
        Hotel hotel = new Hotel("AirbnbPet");

        // Agregar 3 perros al hotel
        hotel.ingresarMascota(new Perro("P631", true, "Rex",true,45,16,7) );
        hotel.ingresarMascota(new Perro("P870", false, "Guardian",true,33,2,25) );
        hotel.ingresarMascota(new Perro("P663", true, "Simon",true,10,9,11) );

        // Agregar 2 gatos al hotel
        hotel.ingresarMascota(new Gato("G999", true, "michi", "Siames",4,5,11));
        hotel.ingresarMascota(new Gato("G123", false, "gatofloo", "Persa",5,8,10));

        // Agregar 2 conejos al hotel
        hotel.ingresarMascota(new Conejo("C888", true, "Vegeta", "Zanahorias",1,1,3));
        hotel.ingresarMascota(new Conejo("C007", false, "Goku", "Semillas",1,2,5));

        // Mostrar la información de todas las mascotas en el hotel
        System.out.println("Información de todas las mascotas en el hotel:");
        hotel.listarMascotas();

        // Mostrar el número total de mascotas en el hotel
        System.out.println("Número total de mascotas en el hotel: " + hotel.cantidadMascotas());
    }
}


