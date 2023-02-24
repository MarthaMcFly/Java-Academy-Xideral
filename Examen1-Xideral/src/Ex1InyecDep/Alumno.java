package Ex1InyecDep;

public class Alumno {
    private String nombre;
    private MateriaOptativa materiaOptativa;

    //CONSTRUCTOR PARA INYECTAR DEPENDENCIA:
    public Alumno(String nombre, MateriaOptativa materiaOptativa) {
        this.nombre = nombre;
        this.materiaOptativa = materiaOptativa;
    }

    //metodo para inscribir materias
    void inscribirMateria(){
        System.out.println(nombre);
        materiaOptativa.inscribir();
    }

    //setter a Materia Optativa para setearlo mediante el inyector
    public void setMateriaOptativa(MateriaOptativa materiaOptativa) {
        this.materiaOptativa = materiaOptativa;
    }
}
