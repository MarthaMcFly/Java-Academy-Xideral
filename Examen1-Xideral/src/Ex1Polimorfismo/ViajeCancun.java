package Ex1Polimorfismo;

public class ViajeCancun extends Viaje{

    int precio = 9800;
    String duracion = "8 días";
    int numViajeros;


    void getCotizacion(int numViajeros){
        double precioTotal = precio*numViajeros;
        System.out.println("El precio del viaje a Cancun para " + numViajeros + " es de " +  precioTotal);
    }

    void reservarViaje(int numPasajeros, String titularReserva){
        System.out.println("Reserva éxitosa");
        System.out.println("Viaje a Cancun para " + numPasajeros +
                " personas a nombre de " + titularReserva);
    }
}
