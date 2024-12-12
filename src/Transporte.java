import java.util.ArrayList;

public class Transporte {
    private String tipo;
    private final ArrayList<Usuario> usuarios;
    private Ruta ruta;

    public Transporte(String tipo, Ruta ruta) {
        this.tipo = tipo;
        this.usuarios = new ArrayList<>();
        this.ruta = ruta;
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public int contarUsuarios() {
        return usuarios.size();
    }

    public double estimarTiempoLlegada() {
        // Supongamos que la velocidad promedio es de 60 km/h
        double velocidadPromedio = 60.0; // km/h
        return ruta.getDistancia() / velocidadPromedio * 60; // tiempo en minutos
    }

    public void mostrarInformacion() {
        System.out.println("Transporte: " + tipo);
        System.out.println("Número de usuarios: " + contarUsuarios());
        System.out.println("Tiempo estimado de llegada: " + estimarTiempoLlegada() + " minutos");
        ruta.ubicacion();
    }

    @Override
    public String toString() {
        return "Transporte: " + tipo + "\nNúmero de usuarios: " + contarUsuarios() + "\nTiempo estimado de llegada: " + estimarTiempoLlegada() + " minutos\nRuta: " + ruta.getOrigen() + " a " + ruta.getDestino() + " (" + ruta.getDistancia() + " km)";
    }
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
}
}
