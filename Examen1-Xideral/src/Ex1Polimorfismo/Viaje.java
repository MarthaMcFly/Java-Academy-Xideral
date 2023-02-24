package Ex1Polimorfismo;

public class Viaje {
    //atributos
    int precio;
    String duracion;
    int numViajeros;

    //constructor


    void getCotizacion(int numViajeros){
        if (numViajeros <= 0)
            System.out.println("Ingrese un número mayor a 0");
    }

    void reservarViaje(int numViajeros, String nombre){
        System.out.println("Reserva éxitosa");
    }



}
