public class persona {
    private int id;
    private String nom;
    private String ape;
    private String fecha;

    public persona(int id, String nombre, String apellido, String fecha) {
        this.id = id;
        this.nom = nombre;
        this.ape = apellido;
        this.fecha = fecha;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nom;
    }

    public void setNombre(String nombre) {
        this.nom = nombre;
    }

    public String getApellido() {
        return ape;
    }

    public void setApellido(String apellido) {
        this.ape = apellido;
    }

    public String getFechaDeNacimiento() {
        return fecha;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fecha = fechaDeNacimiento;
    }
}