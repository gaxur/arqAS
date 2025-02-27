public class SuscriptorConcreto extends Suscriptor {
    private CanalYtConcreto CanalYoutube;
    private boolean suscriptorState = false;
    private EventoNotificacion eventoSuscriptor;

    // Constructor de la clase SuscriptorConcreto
    public SuscriptorConcreto(CanalYtConcreto _CanalYoutube, String _nombre){
        super(_nombre);
        this.CanalYoutube = _CanalYoutube;
    }

    // Printea el evento de notificación
    public String printEvento(EventoNotificacion e) {
        if(e == EventoNotificacion.NUEVO_VIDEO){
            return "Nuevo Video";
        } else if(e == EventoNotificacion.EN_VIVO){
            return "Transmisión en Vivo";
        } else {
            return "Anuncio Importante";
        }
    }

    // Actualiza el estado del suscriptor
    @Override
    public void update(boolean nuevoEstado){
        System.out.println(this.getNombre() + " ha recibido una notificación.");
        if (nuevoEstado) {
            System.out.println(this.getNombre() + " ha consultado: ¡ " + this.printEvento(this.getEvento()) + " disponible !");
        } else {
            System.out.println(this.getNombre() + " ha consultado: No hay " + this.printEvento(this.getEvento()) + ".");
        }
        suscriptorState = suscriptorState == nuevoEstado ? suscriptorState : nuevoEstado;
    }

    // Getters y Setters
    @Override
    public void setEvento(EventoNotificacion evento){
        this.eventoSuscriptor = evento;
    }

    @Override
    public EventoNotificacion getEvento(){
        return this.eventoSuscriptor;
    }
}