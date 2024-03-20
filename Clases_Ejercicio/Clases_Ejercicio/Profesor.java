package tareas.Clases_Ejercicio;

public class Profesor extends Persona {
    private double sueldo;
    public Profesor(String codigo, String nombre, double sueldo) {
        super(codigo, nombre);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }
}

