package Ex1Singleton;

public class ListaReproduccion {
    //creamos el atributo del mismo tipo de la clase
    private static ListaReproduccion listaReproduccion;

    //podemos el constructor privado para evitar crear instancias de la clase
    private  ListaReproduccion() {

    }

    //método statico para acceder al constructor y crear una unica instancia
    //el método evalúa si ya existe la instancia de esa clase, si no existe crea el objeto
    //si ya existe regresa el objeto previamente creado.
    public static ListaReproduccion getInstancia(){
        if(listaReproduccion == null){
            listaReproduccion = new ListaReproduccion();
        }
        return listaReproduccion;
    }



}
