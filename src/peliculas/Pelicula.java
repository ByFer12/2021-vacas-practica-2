package src.peliculas;

public class Pelicula {
    private int id;
    private int año;
    private String nombre;
    private String categoria;

    public Pelicula(int id, int año, String nombre, String categoria) {
        this.id = id;
        this.año = año;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public int getId() {
        return this.id;
    }

    public int getAño() {
        return this.año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String mostrarDatos() {
        return "id: " + id + " Nombre: " + nombre+" Categoría: "+categoria;
    }

}
