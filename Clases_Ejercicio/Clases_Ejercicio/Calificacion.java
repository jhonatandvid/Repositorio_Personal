package tareas.Clases_Ejercicio;

public class Calificacion {
    private String codigoCurso;
    private String codigoAlumno;
    private double nota1;
    private double nota2;

    public Calificacion(String codigoCurso, String codigoAlumno, double nota1, double nota2) {
        this.codigoCurso = codigoCurso;
        this.codigoAlumno = codigoAlumno;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }
}