package Ex1InyecDep2;

public class MatMusica extends MateriaOptativa {
    String nivel;

    public MatMusica(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public void inscribir(){
        System.out.println("se ha inscrito en musica " + nivel );
    }

}
