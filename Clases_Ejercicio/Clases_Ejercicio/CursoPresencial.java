package tareas.Clases_Ejercicio;

public class CursoPresencial extends Curso {
    private String horario;

    public CursoPresencial(String codigo, String nombre, String codigoDocente, String horario) {
        super(codigo, nombre, codigoDocente);
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }
}
