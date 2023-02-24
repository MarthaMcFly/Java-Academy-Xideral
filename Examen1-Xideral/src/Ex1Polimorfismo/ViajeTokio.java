package Ex1Polimorfismo;

public class ViajeTokio extends Viaje{

    int precio = 26000;
    String duracion = "14 días";
    int numViajeros;

    //sobreescribimos los métodos
    void getCotizacion(int numViajeros){
        double precioTotal = precio*numViajeros;
        System.out.println("El viaje a Tokio tiene un precio de " + precio);
        System.out.println("El precio del viaje a Tokio para " + numViajeros + " es de " +  precioTotal);
    }

    void reservarViaje(int numPasajeros, String titularReserva){
        System.out.println("Reserva éxitosa");
        System.out.println("Viaje a Tokio para " + numPasajeros +
                " personas a nombre de " + titularReserva);
    }
}
