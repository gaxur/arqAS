public class CanalYtConcreto extends CanalYt {
    private boolean canalState = false;
    
    @Override
    public void agnadirSuscriptor(Suscriptor s, EventoNotificacion evento){
        suscriptores.add(s);
        s.setEvento(evento);
        System.out.println(s.getNombre() + " se ha suscrito a: " + this.nombreCanal);
    }
    
    @Override
    public void eliminarSuscriptor(Suscriptor s){
        suscriptores.remove(s);
        System.out.println(s.getNombre() + " se ha desuscrito de: " + this.nombreCanal);
    }
    
    @Override
    public void notificarSuscriptores(boolean nuevoEstado, EventoNotificacion evento){
        boolean nadie = false;
        for(Suscriptor s : suscriptores){
            if (evento == s.getEvento()){
                s.update(nuevoEstado);
                nadie = true;
            }
        }
        if (! nadie) {System.out.println("En este canal no hay nadie interesado en ese tipo de notificaciones");}
    }
    
    public CanalYtConcreto(String nombreCanal){
        super(nombreCanal);
        this.canalState = false;
    }

    public boolean getState() {
        return this.canalState;
    }

    public void setState(boolean newState, EventoNotificacion evento) {
        this.canalState = newState;
        notificarSuscriptores(newState,evento);
    }

}

