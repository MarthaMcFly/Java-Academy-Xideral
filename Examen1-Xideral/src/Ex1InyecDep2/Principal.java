package Ex1InyecDep2;

import java.util.Scanner;

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


        //Inscribir por constructor
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a inscribir a un alumno a una nueva materia optativa");
        System.out.println("Ingresa el nombre del alumno");
        String a1 = sc.nextLine();
        System.out.println("Elige la materia: \n1.DANZA\n2.DIBUJO\n3.FOTOGRAFIA\n4.MUSICA");
        int op = sc.nextInt();
        switch (op){
            case 1:
                Alumno al1 = Inyector.getAlumno("luis", Materias.DANZA);
                al1.inscribirMateria();
                break;
            case 2:
                Alumno al2 = Inyector.getAlumno("juan", Materias.DIBUJO);
                al2.inscribirMateria();
                break;
            case 3:
                Alumno al3 = Inyector.getAlumno("fernando", Materias.FOTOGRAFIA);
                al3.inscribirMateria();
                break;
            case 4:
                Alumno al4 = Inyector.getAlumno("diego", Materias.MUSICA);
                al4.inscribirMateria();
                break;
            default:
                System.out.println("No ingresó una opción válida");
        }

        //INYECTAR POR COSTRUCTOR
        /*Alumno al1 = Inyector.getAlumno("luis", Materias.DANZA);
        al1.inscribirMateria();

        Alumno al2 = Inyector.getAlumno("juan", Materias.DIBUJO);
        al2.inscribirMateria();

        Alumno al3 = Inyector.getAlumno("fernando", Materias.FOTOGRAFIA);
        al3.inscribirMateria();

        Alumno al4 = Inyector.getAlumno("diego", Materias.MUSICA);
        al4.inscribirMateria();

         */
    }

}
