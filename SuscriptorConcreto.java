public class SuscriptorConcreto extends Suscriptor {
    private CanalYt CanalYoutube;
    private boolean suscriptorState = false;

    public Suscriptor(CanalYt _CanalYoutube, String _nombre){
        super(_nombre);
        this.CanalYoutube = _CanalYoutube;
    }


    @Override
    void update(CanalYt CanalYoutube){
        System.out.println(nombre + " ha sido notificado sobre un nuevo video");
        if (canal.getState()) {
            System.out.println(nombre + " ha consultado: ¡Nuevo video disponible!");
        } else {
            System.out.println(nombre + " ha consultado: No hay nuevos videos.");
        }
        suscriptorState = CanalYoutube.getState();
    }
}