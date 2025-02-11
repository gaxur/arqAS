public class CanalYtConcreto extends CanalYt {
    private boolean videoNuevo = false; // realmente no hace falta
    private String nombreCanal = "";
    
    @Override
    void añadirSuscriptor(Suscriptor s){
        suscriptores.add(s);
    }
    
    @Override
    void eliminarSuscriptor(Suscriptor s){
        suscriptores.remove(s);
    }
    
    @Override
    void notificarSuscriptores(){
        for(Suscriptor s : suscriptores){
            s.update();
        }
    }
    
    CanalYt(String nombreCanal){
        super(nombreCanal);
        this.videoNuevo = false;
    }

    boolean getState() {
        return this.videoNuevo;
    }

    void setState(boolean newState) {
        this.videoNuevo = newState;
    }
}

