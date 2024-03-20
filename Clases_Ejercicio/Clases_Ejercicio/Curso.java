package tareas.Clases_Ejercicio;
import java.util.List;
import java.util.ArrayList;

public class Curso {
    private String codigo;
    private String nombre;
    private String codigoDocente;
    private List<Alumno> alumnos;

    public Curso(String codigo, String nombre, String codigoDocente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.codigoDocente = codigoDocente;
        this.alumnos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigoDocente() {
        return codigoDocente;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void inscribirAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }
}
