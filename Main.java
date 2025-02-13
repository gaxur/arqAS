import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Notificaciones de Youtube ");
        System.out.println(" --------------------------------------------------------------------");
        CanalYtConcreto canalJuan = new CanalYtConcreto("Canal de Youtube de Juan");
        CanalYtConcreto canalFutbol = new CanalYtConcreto("Canal de Noticias de Futbol");
        Suscriptor s1 = new SuscriptorConcreto(canalJuan, "Suscriptor 1");
        Suscriptor s2 = new SuscriptorConcreto(canalJuan, "Suscriptor 2");
        Suscriptor s3 = new SuscriptorConcreto(canalJuan, "Suscriptor 3");
        Suscriptor s4 = new SuscriptorConcreto(canalFutbol, "Cristiano Ronaldo");
        Suscriptor s5 = new SuscriptorConcreto(canalFutbol, "Arda Guler");
        canalJuan.agnadirSuscriptor(s1, EventoNotificacion.NUEVO_VIDEO);
        canalJuan.agnadirSuscriptor(s2, EventoNotificacion.EN_VIVO);
        canalJuan.agnadirSuscriptor(s3, EventoNotificacion.ANUNCIO_IMPORTANTE);
        System.out.println(" --------------------------------------------------------------------");
        canalFutbol.agnadirSuscriptor(s4, EventoNotificacion.NUEVO_VIDEO);
        canalFutbol.agnadirSuscriptor(s5, EventoNotificacion.ANUNCIO_IMPORTANTE);
        System.out.println(" --------------------------------------------------------------------");
        canalFutbol.setState(false, EventoNotificacion.NUEVO_VIDEO);
        canalFutbol.eliminarSuscriptor(s5);
        System.out.println(" --------------------------------------------------------------------");
        canalJuan.setState(true, EventoNotificacion.ANUNCIO_IMPORTANTE);
        System.out.println(" --------------------------------------------------------------------");
        canalJuan.eliminarSuscriptor(s3);
        canalJuan.setState(false, EventoNotificacion.ANUNCIO_IMPORTANTE);
        System.out.println(" --------------------------------------------------------------------");
        canalFutbol.setState(true, EventoNotificacion.NUEVO_VIDEO);   
    }
}