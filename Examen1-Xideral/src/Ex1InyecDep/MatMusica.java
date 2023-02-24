package Ex1InyecDep;

public class MatMusica extends MateriaOptativa {
    String nivel;

    public MatMusica(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public void inscribir(){
        System.out.println("inscribir musica " + nivel );
    }

}
