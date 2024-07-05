public class Curso {
    private int id;
    private String nombre;
    private String desc;
    private int numcreditos;

    public Curso(int id, String nombre, String desc, int numcreditos) {
        this.id = id;
        this.nombre = nombre;
        this.desc = desc;
        this.numcreditos = numcreditos;

    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return desc;
    }

    public void setDescripcion(String descripcion) {
        this.desc = descripcion;
    }

    public int getNumeroCreditos() {
        return numcreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numcreditos = numeroCreditos;
    }
}