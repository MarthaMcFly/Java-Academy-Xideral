package Ex1InyecDep;

public class MatDanza extends MateriaOptativa{
    String nivel;

    public MatDanza(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public void inscribir(){
        System.out.println("inscribir danza " + nivel);
    }
}