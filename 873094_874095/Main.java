import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Notificaciones de Youtube ");
        System.out.println(" --------------------------------------------------------------------");
        // Se crean los canales de Youtube Concretos -> canalJuan y canalFutbol
        CanalYtConcreto canalJuan = new CanalYtConcreto("Canal de Youtube de Juan");
        CanalYtConcreto canalFutbol = new CanalYtConcreto("Canal de Noticias de Futbol");
        // Se crean los suscriptores -> s1, s2, s3 (referidos a canalJuan), s4 y s5 (referidos a canalFutbol)
        Suscriptor s1 = new SuscriptorConcreto(canalJuan, "Suscriptor 1");
        Suscriptor s2 = new SuscriptorConcreto(canalJuan, "Suscriptor 2");
        Suscriptor s3 = new SuscriptorConcreto(canalJuan, "Suscriptor 3");
        Suscriptor s4 = new SuscriptorConcreto(canalFutbol, "Cristiano Ronaldo");
        Suscriptor s5 = new SuscriptorConcreto(canalFutbol, "Arda Guler");
        // Se agregan los suscriptores s1, s2, s3 al canalJuan con un cierto grupo de interes (EventoNotificacion)
        canalJuan.agnadirSuscriptor(s1, EventoNotificacion.NUEVO_VIDEO);
        canalJuan.agnadirSuscriptor(s2, EventoNotificacion.EN_VIVO);
        canalJuan.agnadirSuscriptor(s3, EventoNotificacion.ANUNCIO_IMPORTANTE);
        System.out.println(" --------------------------------------------------------------------");
        // Se agregan los suscriptores s4, s5 al canalFutbol con un cierto grupo de interes (EventoNotificacion)
        canalFutbol.agnadirSuscriptor(s4, EventoNotificacion.NUEVO_VIDEO);
        canalFutbol.agnadirSuscriptor(s5, EventoNotificacion.ANUNCIO_IMPORTANTE);
        System.out.println(" --------------------------------------------------------------------");
        // Se establece el nuevo estado como false (no hay nuevo video) en el canalFutbol
        canalFutbol.setState(false, EventoNotificacion.NUEVO_VIDEO);
        // Se elimina el suscriptor s5 del canalFutbol
        canalFutbol.eliminarSuscriptor(s5);
        System.out.println(" --------------------------------------------------------------------");
        // Se establece el nuevo estado como true (hay nuevo anuncio importante) en el canalJuan
        canalJuan.setState(true, EventoNotificacion.ANUNCIO_IMPORTANTE);
        System.out.println(" --------------------------------------------------------------------");
        // Se elimina el suscriptor s3 del canalJuan
        canalJuan.eliminarSuscriptor(s3);
        // Se establece el nuevo estado como false (no hay anuncio importante) en el canalJuan
        canalJuan.setState(false, EventoNotificacion.ANUNCIO_IMPORTANTE);
        System.out.println(" --------------------------------------------------------------------");
        // Se establece el nuevo estado como true (hay nuevo video) en el canalFutbol
        canalFutbol.setState(true, EventoNotificacion.NUEVO_VIDEO);
        // Eliminar un canal de Youtube (canalJuan)
        canalJuan.close();
    }
}