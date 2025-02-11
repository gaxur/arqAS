import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Notificaciones de Youtube ");
        System.out.println(" ---------------------------- ");
        CanalYt canal = new CanalYtConcreto("Canal de Youtube de Juan");
        Suscriptor s1 = new SuscriptorConcreto(canal, "Suscriptor 1");
        Suscriptor s2 = new SuscriptorConcreto(canal, "Suscriptor 2");
        Suscriptor s3 = new SuscriptorConcreto(canal, "Suscriptor 3");
        canal.añadirSuscriptor(s1);
        canal.añadirSuscriptor(s2);
        canal.añadirSuscriptor(s3);
        canal.setState(true);
        canal.notificarSuscriptores();
        canal.setState(false);
        canal.notificarSuscriptores();
    }
}