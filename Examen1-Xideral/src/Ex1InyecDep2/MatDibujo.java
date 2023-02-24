package Ex1InyecDep2;

public class MatDibujo extends MateriaOptativa {
    String nivel;

    public MatDibujo(String nivel){
        this.nivel = nivel;
    }

    @Override
    public void inscribir(){
        System.out.println("se ha inscrito en dibujo " + nivel );
    }
}
