package tareas.Clases_Ejercicio;

public class Alumno extends Persona {
    private String carrera;

    public Alumno(String codigo, String nombre, String carrera) {
        super(codigo, nombre);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }
}