package Ex1InyecDep2;

public class MatFoto extends MateriaOptativa {
    String nivel;

    public MatFoto(String nivel) {
        this.nivel = nivel;
    }
    @Override
    public void inscribir(){
        System.out.println("se ha inscrito en fotografía " + nivel);
    }
}
