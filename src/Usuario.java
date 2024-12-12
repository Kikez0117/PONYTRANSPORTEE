public class Usuario {
    private int id;
    private String nombre;
    private String carrera;
    private Ruta ruta;

    public Usuario(int id, String nombre, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public void ubicacion() {
        ruta.ubicacion();
    }
}