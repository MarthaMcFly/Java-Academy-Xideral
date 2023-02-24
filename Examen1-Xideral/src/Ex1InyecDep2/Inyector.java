package Ex1InyecDep2;

public class Inyector {
    static MateriaOptativa matDibujo = new MatDibujo("basico");
    static MateriaOptativa matDanza = new MatDanza("intermedio");
    static MateriaOptativa matMusica = new MatMusica("avanzado");

    static MateriaOptativa matFoto = new MatMusica("avanzado");

    //INYECCIÓN DE DEPENDENCIAS POR CONSTRUCTOR
    static Alumno getAlumno(String nombre, Materias materia){
        Alumno al;

        switch (materia){
            case DIBUJO:
                al = new Alumno(nombre,matDibujo);
                break;
            case DANZA:
                al = new Alumno(nombre,matDanza);
                break;
            case FOTOGRAFIA:
                al = new Alumno(nombre,matFoto);
            default:
                al = new Alumno(nombre,matMusica);
                break;
        }
        return al;

    }


    //INYECCIÓN DE DEPENDENCIAS POR SETTERS A LA CLASE ALUMNO
    /*
    static void inyectarDibujo(Alumno al){
        al.setMateriaOptativa(matDibujo);
    }
    static void inyectarDanza(Alumno al){
        al.setMateriaOptativa(matDanza);
    }

    static void inyectarMusica(Alumno al){
        al.setMateriaOptativa(matDanza);
    }

    static void inyectarMusica(Alumno al){
        al.setMateriaOptativa(matFoto);
    }
    */


}
