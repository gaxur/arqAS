public class CanalYtConcreto2 extends CanalYt {
    private boolean nuevoDirecto = false;
    
    @Override
    public void agnadirSuscriptor(Suscriptor s){
        suscriptores.add(s);
        System.out.println(s.getNombre() + " se ha suscrito a: " + this.nombreCanal);
    }
    
    @Override
    public void eliminarSuscriptor(Suscriptor s){
        suscriptores.remove(s);
        System.out.println(s.getNombre() + " se ha desuscrito de: " + this.nombreCanal);
    }
    
    @Override
    public void notificarSuscriptores(){
        for(Suscriptor s : suscriptores){
            s.update();
        }
    }
    
    public CanalYtConcreto2(String nombreCanal){
        super(nombreCanal);
        this.nuevoDirecto = false;
    }

    public boolean getState() {
        return this.nuevoDirecto;
    }

    public void setState(boolean newState) {
        this.nuevoDirecto = newState;
        notificarSuscriptores();
    }
}
