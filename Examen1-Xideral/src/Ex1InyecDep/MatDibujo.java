package Ex1InyecDep;

public class MatDibujo extends MateriaOptativa {
    String nivel;

    public MatDibujo(String nivel){
        this.nivel = nivel;
    }

    @Override
    public void inscribir(){
        System.out.println("inscribir dibujo " + nivel );
    }
}
