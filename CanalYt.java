import java.util.ArrayList;
import java.util.List;

abstract class CanalYt {
    private String nombreCanal = "";

    private List<Suscriptor> suscriptores = new ArrayList<Suscriptor>();
    public abstract void añadirSuscriptor(Suscriptor s); // attach(Observer)
    public abstract void eliminarSuscriptor(Suscriptor s); // detach(Observer)
    public abstract void notificarSuscriptores(); // notify()
    
    public CanalYt(String nombreCanal){
        this.nombreCanal = nombreCanal;
        System.out.println("Canal de Youtube: " + nombreCanal); 
    }
}