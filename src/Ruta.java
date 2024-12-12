public class Ruta {
    private String origen;
    private String destino;
    private double distancia;

    public Ruta(String origen, String destino, double distancia) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void ubicacion() {
        System.out.println("La ruta es desde " + origen + " hasta " + destino + " con una distancia de " + distancia + " km");
    }
}