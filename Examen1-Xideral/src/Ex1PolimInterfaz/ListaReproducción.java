package Ex1PolimInterfaz;

import java.util.ArrayList;
import java.util.List;

public class ListaReproducción {
    //atributos
    private String nombre;

    //lista para guardar las canciones:
    private List<Cancion> listaRepr = new ArrayList<>();
    private int numeroCancion = 0;

    //constructor
    public ListaReproducción(String nombre) {
        this.nombre = nombre;
    }

    //método para agregar canciones a la lista
    public void agregarCancion(Cancion cancion){
        listaRepr.add(cancion);
    }

    public void reproducir() {
        Cancion cancion = listaRepr.get(numeroCancion);
        cancion.reproducirCancion();
    }

    public void siguiente(){
        System.out.println("Saltando la canción actual");
        if(numeroCancion < listaRepr.size())
            listaRepr.get(numeroCancion++).reproducirCancion();
        else
            listaRepr.get(0).reproducirCancion();
    }

    public void repetir(){
        System.out.println("Repitiendo la cancion" + listaRepr.get(numeroCancion-1).getNombre());
    }

    public void pausar(){
        System.out.println("Se detuvo la lista de reproduccion en la cancion " + listaRepr.get(numeroCancion-1).getNombre());

    }

}
