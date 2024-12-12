import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(23120560, "Enrique Orozco", "ITIC´S");

        String origen = "Universidad";
        String destino = "Casa";
        double distancia = 10.5; // km
        Ruta ruta = new Ruta(origen, destino, distancia);

        Transporte transporte = new Transporte("Autobús", ruta);
        transporte.agregarUsuario(usuario1);

        transporte.mostrarInformacion();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("informacion_transporte.txt"))) {
            writer.write(transporte.toString() + "\n");
            writer.write("Usuarios:\n");
            for (Usuario usuario : transporte.getUsuarios()) {
                writer.write("ID: " + usuario.getId() + ", Nombre: " + usuario.getNombre() + ", Carrera: " + usuario.getCarrera() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
//profe aqui le dejo mi proyecto, una disculpa por el retraso pero tuve algunas complicaciones espero me lo pueda recibir, y le comento que sinceramente use ia para ayudarme a crear el archivo porque me costo mucho