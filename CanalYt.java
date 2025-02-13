import java.util.ArrayList;
import java.util.List;

abstract class CanalYt {
    protected String nombreCanal = "";

    protected List<Suscriptor> suscriptores = new ArrayList<Suscriptor>();
    public abstract void agnadirSuscriptor(Suscriptor s, EventoNotificacion evento); // attach(Observer)
    public abstract void eliminarSuscriptor(Suscriptor s); // detach(Observer)
    public abstract void notificarSuscriptores(boolean nuevoEstado, EventoNotificacion evento); // notify()
    
    public CanalYt(String nombreCanal){
        this.nombreCanal = nombreCanal;
        System.out.println("Canal de Youtube: " + nombreCanal); 
    }
}