package Ex1Polimorfismo;

public class ViajeNewYork extends Viaje{
    int precio = 15000;
    String duracion = "8 días";
    int numViajeros;

    //sobreescribimos los métodos
    void getCotizacion(int numViajeros){
        double precioTotal = precio*numViajeros;
        System.out.println("El precio del viaje a Nueva York para " + numViajeros + " es de " +  precioTotal);
    }

    void reservarViaje(int numPasajeros, String titularReserva){
        System.out.println("Reserva éxitosa");
        System.out.println("Viaje a Nueva York para " + numPasajeros +
                " personas a nombre de " + titularReserva);
    }
}
