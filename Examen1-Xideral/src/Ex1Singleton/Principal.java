package Ex1Singleton;

public class Principal {
    public static void main(String[] args) {
        //Vemos que no podemos acceder a la listaReproduccion por el constructor
        //ListaReproduccion lista = new ListaReproduccion();

        //Accedemos al método getInstancia() para crear el objeto de la clase
        ListaReproduccion list = ListaReproduccion.getInstancia();


    }
}
