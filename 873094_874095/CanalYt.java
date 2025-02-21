import java.util.ArrayList;
import java.util.List;

abstract class CanalYt implements AutoCloseable {
    protected String nombreCanal = "";

    // Lista de suscriptores
    protected List<Suscriptor> suscriptores = new ArrayList<Suscriptor>();
    public abstract void agnadirSuscriptor(Suscriptor s, EventoNotificacion evento); // attach(Observer)
    public abstract void eliminarSuscriptor(Suscriptor s); // detach(Observer)
    public abstract void notificarSuscriptores(boolean nuevoEstado, EventoNotificacion evento); // notify()
    
    // Constructor de la clase CanalYt
    public CanalYt(String nombreCanal){
        this.nombreCanal = nombreCanal;
        System.out.println("Canal de Youtube: " + nombreCanal); 
    }

    // Método para liberar recursos de un canal de Youtube
    @Override
    public void close() {
        System.out.println("El canal de YouTube: " + nombreCanal + " ha sido eliminado.");
        System.out.println("Liberando suscriptores...");
        suscriptores.clear();  // Elimina todos los suscriptores
    }
}