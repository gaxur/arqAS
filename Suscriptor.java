abstract class Suscriptor {
    private String nombre = "";
    public Suscriptor(String _nombre){
        this.nombre = _nombre;
    }

    public String getNombre() { return this.nombre; }
    public void setNombre(String nuevoNombre) {this.nombre = nuevoNombre;}
    public abstract void update(boolean nuevoEstado);
    public abstract void setEvento(EventoNotificacion evento);
    public abstract EventoNotificacion getEvento();
}