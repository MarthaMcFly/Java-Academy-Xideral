package Ex1PolimInterfaz;

public class Cancion {
    private String nombre;

    //Constructor:
    public Cancion(String nombre) {
        this.nombre = nombre;
    }

    void reproducirCancion(){
        System.out.println("Reproduciendo la canción" + nombre);
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
