package tareas.Clases_Ejercicio;

public class Main {
    public static void main(String[] argv){
        Profesor profesor = new Profesor("prof515195", "Juan Perez", 2500.00);

        Alumno alumno1 = new Alumno("SIS12345678", "Pedro Rodriguez", "Ingeniería de Sistemas");
        Alumno alumno2 = new Alumno("ICO87654321", "Maria Lopez", "Ingeniería Comercial");
        Alumno alumno3 = new Alumno("SIS98765432", "Luis Martinez", "Ingeniería de Sistemas");
        Alumno alumno4 = new Alumno("ICO13579246", "Ana Garcia", "Ingeniería Comercial");
        Alumno alumno5 = new Alumno("SIS24681357", "Carlos Ramirez", "Ingeniería de Sistemas");
        Alumno alumno6 = new Alumno("ICO57931468", "Laura Fernandez", "Ingeniería Comercial");
        Alumno alumno7 = new Alumno("SIS13579246", "Martina Diaz", "Ingeniería de Sistemas");
        Alumno alumno8 = new Alumno("ICO24681357", "Javier Gomez", "Ingeniería Comercial");
        Alumno alumno9 = new Alumno("SIS57931468", "Carolina Soto", "Ingeniería de Sistemas");
        Alumno alumno10 = new Alumno("ICO12345678", "Fernando Torres", "Ingeniería Comercial");

        CursoPresencial cursoPresencial = new CursoPresencial("CP001", "Matemáticas", profesor.getCodigo(), "Lunes y Miércoles, 9:00 - 11:00");
        CursoDistancia cursoDistancia = new CursoDistancia("CD001", "Programación", profesor.getCodigo());

        //intercalado xd
        cursoPresencial.inscribirAlumno(alumno1);
        cursoPresencial.inscribirAlumno(alumno3);
        cursoPresencial.inscribirAlumno(alumno5);
        cursoPresencial.inscribirAlumno(alumno7);
        cursoPresencial.inscribirAlumno(alumno9);

        cursoDistancia.inscribirAlumno(alumno2);
        cursoDistancia.inscribirAlumno(alumno4);
        cursoDistancia.inscribirAlumno(alumno6);
        cursoDistancia.inscribirAlumno(alumno8);
        cursoDistancia.inscribirAlumno(alumno10);

        System.out.println("Curso Presencial:");
        System.out.println("Código: " + cursoPresencial.getCodigo());
        System.out.println("Nombre: " + cursoPresencial.getNombre());
        System.out.println("Horario: " + cursoPresencial.getHorario());
        System.out.println("Docente: " + profesor.getNombre());
        System.out.println("Alumnos inscritos:");
        for (Alumno alumno : cursoPresencial.getAlumnos()) {
            System.out.println(alumno.getNombre() + " - " + alumno.getCarrera());
        }

        System.out.println("\nCurso a Distancia:");
        System.out.println("Código: " + cursoDistancia.getCodigo());
        System.out.println("Nombre: " + cursoDistancia.getNombre());
        System.out.println("Docente: " + profesor.getNombre());
        System.out.println("Alumnos inscritos:");
        for (Alumno alumno : cursoDistancia.getAlumnos()) {
            System.out.println(alumno.getNombre() + " - " + alumno.getCarrera());
        }
    }
}
