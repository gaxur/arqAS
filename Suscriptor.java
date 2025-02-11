abstract class Suscriptor {
    private String nombre = "";
    public Suscriptor(String _nombre){
        this.nombre = _nombre;
    }

    String getNombre() { return this.nombre; }
    void setNombre(String nuevoNombre) {this.nombre = nuevoNombre;}
    public abstract void update();
}