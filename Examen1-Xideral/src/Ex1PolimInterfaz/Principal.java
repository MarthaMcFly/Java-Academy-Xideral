package Ex1PolimInterfaz;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //creamos la lista de reproducción y le ponemos un nombre:
        ListaReproducción list1 = new ListaReproducción("Música clasica");

        //agregamos canciones con el método agregar cancion
        list1.agregarCancion(new Cancion("Sinfonía no.1"));
        list1.agregarCancion(new Cancion("Sinfonía no.2"));
        list1.agregarCancion(new Cancion("Sinfonía no.3"));
        list1.agregarCancion(new Cancion("Sinfonía no.4"));
        list1.agregarCancion(new Cancion("Sinfonía no.5"));
        list1.agregarCancion(new Cancion("Sinfonía no.6"));
        list1.agregarCancion(new Cancion("Sinfonía no.7"));
        list1.agregarCancion(new Cancion("Sinfonía no.8"));

        int op;
        do {
            System.out.println("Menu:\n1.Reproducir\n2.Siguiente\n3.Repetir\n4.Pausar\n0.Apagar");

            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();
            switch (op) {
                case 1:
                    list1.reproducir();
                    break;
                case 2:
                    list1.siguiente();
                    break;
                case 3:
                    list1.repetir();
                    break;
                case 4:
                    list1.pausar();
                    break;
                default:
                    System.out.println("Saliendo del sistema de reproducción");
            }
        } while (op >= 1 && op <=4);


    }
}
