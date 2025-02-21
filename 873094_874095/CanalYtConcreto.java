public class CanalYtConcreto extends CanalYt {
    private boolean canalState = false;
    
    // Se añade un suscriptor a la lista de suscriptores del canal de Youtube
    @Override
    public void agnadirSuscriptor(Suscriptor s, EventoNotificacion evento){
        suscriptores.add(s);
        s.setEvento(evento);
        System.out.println(s.getNombre() + " se ha suscrito a: " + this.nombreCanal);
    }
    
    // Se elimina un suscriptor de la lista de suscriptores del canal de Youtube
    @Override
    public void eliminarSuscriptor(Suscriptor s){
        suscriptores.remove(s);
        System.out.println(s.getNombre() + " se ha desuscrito de: " + this.nombreCanal);
    }
    
    // Se notifica a los suscriptores del canal de Youtube
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
    
    // Constructor de la clase CanalYtConcreto
    public CanalYtConcreto(String nombreCanal){
        super(nombreCanal);
        this.canalState = false;
    }

    // Getters y Setters
    public boolean getState() {
        return this.canalState;
    }

    public void setState(boolean newState, EventoNotificacion evento) {
        this.canalState = newState;
        notificarSuscriptores(newState,evento);
    }

    // Método para liberar recursos de un Canal de Youtube
    @Override
    public void close() {
        System.out.println("El canal de YouTube: " + nombreCanal + " ha sido eliminado.");
        System.out.println("Liberando suscriptores...");
        suscriptores.clear();  // Elimina todos los suscriptores
    }
}

