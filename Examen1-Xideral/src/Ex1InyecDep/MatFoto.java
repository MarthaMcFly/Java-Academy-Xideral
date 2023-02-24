package Ex1InyecDep;

public class MatFoto extends MateriaOptativa{
    String nivel;

    public MatFoto(String nivel) {
        this.nivel = nivel;
    }
    @Override
    public void inscribir(){
        System.out.println("inscribir fotografía " + nivel);
    }
}
