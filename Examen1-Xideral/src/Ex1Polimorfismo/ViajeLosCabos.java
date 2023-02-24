package Ex1Polimorfismo;

public class ViajeLosCabos extends Viaje{
    int precio = 5600;
    String duracion = "7 días";
    int numViajeros;




    //sobreescribimos los métodos
    void getCotizacion(int numViajeros){
        double precioTotal = precio*numViajeros;
        System.out.println("El precio del viaje a Los Cabos para " + numViajeros + " es de " +  precioTotal);
    }

    void reservarViaje(int numPasajeros, String titularReserva){
        System.out.println("Reserva éxitosa");
        System.out.println("Viaje a Los cabos para " + numPasajeros +
                " personas a nombre de " + titularReserva);
    }
}
