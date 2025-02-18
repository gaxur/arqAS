abstract class Suscriptor {
    private String nombre = "";
    public Suscriptor(String _nombre){
        this.nombre = _nombre;
    }

    //Devuelve el nombre del Suscriptor
    public String getNombre() { return this.nombre; }

    //Actualiza el nombre del suscriptor
    public void setNombre(String nuevoNombre) {this.nombre = nuevoNombre;}

    //Actualiza el estado actual del suscriptor
    public abstract void update(boolean nuevoEstado);

    //Actualiza el evento al que esta asociado el suscriptor
    public abstract void setEvento(EventoNotificacion evento);

    //Devuelve el evento al que esta asociado el suscriptor
    public abstract EventoNotificacion getEvento();
}