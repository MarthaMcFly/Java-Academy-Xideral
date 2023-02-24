package Ex1Polimorfismo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, ingresa tu nombre");
        String nombre = sc.nextLine();

        System.out.println("Bienvenido a nuestro sistema de reservación " + nombre);
        System.out.println("Te ayudarémos a elegir tu viaje y realizar una reservación");
        System.out.println("Elige el viaje que deseas realizar\n" +
                "1. Los Cabos\n2.Cancun \n3.Tokio \n4.Nueva York");
        int op = sc.nextInt();
            Viaje v = new Viaje();

        switch (op){
            case 1:
                 v = new ViajeLosCabos();
                break;
            case 2:
                 v = new ViajeCancun();
                break;
            case 3:
                 v = new ViajeTokio();
                break;
            case 4:
                 v = new ViajeNewYork();
                 break;
            default:
                System.out.println("No ingresó una opción válida");
        }

        System.out.println("Para cotizar tu viaje a ingresa la cantidad de personas");
        int numViajeros = sc.nextInt();
        v.getCotizacion(numViajeros);

        System.out.println("Para reservar el viaje presiona 1, para salir del sistema de reserva presiona 0");
        op= sc.nextInt();

        if (op == 1)
            v.reservarViaje(numViajeros, nombre);
        else
            System.out.println("Haz salido del sistema");





    }
}
