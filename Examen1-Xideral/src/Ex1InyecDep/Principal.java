package Ex1InyecDep;

public class Principal {
    public static void main(String[] args) {
        //INYECTAR POR SETTER
        /*
        Alumno al1 = new Alumno("luis");
        Inyector.inyectarDanza(al1);
        al1.inscribirMateria();

        Alumno al2 = new Alumno("juan");
        Inyector.inyectarDibujo(al2);
        al2.inscribirMateria();

        Alumno al3 = new Alumno("mar");
        Inyector.inyectarMusica(al3);
        al3.inscribirMateria();

        Alumno al4 = new Alumno("fer");
        Inyector.inyectarFoto(al4);
        al4.inscribirMateria();


         */

        //INYECTAR POR COSTRUCTOR
        Alumno al1 = Inyector.getAlumno("luis",Materias.DANZA);
        al1.inscribirMateria();

        Alumno al2 = Inyector.getAlumno("juan",Materias.DIBUJO);
        al2.inscribirMateria();

        Alumno al3 = Inyector.getAlumno("fernando",Materias.FOTOGRAFIA);
        al3.inscribirMateria();

        Alumno al4 = Inyector.getAlumno("diego", Materias.MUSICA);
    }

}
