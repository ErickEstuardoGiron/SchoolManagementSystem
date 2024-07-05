public class Estudiante extends persona {
    public enum Estado {
        MATRICULADO, INACTIVO, GRADUADO
    }

    private Estado estado;

    public Estudiante(int id, String nombre, String apellido, String fecha, Estado estado) {
        super(id, nombre, apellido, fecha);
        this.estado = estado;
    }

    // Getters y setters
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}