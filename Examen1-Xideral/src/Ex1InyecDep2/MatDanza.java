package Ex1InyecDep2;

public class MatDanza extends MateriaOptativa {
    String nivel;

    public MatDanza(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public void inscribir(){
        System.out.println("se ha inscrito en danza " + nivel);
    }
}